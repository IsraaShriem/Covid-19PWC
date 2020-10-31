package com.example.covid_19pwc.network

import com.example.covid_19pwc.utils.CurlPrinter
import okhttp3.Interceptor
import okhttp3.Response
import okio.Buffer
import java.io.IOException
import java.nio.charset.Charset

class CurlLoggerInterceptor : Interceptor {
    private var curlCommandBuilder: StringBuilder? = null
    private val UTF8 = Charset.forName("UTF-8")
    private var tag: String? = null

    constructor()

    /**
     * Set logcat tag for curl lib to make it ease to filter curl logs only.
     * @param tag
     */
    constructor(tag: String) {
        this.tag = tag
    }


    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()

        curlCommandBuilder = StringBuilder("")
        // add cURL command
        curlCommandBuilder!!.append("cURL ")
        curlCommandBuilder!!.append("-X ")
        // add method
        curlCommandBuilder!!.append(request.method().toUpperCase() + " ")
        // adding headers
        for (headerName in request.headers().names()) {
            addHeader(headerName, request.headers().get(headerName))
        }

        // adding request body
        val requestBody = request.body()
        if (request.body() != null) {
            val buffer = Buffer()
            requestBody!!.writeTo(buffer)
            var charset: Charset? = UTF8
            val contentType = requestBody.contentType()
            if (contentType != null) {
                //addHeader("Content-Type", request.body().contentType().toString());
                charset = contentType.charset(UTF8)
                curlCommandBuilder!!.append(" -d '" + buffer.readString(charset!!) + "'")
            }
        }

        // add request URL
        curlCommandBuilder!!.append(" \"" + request.url().toString() + "\"")
        curlCommandBuilder!!.append(" -L")

        CurlPrinter.print(tag, request.url().toString(), curlCommandBuilder!!.toString())
        return chain.proceed(request)
    }

    private fun addHeader(headerName: String, headerValue: String?) {
        curlCommandBuilder!!.append("-H \"$headerName: $headerValue\" ")
    }
}