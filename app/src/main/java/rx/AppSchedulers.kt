package rx

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class AppSchedulers {
    fun getIoScheduler() = Schedulers.io()

    fun getAndroidScheduler() = AndroidSchedulers.mainThread()
}
