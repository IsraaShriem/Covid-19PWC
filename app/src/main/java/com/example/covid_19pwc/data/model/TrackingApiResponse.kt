package com.example.covid_19pwc.data.model


import com.google.gson.annotations.SerializedName

data class TrackingApiResponse(
    @SerializedName("dates")
    val dates: Dates,
    @SerializedName("metadata")
    val metadata: Metadata,
    @SerializedName("total")
    val total: Total,
    @SerializedName("updated_at")
    val updatedAt: String
) {
    data class Dates(
        @SerializedName("2020-10-20")
        val x20201020: X20201020
    ) {
        data class X20201020(
            @SerializedName("countries")
            val countries: Countries,
            @SerializedName("info")
            val info: Info
        ) {
            data class Countries(
                @SerializedName("Afghanistan")
                val afghanistan: Afghanistan,
                @SerializedName("Albania")
                val albania: Albania,
                @SerializedName("Algeria")
                val algeria: Algeria,
                @SerializedName("Andorra")
                val andorra: Andorra,
                @SerializedName("Angola")
                val angola: Angola,
                @SerializedName("Antigua and Barbuda")
                val antiguaAndBarbuda: AntiguaAndBarbuda,
                @SerializedName("Argentina")
                val argentina: Argentina,
                @SerializedName("Armenia")
                val armenia: Armenia,
                @SerializedName("Australia")
                val australia: Australia,
                @SerializedName("Austria")
                val austria: Austria,
                @SerializedName("Azerbaijan")
                val azerbaijan: Azerbaijan,
                @SerializedName("Bahamas")
                val bahamas: Bahamas,
                @SerializedName("Bahrain")
                val bahrain: Bahrain,
                @SerializedName("Bangladesh")
                val bangladesh: Bangladesh,
                @SerializedName("Barbados")
                val barbados: Barbados,
                @SerializedName("Belarus")
                val belarus: Belarus,
                @SerializedName("Belgium")
                val belgium: Belgium,
                @SerializedName("Belize")
                val belize: Belize,
                @SerializedName("Benin")
                val benin: Benin,
                @SerializedName("Bhutan")
                val bhutan: Bhutan,
                @SerializedName("Bolivia")
                val bolivia: Bolivia,
                @SerializedName("Bosnia and Herzegovina")
                val bosniaAndHerzegovina: BosniaAndHerzegovina,
                @SerializedName("Botswana")
                val botswana: Botswana,
                @SerializedName("Brazil")
                val brazil: Brazil,
                @SerializedName("Brunei")
                val brunei: Brunei,
                @SerializedName("Bulgaria")
                val bulgaria: Bulgaria,
                @SerializedName("Burkina Faso")
                val burkinaFaso: BurkinaFaso,
                @SerializedName("Burma")
                val burma: Burma,
                @SerializedName("Burundi")
                val burundi: Burundi,
                @SerializedName("Cabo Verde")
                val caboVerde: CaboVerde,
                @SerializedName("Cambodia")
                val cambodia: Cambodia,
                @SerializedName("Cameroon")
                val cameroon: Cameroon,
                @SerializedName("Canada")
                val canada: Canada,
                @SerializedName("Central African Republic")
                val centralAfricanRepublic: CentralAfricanRepublic,
                @SerializedName("Chad")
                val chad: Chad,
                @SerializedName("Chile")
                val chile: Chile,
                @SerializedName("China")
                val china: China,
                @SerializedName("Colombia")
                val colombia: Colombia,
                @SerializedName("Comoros")
                val comoros: Comoros,
                @SerializedName("Congo (Brazzaville)")
                val congoBrazzaville: CongoBrazzaville,
                @SerializedName("Congo (Kinshasa)")
                val congoKinshasa: CongoKinshasa,
                @SerializedName("Costa Rica")
                val costaRica: CostaRica,
                @SerializedName("Cote d'Ivoire")
                val coteDIvoire: CoteDIvoire,
                @SerializedName("Croatia")
                val croatia: Croatia,
                @SerializedName("Cuba")
                val cuba: Cuba,
                @SerializedName("Cyprus")
                val cyprus: Cyprus,
                @SerializedName("Czechia")
                val czechia: Czechia,
                @SerializedName("Denmark")
                val denmark: Denmark,
                @SerializedName("Diamond Princess")
                val diamondPrincess: DiamondPrincess,
                @SerializedName("Djibouti")
                val djibouti: Djibouti,
                @SerializedName("Dominica")
                val dominica: Dominica,
                @SerializedName("Dominican Republic")
                val dominicanRepublic: DominicanRepublic,
                @SerializedName("East Timor")
                val eastTimor: EastTimor,
                @SerializedName("Ecuador")
                val ecuador: Ecuador,
                @SerializedName("Egypt")
                val egypt: Egypt,
                @SerializedName("El Salvador")
                val elSalvador: ElSalvador,
                @SerializedName("Equatorial Guinea")
                val equatorialGuinea: EquatorialGuinea,
                @SerializedName("Eritrea")
                val eritrea: Eritrea,
                @SerializedName("Estonia")
                val estonia: Estonia,
                @SerializedName("Eswatini")
                val eswatini: Eswatini,
                @SerializedName("Ethiopia")
                val ethiopia: Ethiopia,
                @SerializedName("Fiji")
                val fiji: Fiji,
                @SerializedName("Finland")
                val finland: Finland,
                @SerializedName("France")
                val france: France,
                @SerializedName("Gabon")
                val gabon: Gabon,
                @SerializedName("Gambia")
                val gambia: Gambia,
                @SerializedName("Georgia")
                val georgia: Georgia,
                @SerializedName("Germany")
                val germany: Germany,
                @SerializedName("Ghana")
                val ghana: Ghana,
                @SerializedName("Greece")
                val greece: Greece,
                @SerializedName("Grenada")
                val grenada: Grenada,
                @SerializedName("Guatemala")
                val guatemala: Guatemala,
                @SerializedName("Guernsey")
                val guernsey: Guernsey,
                @SerializedName("Guinea")
                val guinea: Guinea,
                @SerializedName("Guinea-Bissau")
                val guineaBissau: GuineaBissau,
                @SerializedName("Guyana")
                val guyana: Guyana,
                @SerializedName("Haiti")
                val haiti: Haiti,
                @SerializedName("Holy See")
                val holySee: HolySee,
                @SerializedName("Honduras")
                val honduras: Honduras,
                @SerializedName("Hungary")
                val hungary: Hungary,
                @SerializedName("Iceland")
                val iceland: Iceland,
                @SerializedName("India")
                val india: India,
                @SerializedName("Indonesia")
                val indonesia: Indonesia,
                @SerializedName("Iran")
                val iran: Iran,
                @SerializedName("Iraq")
                val iraq: Iraq,
                @SerializedName("Ireland")
                val ireland: Ireland,
                @SerializedName("Israel")
                val israel: Israel,
                @SerializedName("Italy")
                val italy: Italy,
                @SerializedName("Jamaica")
                val jamaica: Jamaica,
                @SerializedName("Japan")
                val japan: Japan,
                @SerializedName("Jersey")
                val jersey: Jersey,
                @SerializedName("Jordan")
                val jordan: Jordan,
                @SerializedName("Kazakhstan")
                val kazakhstan: Kazakhstan,
                @SerializedName("Kenya")
                val kenya: Kenya,
                @SerializedName("Korea, South")
                val koreaSouth: KoreaSouth,
                @SerializedName("Kosovo")
                val kosovo: Kosovo,
                @SerializedName("Kuwait")
                val kuwait: Kuwait,
                @SerializedName("Kyrgyzstan")
                val kyrgyzstan: Kyrgyzstan,
                @SerializedName("Laos")
                val laos: Laos,
                @SerializedName("Latvia")
                val latvia: Latvia,
                @SerializedName("Lebanon")
                val lebanon: Lebanon,
                @SerializedName("Lesotho")
                val lesotho: Lesotho,
                @SerializedName("Liberia")
                val liberia: Liberia,
                @SerializedName("Libya")
                val libya: Libya,
                @SerializedName("Liechtenstein")
                val liechtenstein: Liechtenstein,
                @SerializedName("Lithuania")
                val lithuania: Lithuania,
                @SerializedName("Luxembourg")
                val luxembourg: Luxembourg,
                @SerializedName("MS Zaandam")
                val mSZaandam: MSZaandam,
                @SerializedName("Madagascar")
                val madagascar: Madagascar,
                @SerializedName("Malawi")
                val malawi: Malawi,
                @SerializedName("Malaysia")
                val malaysia: Malaysia,
                @SerializedName("Maldives")
                val maldives: Maldives,
                @SerializedName("Mali")
                val mali: Mali,
                @SerializedName("Malta")
                val malta: Malta,
                @SerializedName("Mauritania")
                val mauritania: Mauritania,
                @SerializedName("Mauritius")
                val mauritius: Mauritius,
                @SerializedName("Mexico")
                val mexico: Mexico,
                @SerializedName("Moldova")
                val moldova: Moldova,
                @SerializedName("Monaco")
                val monaco: Monaco,
                @SerializedName("Mongolia")
                val mongolia: Mongolia,
                @SerializedName("Montenegro")
                val montenegro: Montenegro,
                @SerializedName("Morocco")
                val morocco: Morocco,
                @SerializedName("Mozambique")
                val mozambique: Mozambique,
                @SerializedName("Namibia")
                val namibia: Namibia,
                @SerializedName("Nepal")
                val nepal: Nepal,
                @SerializedName("Netherlands")
                val netherlands: Netherlands,
                @SerializedName("New Zealand")
                val newZealand: NewZealand,
                @SerializedName("Nicaragua")
                val nicaragua: Nicaragua,
                @SerializedName("Niger")
                val niger: Niger,
                @SerializedName("Nigeria")
                val nigeria: Nigeria,
                @SerializedName("North Macedonia")
                val northMacedonia: NorthMacedonia,
                @SerializedName("Norway")
                val norway: Norway,
                @SerializedName("Oman")
                val oman: Oman,
                @SerializedName("Pakistan")
                val pakistan: Pakistan,
                @SerializedName("Panama")
                val panama: Panama,
                @SerializedName("Papua New Guinea")
                val papuaNewGuinea: PapuaNewGuinea,
                @SerializedName("Paraguay")
                val paraguay: Paraguay,
                @SerializedName("Peru")
                val peru: Peru,
                @SerializedName("Philippines")
                val philippines: Philippines,
                @SerializedName("Poland")
                val poland: Poland,
                @SerializedName("Portugal")
                val portugal: Portugal,
                @SerializedName("Qatar")
                val qatar: Qatar,
                @SerializedName("Romania")
                val romania: Romania,
                @SerializedName("Russia")
                val russia: Russia,
                @SerializedName("Rwanda")
                val rwanda: Rwanda,
                @SerializedName("Saint Kitts and Nevis")
                val saintKittsAndNevis: SaintKittsAndNevis,
                @SerializedName("Saint Lucia")
                val saintLucia: SaintLucia,
                @SerializedName("Saint Vincent and the Grenadines")
                val saintVincentAndTheGrenadines: SaintVincentAndTheGrenadines,
                @SerializedName("San Marino")
                val sanMarino: SanMarino,
                @SerializedName("Sao Tome and Principe")
                val saoTomeAndPrincipe: SaoTomeAndPrincipe,
                @SerializedName("Saudi Arabia")
                val saudiArabia: SaudiArabia,
                @SerializedName("Senegal")
                val senegal: Senegal,
                @SerializedName("Serbia")
                val serbia: Serbia,
                @SerializedName("Seychelles")
                val seychelles: Seychelles,
                @SerializedName("Sierra Leone")
                val sierraLeone: SierraLeone,
                @SerializedName("Singapore")
                val singapore: Singapore,
                @SerializedName("Slovakia")
                val slovakia: Slovakia,
                @SerializedName("Slovenia")
                val slovenia: Slovenia,
                @SerializedName("Somalia")
                val somalia: Somalia,
                @SerializedName("South Africa")
                val southAfrica: SouthAfrica,
                @SerializedName("South Sudan")
                val southSudan: SouthSudan,
                @SerializedName("Spain")
                val spain: Spain,
                @SerializedName("Sri Lanka")
                val sriLanka: SriLanka,
                @SerializedName("Sudan")
                val sudan: Sudan,
                @SerializedName("Suriname")
                val suriname: Suriname,
                @SerializedName("Sweden")
                val sweden: Sweden,
                @SerializedName("Switzerland")
                val switzerland: Switzerland,
                @SerializedName("Syria")
                val syria: Syria,
                @SerializedName("Taiwan*")
                val taiwan: Taiwan,
                @SerializedName("Tajikistan")
                val tajikistan: Tajikistan,
                @SerializedName("Tanzania")
                val tanzania: Tanzania,
                @SerializedName("Thailand")
                val thailand: Thailand,
                @SerializedName("Timor-Leste")
                val timorLeste: TimorLeste,
                @SerializedName("Togo")
                val togo: Togo,
                @SerializedName("Trinidad and Tobago")
                val trinidadAndTobago: TrinidadAndTobago,
                @SerializedName("Tunisia")
                val tunisia: Tunisia,
                @SerializedName("Turkey")
                val turkey: Turkey,
                @SerializedName("US")
                val uS: US,
                @SerializedName("Uganda")
                val uganda: Uganda,
                @SerializedName("Ukraine")
                val ukraine: Ukraine,
                @SerializedName("United Arab Emirates")
                val unitedArabEmirates: UnitedArabEmirates,
                @SerializedName("United Kingdom")
                val unitedKingdom: UnitedKingdom,
                @SerializedName("Uruguay")
                val uruguay: Uruguay,
                @SerializedName("Uzbekistan")
                val uzbekistan: Uzbekistan,
                @SerializedName("Venezuela")
                val venezuela: Venezuela,
                @SerializedName("Vietnam")
                val vietnam: Vietnam,
                @SerializedName("West Bank and Gaza")
                val westBankAndGaza: WestBankAndGaza,
                @SerializedName("Western Sahara")
                val westernSahara: WesternSahara,
                @SerializedName("Yemen")
                val yemen: Yemen,
                @SerializedName("Zambia")
                val zambia: Zambia,
                @SerializedName("Zimbabwe")
                val zimbabwe: Zimbabwe
            ) {
                data class Afghanistan(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Albania(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Algeria(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Andorra(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Angola(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class AntiguaAndBarbuda(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Argentina(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Region>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )

                    data class Region(
                        @SerializedName("date")
                        val date: String,
                        @SerializedName("id")
                        val id: String,
                        @SerializedName("links")
                        val links: List<Link>,
                        @SerializedName("name")
                        val name: String,
                        @SerializedName("name_es")
                        val nameEs: String,
                        @SerializedName("name_it")
                        val nameIt: String,
                        @SerializedName("source")
                        val source: String,
                        @SerializedName("sub_regions")
                        val subRegions: List<Any>,
                        @SerializedName("today_confirmed")
                        val todayConfirmed: Int,
                        @SerializedName("today_deaths")
                        val todayDeaths: Int,
                        @SerializedName("today_new_confirmed")
                        val todayNewConfirmed: Int,
                        @SerializedName("today_new_deaths")
                        val todayNewDeaths: Int,
                        @SerializedName("today_new_open_cases")
                        val todayNewOpenCases: Int,
                        @SerializedName("today_new_recovered")
                        val todayNewRecovered: Int,
                        @SerializedName("today_open_cases")
                        val todayOpenCases: Int,
                        @SerializedName("today_recovered")
                        val todayRecovered: Int,
                        @SerializedName("today_vs_yesterday_confirmed")
                        val todayVsYesterdayConfirmed: Double,
                        @SerializedName("today_vs_yesterday_deaths")
                        val todayVsYesterdayDeaths: Double,
                        @SerializedName("today_vs_yesterday_open_cases")
                        val todayVsYesterdayOpenCases: Double,
                        @SerializedName("today_vs_yesterday_recovered")
                        val todayVsYesterdayRecovered: Any,
                        @SerializedName("yesterday_confirmed")
                        val yesterdayConfirmed: Int,
                        @SerializedName("yesterday_deaths")
                        val yesterdayDeaths: Int,
                        @SerializedName("yesterday_open_cases")
                        val yesterdayOpenCases: Int,
                        @SerializedName("yesterday_recovered")
                        val yesterdayRecovered: Int
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String,
                            @SerializedName("rel")
                            val rel: String,
                            @SerializedName("type")
                            val type: String
                        )
                    }
                }

                data class Armenia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Australia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Region>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )

                    data class Region(
                        @SerializedName("date")
                        val date: String,
                        @SerializedName("id")
                        val id: String,
                        @SerializedName("links")
                        val links: List<Link>,
                        @SerializedName("name")
                        val name: String,
                        @SerializedName("name_es")
                        val nameEs: String,
                        @SerializedName("name_it")
                        val nameIt: String,
                        @SerializedName("source")
                        val source: String,
                        @SerializedName("sub_regions")
                        val subRegions: List<Any>,
                        @SerializedName("today_confirmed")
                        val todayConfirmed: Int,
                        @SerializedName("today_deaths")
                        val todayDeaths: Int,
                        @SerializedName("today_new_confirmed")
                        val todayNewConfirmed: Int,
                        @SerializedName("today_new_deaths")
                        val todayNewDeaths: Int,
                        @SerializedName("today_new_open_cases")
                        val todayNewOpenCases: Int,
                        @SerializedName("today_new_recovered")
                        val todayNewRecovered: Int,
                        @SerializedName("today_open_cases")
                        val todayOpenCases: Int,
                        @SerializedName("today_recovered")
                        val todayRecovered: Int,
                        @SerializedName("today_vs_yesterday_confirmed")
                        val todayVsYesterdayConfirmed: Double,
                        @SerializedName("today_vs_yesterday_deaths")
                        val todayVsYesterdayDeaths: Double,
                        @SerializedName("today_vs_yesterday_open_cases")
                        val todayVsYesterdayOpenCases: Double,
                        @SerializedName("today_vs_yesterday_recovered")
                        val todayVsYesterdayRecovered: Double,
                        @SerializedName("yesterday_confirmed")
                        val yesterdayConfirmed: Int,
                        @SerializedName("yesterday_deaths")
                        val yesterdayDeaths: Int,
                        @SerializedName("yesterday_open_cases")
                        val yesterdayOpenCases: Int,
                        @SerializedName("yesterday_recovered")
                        val yesterdayRecovered: Int
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String,
                            @SerializedName("rel")
                            val rel: String,
                            @SerializedName("type")
                            val type: String
                        )
                    }
                }

                data class Austria(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Azerbaijan(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Bahamas(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Bahrain(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Bangladesh(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Barbados(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Belarus(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Belgium(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Belize(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Benin(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Bhutan(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Any,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Bolivia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class BosniaAndHerzegovina(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Botswana(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Brazil(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Region>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )

                    data class Region(
                        @SerializedName("date")
                        val date: String,
                        @SerializedName("id")
                        val id: String,
                        @SerializedName("links")
                        val links: List<Link>,
                        @SerializedName("name")
                        val name: String,
                        @SerializedName("name_es")
                        val nameEs: String,
                        @SerializedName("name_it")
                        val nameIt: String,
                        @SerializedName("source")
                        val source: String,
                        @SerializedName("sub_regions")
                        val subRegions: List<Any>,
                        @SerializedName("today_confirmed")
                        val todayConfirmed: Int,
                        @SerializedName("today_deaths")
                        val todayDeaths: Int,
                        @SerializedName("today_new_confirmed")
                        val todayNewConfirmed: Int,
                        @SerializedName("today_new_deaths")
                        val todayNewDeaths: Int,
                        @SerializedName("today_new_open_cases")
                        val todayNewOpenCases: Int,
                        @SerializedName("today_new_recovered")
                        val todayNewRecovered: Int,
                        @SerializedName("today_open_cases")
                        val todayOpenCases: Int,
                        @SerializedName("today_recovered")
                        val todayRecovered: Int,
                        @SerializedName("today_vs_yesterday_confirmed")
                        val todayVsYesterdayConfirmed: Double,
                        @SerializedName("today_vs_yesterday_deaths")
                        val todayVsYesterdayDeaths: Double,
                        @SerializedName("today_vs_yesterday_open_cases")
                        val todayVsYesterdayOpenCases: Double,
                        @SerializedName("today_vs_yesterday_recovered")
                        val todayVsYesterdayRecovered: Double,
                        @SerializedName("yesterday_confirmed")
                        val yesterdayConfirmed: Int,
                        @SerializedName("yesterday_deaths")
                        val yesterdayDeaths: Int,
                        @SerializedName("yesterday_open_cases")
                        val yesterdayOpenCases: Int,
                        @SerializedName("yesterday_recovered")
                        val yesterdayRecovered: Int
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String,
                            @SerializedName("rel")
                            val rel: String,
                            @SerializedName("type")
                            val type: String
                        )
                    }
                }

                data class Brunei(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Bulgaria(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class BurkinaFaso(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Burma(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Burundi(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class CaboVerde(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Cambodia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Any,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Cameroon(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Canada(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Region>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )

                    data class Region(
                        @SerializedName("date")
                        val date: String,
                        @SerializedName("id")
                        val id: String,
                        @SerializedName("links")
                        val links: List<Link>,
                        @SerializedName("name")
                        val name: String,
                        @SerializedName("name_es")
                        val nameEs: String,
                        @SerializedName("name_it")
                        val nameIt: String,
                        @SerializedName("source")
                        val source: String,
                        @SerializedName("sub_regions")
                        val subRegions: List<Any>,
                        @SerializedName("today_confirmed")
                        val todayConfirmed: Int,
                        @SerializedName("today_deaths")
                        val todayDeaths: Int,
                        @SerializedName("today_new_confirmed")
                        val todayNewConfirmed: Int,
                        @SerializedName("today_new_deaths")
                        val todayNewDeaths: Int,
                        @SerializedName("today_new_open_cases")
                        val todayNewOpenCases: Int,
                        @SerializedName("today_new_recovered")
                        val todayNewRecovered: Int,
                        @SerializedName("today_open_cases")
                        val todayOpenCases: Int,
                        @SerializedName("today_recovered")
                        val todayRecovered: Int,
                        @SerializedName("today_vs_yesterday_confirmed")
                        val todayVsYesterdayConfirmed: Double,
                        @SerializedName("today_vs_yesterday_deaths")
                        val todayVsYesterdayDeaths: Double,
                        @SerializedName("today_vs_yesterday_open_cases")
                        val todayVsYesterdayOpenCases: Double,
                        @SerializedName("today_vs_yesterday_recovered")
                        val todayVsYesterdayRecovered: Double,
                        @SerializedName("yesterday_confirmed")
                        val yesterdayConfirmed: Int,
                        @SerializedName("yesterday_deaths")
                        val yesterdayDeaths: Int,
                        @SerializedName("yesterday_open_cases")
                        val yesterdayOpenCases: Int,
                        @SerializedName("yesterday_recovered")
                        val yesterdayRecovered: Int
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String,
                            @SerializedName("rel")
                            val rel: String,
                            @SerializedName("type")
                            val type: String
                        )
                    }
                }

                data class CentralAfricanRepublic(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Chad(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Chile(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Region>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )

                    data class Region(
                        @SerializedName("date")
                        val date: String,
                        @SerializedName("id")
                        val id: String,
                        @SerializedName("links")
                        val links: List<Link>,
                        @SerializedName("name")
                        val name: String,
                        @SerializedName("name_es")
                        val nameEs: String,
                        @SerializedName("name_it")
                        val nameIt: String,
                        @SerializedName("source")
                        val source: String,
                        @SerializedName("sub_regions")
                        val subRegions: List<Any>,
                        @SerializedName("today_confirmed")
                        val todayConfirmed: Int,
                        @SerializedName("today_deaths")
                        val todayDeaths: Int,
                        @SerializedName("today_new_confirmed")
                        val todayNewConfirmed: Int,
                        @SerializedName("today_new_deaths")
                        val todayNewDeaths: Int,
                        @SerializedName("today_new_open_cases")
                        val todayNewOpenCases: Int,
                        @SerializedName("today_new_recovered")
                        val todayNewRecovered: Int,
                        @SerializedName("today_open_cases")
                        val todayOpenCases: Int,
                        @SerializedName("today_recovered")
                        val todayRecovered: Int,
                        @SerializedName("today_vs_yesterday_confirmed")
                        val todayVsYesterdayConfirmed: Double,
                        @SerializedName("today_vs_yesterday_deaths")
                        val todayVsYesterdayDeaths: Double,
                        @SerializedName("today_vs_yesterday_open_cases")
                        val todayVsYesterdayOpenCases: Double,
                        @SerializedName("today_vs_yesterday_recovered")
                        val todayVsYesterdayRecovered: Double,
                        @SerializedName("yesterday_confirmed")
                        val yesterdayConfirmed: Int,
                        @SerializedName("yesterday_deaths")
                        val yesterdayDeaths: Int,
                        @SerializedName("yesterday_open_cases")
                        val yesterdayOpenCases: Int,
                        @SerializedName("yesterday_recovered")
                        val yesterdayRecovered: Int
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String,
                            @SerializedName("rel")
                            val rel: String,
                            @SerializedName("type")
                            val type: String
                        )
                    }
                }

                data class China(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Region>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )

                    data class Region(
                        @SerializedName("date")
                        val date: String,
                        @SerializedName("id")
                        val id: String,
                        @SerializedName("links")
                        val links: List<Link>,
                        @SerializedName("name")
                        val name: String,
                        @SerializedName("name_es")
                        val nameEs: String,
                        @SerializedName("name_it")
                        val nameIt: String,
                        @SerializedName("source")
                        val source: String,
                        @SerializedName("sub_regions")
                        val subRegions: List<Any>,
                        @SerializedName("today_confirmed")
                        val todayConfirmed: Int,
                        @SerializedName("today_deaths")
                        val todayDeaths: Int,
                        @SerializedName("today_new_confirmed")
                        val todayNewConfirmed: Int,
                        @SerializedName("today_new_deaths")
                        val todayNewDeaths: Int,
                        @SerializedName("today_new_open_cases")
                        val todayNewOpenCases: Int,
                        @SerializedName("today_new_recovered")
                        val todayNewRecovered: Int,
                        @SerializedName("today_open_cases")
                        val todayOpenCases: Int,
                        @SerializedName("today_recovered")
                        val todayRecovered: Int,
                        @SerializedName("today_vs_yesterday_confirmed")
                        val todayVsYesterdayConfirmed: Double,
                        @SerializedName("today_vs_yesterday_deaths")
                        val todayVsYesterdayDeaths: Double,
                        @SerializedName("today_vs_yesterday_open_cases")
                        val todayVsYesterdayOpenCases: Any,
                        @SerializedName("today_vs_yesterday_recovered")
                        val todayVsYesterdayRecovered: Double,
                        @SerializedName("yesterday_confirmed")
                        val yesterdayConfirmed: Int,
                        @SerializedName("yesterday_deaths")
                        val yesterdayDeaths: Int,
                        @SerializedName("yesterday_open_cases")
                        val yesterdayOpenCases: Int,
                        @SerializedName("yesterday_recovered")
                        val yesterdayRecovered: Int
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String,
                            @SerializedName("rel")
                            val rel: String,
                            @SerializedName("type")
                            val type: String
                        )
                    }
                }

                data class Colombia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Region>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )

                    data class Region(
                        @SerializedName("date")
                        val date: String,
                        @SerializedName("id")
                        val id: String,
                        @SerializedName("links")
                        val links: List<Link>,
                        @SerializedName("name")
                        val name: String,
                        @SerializedName("name_es")
                        val nameEs: String,
                        @SerializedName("name_it")
                        val nameIt: String,
                        @SerializedName("source")
                        val source: String,
                        @SerializedName("sub_regions")
                        val subRegions: List<Any>,
                        @SerializedName("today_confirmed")
                        val todayConfirmed: Int,
                        @SerializedName("today_deaths")
                        val todayDeaths: Int,
                        @SerializedName("today_new_confirmed")
                        val todayNewConfirmed: Int,
                        @SerializedName("today_new_deaths")
                        val todayNewDeaths: Int,
                        @SerializedName("today_new_open_cases")
                        val todayNewOpenCases: Int,
                        @SerializedName("today_new_recovered")
                        val todayNewRecovered: Int,
                        @SerializedName("today_open_cases")
                        val todayOpenCases: Int,
                        @SerializedName("today_recovered")
                        val todayRecovered: Int,
                        @SerializedName("today_vs_yesterday_confirmed")
                        val todayVsYesterdayConfirmed: Double,
                        @SerializedName("today_vs_yesterday_deaths")
                        val todayVsYesterdayDeaths: Double,
                        @SerializedName("today_vs_yesterday_open_cases")
                        val todayVsYesterdayOpenCases: Double,
                        @SerializedName("today_vs_yesterday_recovered")
                        val todayVsYesterdayRecovered: Double,
                        @SerializedName("yesterday_confirmed")
                        val yesterdayConfirmed: Int,
                        @SerializedName("yesterday_deaths")
                        val yesterdayDeaths: Int,
                        @SerializedName("yesterday_open_cases")
                        val yesterdayOpenCases: Int,
                        @SerializedName("yesterday_recovered")
                        val yesterdayRecovered: Int
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String,
                            @SerializedName("rel")
                            val rel: String,
                            @SerializedName("type")
                            val type: String
                        )
                    }
                }

                data class Comoros(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class CongoBrazzaville(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class CongoKinshasa(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class CostaRica(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class CoteDIvoire(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Croatia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Cuba(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Cyprus(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Czechia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Denmark(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Region>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )

                    data class Region(
                        @SerializedName("date")
                        val date: String,
                        @SerializedName("id")
                        val id: String,
                        @SerializedName("links")
                        val links: List<Link>,
                        @SerializedName("name")
                        val name: String,
                        @SerializedName("name_es")
                        val nameEs: String,
                        @SerializedName("name_it")
                        val nameIt: String,
                        @SerializedName("source")
                        val source: String,
                        @SerializedName("sub_regions")
                        val subRegions: List<Any>,
                        @SerializedName("today_confirmed")
                        val todayConfirmed: Int,
                        @SerializedName("today_deaths")
                        val todayDeaths: Int,
                        @SerializedName("today_new_confirmed")
                        val todayNewConfirmed: Int,
                        @SerializedName("today_new_deaths")
                        val todayNewDeaths: Int,
                        @SerializedName("today_new_open_cases")
                        val todayNewOpenCases: Int,
                        @SerializedName("today_new_recovered")
                        val todayNewRecovered: Int,
                        @SerializedName("today_open_cases")
                        val todayOpenCases: Int,
                        @SerializedName("today_recovered")
                        val todayRecovered: Int,
                        @SerializedName("today_vs_yesterday_confirmed")
                        val todayVsYesterdayConfirmed: Double,
                        @SerializedName("today_vs_yesterday_deaths")
                        val todayVsYesterdayDeaths: Any,
                        @SerializedName("today_vs_yesterday_open_cases")
                        val todayVsYesterdayOpenCases: Double,
                        @SerializedName("today_vs_yesterday_recovered")
                        val todayVsYesterdayRecovered: Double,
                        @SerializedName("yesterday_confirmed")
                        val yesterdayConfirmed: Int,
                        @SerializedName("yesterday_deaths")
                        val yesterdayDeaths: Int,
                        @SerializedName("yesterday_open_cases")
                        val yesterdayOpenCases: Int,
                        @SerializedName("yesterday_recovered")
                        val yesterdayRecovered: Int
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String,
                            @SerializedName("rel")
                            val rel: String,
                            @SerializedName("type")
                            val type: String
                        )
                    }
                }

                data class DiamondPrincess(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Djibouti(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Dominica(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Any,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class DominicanRepublic(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class EastTimor(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Any,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Any,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Any,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Any,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Ecuador(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Egypt(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class ElSalvador(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class EquatorialGuinea(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Eritrea(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Any,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Estonia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Eswatini(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Ethiopia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Fiji(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Any,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Finland(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class France(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Region>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_intensive_care")
                    val todayIntensiveCare: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_intensive_care")
                    val todayNewIntensiveCare: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_new_total_hospitalised_patients")
                    val todayNewTotalHospitalisedPatients: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_total_hospitalised_patients")
                    val todayTotalHospitalisedPatients: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_intensive_care")
                    val todayVsYesterdayIntensiveCare: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("today_vs_yesterday_total_hospitalised_patients")
                    val todayVsYesterdayTotalHospitalisedPatients: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_intensive_care")
                    val yesterdayIntensiveCare: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int,
                    @SerializedName("yesterday_total_hospitalised_patients")
                    val yesterdayTotalHospitalisedPatients: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )

                    data class Region(
                        @SerializedName("date")
                        val date: String,
                        @SerializedName("id")
                        val id: String,
                        @SerializedName("links")
                        val links: List<Link>,
                        @SerializedName("name")
                        val name: String,
                        @SerializedName("name_es")
                        val nameEs: String,
                        @SerializedName("name_it")
                        val nameIt: String,
                        @SerializedName("source")
                        val source: String,
                        @SerializedName("sub_regions")
                        val subRegions: List<Any>,
                        @SerializedName("today_confirmed")
                        val todayConfirmed: Int,
                        @SerializedName("today_deaths")
                        val todayDeaths: Int,
                        @SerializedName("today_intensive_care")
                        val todayIntensiveCare: Int,
                        @SerializedName("today_new_confirmed")
                        val todayNewConfirmed: Int,
                        @SerializedName("today_new_deaths")
                        val todayNewDeaths: Int,
                        @SerializedName("today_new_intensive_care")
                        val todayNewIntensiveCare: Int,
                        @SerializedName("today_new_open_cases")
                        val todayNewOpenCases: Int,
                        @SerializedName("today_new_recovered")
                        val todayNewRecovered: Int,
                        @SerializedName("today_new_total_hospitalised_patients")
                        val todayNewTotalHospitalisedPatients: Int,
                        @SerializedName("today_open_cases")
                        val todayOpenCases: Int,
                        @SerializedName("today_recovered")
                        val todayRecovered: Int,
                        @SerializedName("today_total_hospitalised_patients")
                        val todayTotalHospitalisedPatients: Int,
                        @SerializedName("today_vs_yesterday_confirmed")
                        val todayVsYesterdayConfirmed: Any,
                        @SerializedName("today_vs_yesterday_deaths")
                        val todayVsYesterdayDeaths: Double,
                        @SerializedName("today_vs_yesterday_intensive_care")
                        val todayVsYesterdayIntensiveCare: Double,
                        @SerializedName("today_vs_yesterday_open_cases")
                        val todayVsYesterdayOpenCases: Any,
                        @SerializedName("today_vs_yesterday_recovered")
                        val todayVsYesterdayRecovered: Double,
                        @SerializedName("today_vs_yesterday_total_hospitalised_patients")
                        val todayVsYesterdayTotalHospitalisedPatients: Double,
                        @SerializedName("yesterday_confirmed")
                        val yesterdayConfirmed: Int,
                        @SerializedName("yesterday_deaths")
                        val yesterdayDeaths: Int,
                        @SerializedName("yesterday_intensive_care")
                        val yesterdayIntensiveCare: Int,
                        @SerializedName("yesterday_open_cases")
                        val yesterdayOpenCases: Int,
                        @SerializedName("yesterday_recovered")
                        val yesterdayRecovered: Int,
                        @SerializedName("yesterday_total_hospitalised_patients")
                        val yesterdayTotalHospitalisedPatients: Int
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String,
                            @SerializedName("rel")
                            val rel: String,
                            @SerializedName("type")
                            val type: String
                        )
                    }
                }

                data class Gabon(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Gambia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Georgia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Germany(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Region>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )

                    data class Region(
                        @SerializedName("date")
                        val date: String,
                        @SerializedName("id")
                        val id: String,
                        @SerializedName("links")
                        val links: List<Link>,
                        @SerializedName("name")
                        val name: String,
                        @SerializedName("name_es")
                        val nameEs: String,
                        @SerializedName("name_it")
                        val nameIt: String,
                        @SerializedName("source")
                        val source: String,
                        @SerializedName("sub_regions")
                        val subRegions: List<Any>,
                        @SerializedName("today_confirmed")
                        val todayConfirmed: Int,
                        @SerializedName("today_deaths")
                        val todayDeaths: Int,
                        @SerializedName("today_new_confirmed")
                        val todayNewConfirmed: Int,
                        @SerializedName("today_new_deaths")
                        val todayNewDeaths: Int,
                        @SerializedName("today_new_open_cases")
                        val todayNewOpenCases: Int,
                        @SerializedName("today_new_recovered")
                        val todayNewRecovered: Int,
                        @SerializedName("today_open_cases")
                        val todayOpenCases: Int,
                        @SerializedName("today_recovered")
                        val todayRecovered: Int,
                        @SerializedName("today_vs_yesterday_confirmed")
                        val todayVsYesterdayConfirmed: Double,
                        @SerializedName("today_vs_yesterday_deaths")
                        val todayVsYesterdayDeaths: Double,
                        @SerializedName("today_vs_yesterday_open_cases")
                        val todayVsYesterdayOpenCases: Double,
                        @SerializedName("today_vs_yesterday_recovered")
                        val todayVsYesterdayRecovered: Double,
                        @SerializedName("yesterday_confirmed")
                        val yesterdayConfirmed: Int,
                        @SerializedName("yesterday_deaths")
                        val yesterdayDeaths: Int,
                        @SerializedName("yesterday_open_cases")
                        val yesterdayOpenCases: Int,
                        @SerializedName("yesterday_recovered")
                        val yesterdayRecovered: Int
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String,
                            @SerializedName("rel")
                            val rel: String,
                            @SerializedName("type")
                            val type: String
                        )
                    }
                }

                data class Ghana(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Greece(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Grenada(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Any,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Guatemala(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Guernsey(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Any,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Any,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Any,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Any,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Guinea(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class GuineaBissau(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Guyana(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Haiti(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class HolySee(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Any,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Honduras(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Hungary(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Iceland(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class India(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Region>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )

                    data class Region(
                        @SerializedName("date")
                        val date: String,
                        @SerializedName("id")
                        val id: String,
                        @SerializedName("links")
                        val links: List<Link>,
                        @SerializedName("name")
                        val name: String,
                        @SerializedName("name_es")
                        val nameEs: String,
                        @SerializedName("name_it")
                        val nameIt: String,
                        @SerializedName("sub_regions")
                        val subRegions: List<Any>,
                        @SerializedName("today_confirmed")
                        val todayConfirmed: Int,
                        @SerializedName("today_deaths")
                        val todayDeaths: Int,
                        @SerializedName("today_new_confirmed")
                        val todayNewConfirmed: Int,
                        @SerializedName("today_new_deaths")
                        val todayNewDeaths: Int,
                        @SerializedName("today_new_open_cases")
                        val todayNewOpenCases: Int,
                        @SerializedName("today_new_recovered")
                        val todayNewRecovered: Int,
                        @SerializedName("today_open_cases")
                        val todayOpenCases: Int,
                        @SerializedName("today_recovered")
                        val todayRecovered: Int,
                        @SerializedName("today_vs_yesterday_confirmed")
                        val todayVsYesterdayConfirmed: Double,
                        @SerializedName("today_vs_yesterday_deaths")
                        val todayVsYesterdayDeaths: Double,
                        @SerializedName("today_vs_yesterday_open_cases")
                        val todayVsYesterdayOpenCases: Double,
                        @SerializedName("today_vs_yesterday_recovered")
                        val todayVsYesterdayRecovered: Double,
                        @SerializedName("yesterday_confirmed")
                        val yesterdayConfirmed: Int,
                        @SerializedName("yesterday_deaths")
                        val yesterdayDeaths: Int,
                        @SerializedName("yesterday_open_cases")
                        val yesterdayOpenCases: Int,
                        @SerializedName("yesterday_recovered")
                        val yesterdayRecovered: Int
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String,
                            @SerializedName("rel")
                            val rel: String,
                            @SerializedName("type")
                            val type: String
                        )
                    }
                }

                data class Indonesia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Iran(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Iraq(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Ireland(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Israel(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Italy(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Region>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_home_confinement")
                    val todayHomeConfinement: Int,
                    @SerializedName("today_hospitalised_patients_with_symptoms")
                    val todayHospitalisedPatientsWithSymptoms: Int,
                    @SerializedName("today_intensive_care")
                    val todayIntensiveCare: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_home_confinement")
                    val todayNewHomeConfinement: Int,
                    @SerializedName("today_new_hospitalised_patients_with_symptoms")
                    val todayNewHospitalisedPatientsWithSymptoms: Int,
                    @SerializedName("today_new_intensive_care")
                    val todayNewIntensiveCare: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_new_tests")
                    val todayNewTests: Int,
                    @SerializedName("today_new_total_hospitalised_patients")
                    val todayNewTotalHospitalisedPatients: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_tests")
                    val todayTests: Int,
                    @SerializedName("today_total_hospitalised_patients")
                    val todayTotalHospitalisedPatients: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_home_confinement")
                    val todayVsYesterdayHomeConfinement: Double,
                    @SerializedName("today_vs_yesterday_hospitalised_patients_with_symptoms")
                    val todayVsYesterdayHospitalisedPatientsWithSymptoms: Double,
                    @SerializedName("today_vs_yesterday_intensive_care")
                    val todayVsYesterdayIntensiveCare: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("today_vs_yesterday_tests")
                    val todayVsYesterdayTests: Double,
                    @SerializedName("today_vs_yesterday_total_hospitalised_patients")
                    val todayVsYesterdayTotalHospitalisedPatients: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_home_confinement")
                    val yesterdayHomeConfinement: Int,
                    @SerializedName("yesterday_hospitalised_patients_with_symptoms")
                    val yesterdayHospitalisedPatientsWithSymptoms: Int,
                    @SerializedName("yesterday_intensive_care")
                    val yesterdayIntensiveCare: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int,
                    @SerializedName("yesterday_tests")
                    val yesterdayTests: Int,
                    @SerializedName("yesterday_total_hospitalised_patients")
                    val yesterdayTotalHospitalisedPatients: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )

                    data class Region(
                        @SerializedName("date")
                        val date: String,
                        @SerializedName("id")
                        val id: String,
                        @SerializedName("links")
                        val links: List<Link>,
                        @SerializedName("name")
                        val name: String,
                        @SerializedName("name_es")
                        val nameEs: String,
                        @SerializedName("name_it")
                        val nameIt: String,
                        @SerializedName("source")
                        val source: String,
                        @SerializedName("sub_regions")
                        val subRegions: List<Any>,
                        @SerializedName("today_confirmed")
                        val todayConfirmed: Int,
                        @SerializedName("today_deaths")
                        val todayDeaths: Int,
                        @SerializedName("today_home_confinement")
                        val todayHomeConfinement: Int,
                        @SerializedName("today_hospitalised_patients_with_symptoms")
                        val todayHospitalisedPatientsWithSymptoms: Int,
                        @SerializedName("today_intensive_care")
                        val todayIntensiveCare: Int,
                        @SerializedName("today_new_confirmed")
                        val todayNewConfirmed: Int,
                        @SerializedName("today_new_deaths")
                        val todayNewDeaths: Int,
                        @SerializedName("today_new_home_confinement")
                        val todayNewHomeConfinement: Int,
                        @SerializedName("today_new_hospitalised_patients_with_symptoms")
                        val todayNewHospitalisedPatientsWithSymptoms: Int,
                        @SerializedName("today_new_intensive_care")
                        val todayNewIntensiveCare: Int,
                        @SerializedName("today_new_open_cases")
                        val todayNewOpenCases: Int,
                        @SerializedName("today_new_recovered")
                        val todayNewRecovered: Int,
                        @SerializedName("today_new_tests")
                        val todayNewTests: Int,
                        @SerializedName("today_new_total_hospitalised_patients")
                        val todayNewTotalHospitalisedPatients: Int,
                        @SerializedName("today_open_cases")
                        val todayOpenCases: Int,
                        @SerializedName("today_recovered")
                        val todayRecovered: Int,
                        @SerializedName("today_tests")
                        val todayTests: Int,
                        @SerializedName("today_total_hospitalised_patients")
                        val todayTotalHospitalisedPatients: Int,
                        @SerializedName("today_vs_yesterday_confirmed")
                        val todayVsYesterdayConfirmed: Double,
                        @SerializedName("today_vs_yesterday_deaths")
                        val todayVsYesterdayDeaths: Double,
                        @SerializedName("today_vs_yesterday_home_confinement")
                        val todayVsYesterdayHomeConfinement: Double,
                        @SerializedName("today_vs_yesterday_hospitalised_patients_with_symptoms")
                        val todayVsYesterdayHospitalisedPatientsWithSymptoms: Double,
                        @SerializedName("today_vs_yesterday_intensive_care")
                        val todayVsYesterdayIntensiveCare: Double,
                        @SerializedName("today_vs_yesterday_open_cases")
                        val todayVsYesterdayOpenCases: Double,
                        @SerializedName("today_vs_yesterday_recovered")
                        val todayVsYesterdayRecovered: Double,
                        @SerializedName("today_vs_yesterday_tests")
                        val todayVsYesterdayTests: Double,
                        @SerializedName("today_vs_yesterday_total_hospitalised_patients")
                        val todayVsYesterdayTotalHospitalisedPatients: Double,
                        @SerializedName("yesterday_confirmed")
                        val yesterdayConfirmed: Int,
                        @SerializedName("yesterday_deaths")
                        val yesterdayDeaths: Int,
                        @SerializedName("yesterday_home_confinement")
                        val yesterdayHomeConfinement: Int,
                        @SerializedName("yesterday_hospitalised_patients_with_symptoms")
                        val yesterdayHospitalisedPatientsWithSymptoms: Int,
                        @SerializedName("yesterday_intensive_care")
                        val yesterdayIntensiveCare: Int,
                        @SerializedName("yesterday_open_cases")
                        val yesterdayOpenCases: Int,
                        @SerializedName("yesterday_recovered")
                        val yesterdayRecovered: Int,
                        @SerializedName("yesterday_tests")
                        val yesterdayTests: Int,
                        @SerializedName("yesterday_total_hospitalised_patients")
                        val yesterdayTotalHospitalisedPatients: Int
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String,
                            @SerializedName("rel")
                            val rel: String,
                            @SerializedName("type")
                            val type: String
                        )
                    }
                }

                data class Jamaica(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Japan(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Jersey(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Any,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Any,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Any,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Any,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Jordan(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Kazakhstan(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Kenya(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class KoreaSouth(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Kosovo(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Kuwait(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Kyrgyzstan(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Laos(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Any,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Latvia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Lebanon(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Lesotho(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Liberia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Libya(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Liechtenstein(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Lithuania(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Luxembourg(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class MSZaandam(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Any,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Madagascar(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Malawi(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Malaysia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Maldives(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Mali(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Malta(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Mauritania(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Mauritius(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Mexico(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Region>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_intensive_care")
                    val todayIntensiveCare: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_intensive_care")
                    val todayNewIntensiveCare: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_new_total_hospitalised_patients")
                    val todayNewTotalHospitalisedPatients: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_total_hospitalised_patients")
                    val todayTotalHospitalisedPatients: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_intensive_care")
                    val todayVsYesterdayIntensiveCare: Any,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("today_vs_yesterday_total_hospitalised_patients")
                    val todayVsYesterdayTotalHospitalisedPatients: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_intensive_care")
                    val yesterdayIntensiveCare: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int,
                    @SerializedName("yesterday_total_hospitalised_patients")
                    val yesterdayTotalHospitalisedPatients: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )

                    data class Region(
                        @SerializedName("date")
                        val date: String,
                        @SerializedName("id")
                        val id: String,
                        @SerializedName("links")
                        val links: List<Link>,
                        @SerializedName("name")
                        val name: String,
                        @SerializedName("name_es")
                        val nameEs: String,
                        @SerializedName("name_it")
                        val nameIt: String,
                        @SerializedName("source")
                        val source: String,
                        @SerializedName("sub_regions")
                        val subRegions: List<Any>,
                        @SerializedName("today_confirmed")
                        val todayConfirmed: Int,
                        @SerializedName("today_deaths")
                        val todayDeaths: Int,
                        @SerializedName("today_intensive_care")
                        val todayIntensiveCare: Int,
                        @SerializedName("today_new_confirmed")
                        val todayNewConfirmed: Int,
                        @SerializedName("today_new_deaths")
                        val todayNewDeaths: Int,
                        @SerializedName("today_new_intensive_care")
                        val todayNewIntensiveCare: Int,
                        @SerializedName("today_new_open_cases")
                        val todayNewOpenCases: Int,
                        @SerializedName("today_new_recovered")
                        val todayNewRecovered: Int,
                        @SerializedName("today_new_total_hospitalised_patients")
                        val todayNewTotalHospitalisedPatients: Int,
                        @SerializedName("today_open_cases")
                        val todayOpenCases: Int,
                        @SerializedName("today_recovered")
                        val todayRecovered: Int,
                        @SerializedName("today_total_hospitalised_patients")
                        val todayTotalHospitalisedPatients: Int,
                        @SerializedName("today_vs_yesterday_confirmed")
                        val todayVsYesterdayConfirmed: Double,
                        @SerializedName("today_vs_yesterday_deaths")
                        val todayVsYesterdayDeaths: Double,
                        @SerializedName("today_vs_yesterday_intensive_care")
                        val todayVsYesterdayIntensiveCare: Any,
                        @SerializedName("today_vs_yesterday_open_cases")
                        val todayVsYesterdayOpenCases: Double,
                        @SerializedName("today_vs_yesterday_recovered")
                        val todayVsYesterdayRecovered: Double,
                        @SerializedName("today_vs_yesterday_total_hospitalised_patients")
                        val todayVsYesterdayTotalHospitalisedPatients: Double,
                        @SerializedName("yesterday_confirmed")
                        val yesterdayConfirmed: Int,
                        @SerializedName("yesterday_deaths")
                        val yesterdayDeaths: Int,
                        @SerializedName("yesterday_intensive_care")
                        val yesterdayIntensiveCare: Int,
                        @SerializedName("yesterday_open_cases")
                        val yesterdayOpenCases: Int,
                        @SerializedName("yesterday_recovered")
                        val yesterdayRecovered: Int,
                        @SerializedName("yesterday_total_hospitalised_patients")
                        val yesterdayTotalHospitalisedPatients: Int
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String,
                            @SerializedName("rel")
                            val rel: String,
                            @SerializedName("type")
                            val type: String
                        )
                    }
                }

                data class Moldova(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Monaco(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Mongolia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Any,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Montenegro(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Morocco(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Mozambique(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Namibia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Nepal(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Netherlands(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Region>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )

                    data class Region(
                        @SerializedName("date")
                        val date: String,
                        @SerializedName("id")
                        val id: String,
                        @SerializedName("links")
                        val links: List<Link>,
                        @SerializedName("name")
                        val name: String,
                        @SerializedName("name_es")
                        val nameEs: String,
                        @SerializedName("name_it")
                        val nameIt: String,
                        @SerializedName("source")
                        val source: String,
                        @SerializedName("sub_regions")
                        val subRegions: List<Any>,
                        @SerializedName("today_confirmed")
                        val todayConfirmed: Int,
                        @SerializedName("today_deaths")
                        val todayDeaths: Int,
                        @SerializedName("today_new_confirmed")
                        val todayNewConfirmed: Int,
                        @SerializedName("today_new_deaths")
                        val todayNewDeaths: Int,
                        @SerializedName("today_new_open_cases")
                        val todayNewOpenCases: Int,
                        @SerializedName("today_new_recovered")
                        val todayNewRecovered: Int,
                        @SerializedName("today_open_cases")
                        val todayOpenCases: Int,
                        @SerializedName("today_recovered")
                        val todayRecovered: Int,
                        @SerializedName("today_vs_yesterday_confirmed")
                        val todayVsYesterdayConfirmed: Double,
                        @SerializedName("today_vs_yesterday_deaths")
                        val todayVsYesterdayDeaths: Double,
                        @SerializedName("today_vs_yesterday_open_cases")
                        val todayVsYesterdayOpenCases: Double,
                        @SerializedName("today_vs_yesterday_recovered")
                        val todayVsYesterdayRecovered: Double,
                        @SerializedName("yesterday_confirmed")
                        val yesterdayConfirmed: Int,
                        @SerializedName("yesterday_deaths")
                        val yesterdayDeaths: Int,
                        @SerializedName("yesterday_open_cases")
                        val yesterdayOpenCases: Int,
                        @SerializedName("yesterday_recovered")
                        val yesterdayRecovered: Int
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String,
                            @SerializedName("rel")
                            val rel: String,
                            @SerializedName("type")
                            val type: String
                        )
                    }
                }

                data class NewZealand(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Nicaragua(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Niger(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Nigeria(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class NorthMacedonia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Norway(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Oman(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Pakistan(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Panama(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class PapuaNewGuinea(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Paraguay(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Peru(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Philippines(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Poland(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Portugal(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Region>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_intensive_care")
                    val todayIntensiveCare: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_intensive_care")
                    val todayNewIntensiveCare: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_new_total_hospitalised_patients")
                    val todayNewTotalHospitalisedPatients: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_total_hospitalised_patients")
                    val todayTotalHospitalisedPatients: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_intensive_care")
                    val todayVsYesterdayIntensiveCare: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("today_vs_yesterday_total_hospitalised_patients")
                    val todayVsYesterdayTotalHospitalisedPatients: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_intensive_care")
                    val yesterdayIntensiveCare: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int,
                    @SerializedName("yesterday_total_hospitalised_patients")
                    val yesterdayTotalHospitalisedPatients: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )

                    data class Region(
                        @SerializedName("date")
                        val date: String,
                        @SerializedName("id")
                        val id: String,
                        @SerializedName("links")
                        val links: List<Link>,
                        @SerializedName("name")
                        val name: String,
                        @SerializedName("name_es")
                        val nameEs: String,
                        @SerializedName("name_it")
                        val nameIt: String,
                        @SerializedName("source")
                        val source: String,
                        @SerializedName("sub_regions")
                        val subRegions: List<Any>,
                        @SerializedName("today_confirmed")
                        val todayConfirmed: Int,
                        @SerializedName("today_deaths")
                        val todayDeaths: Int,
                        @SerializedName("today_intensive_care")
                        val todayIntensiveCare: Int,
                        @SerializedName("today_new_confirmed")
                        val todayNewConfirmed: Int,
                        @SerializedName("today_new_deaths")
                        val todayNewDeaths: Int,
                        @SerializedName("today_new_intensive_care")
                        val todayNewIntensiveCare: Int,
                        @SerializedName("today_new_open_cases")
                        val todayNewOpenCases: Int,
                        @SerializedName("today_new_recovered")
                        val todayNewRecovered: Int,
                        @SerializedName("today_new_total_hospitalised_patients")
                        val todayNewTotalHospitalisedPatients: Int,
                        @SerializedName("today_open_cases")
                        val todayOpenCases: Int,
                        @SerializedName("today_recovered")
                        val todayRecovered: Int,
                        @SerializedName("today_total_hospitalised_patients")
                        val todayTotalHospitalisedPatients: Int,
                        @SerializedName("today_vs_yesterday_confirmed")
                        val todayVsYesterdayConfirmed: Double,
                        @SerializedName("today_vs_yesterday_deaths")
                        val todayVsYesterdayDeaths: Double,
                        @SerializedName("today_vs_yesterday_intensive_care")
                        val todayVsYesterdayIntensiveCare: Any,
                        @SerializedName("today_vs_yesterday_open_cases")
                        val todayVsYesterdayOpenCases: Double,
                        @SerializedName("today_vs_yesterday_recovered")
                        val todayVsYesterdayRecovered: Any,
                        @SerializedName("today_vs_yesterday_total_hospitalised_patients")
                        val todayVsYesterdayTotalHospitalisedPatients: Any,
                        @SerializedName("yesterday_confirmed")
                        val yesterdayConfirmed: Int,
                        @SerializedName("yesterday_deaths")
                        val yesterdayDeaths: Int,
                        @SerializedName("yesterday_intensive_care")
                        val yesterdayIntensiveCare: Int,
                        @SerializedName("yesterday_open_cases")
                        val yesterdayOpenCases: Int,
                        @SerializedName("yesterday_recovered")
                        val yesterdayRecovered: Int,
                        @SerializedName("yesterday_total_hospitalised_patients")
                        val yesterdayTotalHospitalisedPatients: Int
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String,
                            @SerializedName("rel")
                            val rel: String,
                            @SerializedName("type")
                            val type: String
                        )
                    }
                }

                data class Qatar(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Romania(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Russia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Rwanda(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class SaintKittsAndNevis(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Any,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Any,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class SaintLucia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Any,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class SaintVincentAndTheGrenadines(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Any,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class SanMarino(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class SaoTomeAndPrincipe(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class SaudiArabia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Senegal(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Serbia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Seychelles(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Any,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class SierraLeone(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Singapore(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Slovakia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Slovenia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Somalia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class SouthAfrica(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class SouthSudan(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Spain(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Region>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_hospitalised_patients_with_symptoms")
                    val todayHospitalisedPatientsWithSymptoms: Int,
                    @SerializedName("today_intensive_care")
                    val todayIntensiveCare: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_hospitalised_patients_with_symptoms")
                    val todayNewHospitalisedPatientsWithSymptoms: Int,
                    @SerializedName("today_new_intensive_care")
                    val todayNewIntensiveCare: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_new_total_hospitalised_patients")
                    val todayNewTotalHospitalisedPatients: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_total_hospitalised_patients")
                    val todayTotalHospitalisedPatients: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_hospitalised_patients_with_symptoms")
                    val todayVsYesterdayHospitalisedPatientsWithSymptoms: Any,
                    @SerializedName("today_vs_yesterday_intensive_care")
                    val todayVsYesterdayIntensiveCare: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("today_vs_yesterday_total_hospitalised_patients")
                    val todayVsYesterdayTotalHospitalisedPatients: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_hospitalised_patients_with_symptoms")
                    val yesterdayHospitalisedPatientsWithSymptoms: Int,
                    @SerializedName("yesterday_intensive_care")
                    val yesterdayIntensiveCare: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int,
                    @SerializedName("yesterday_total_hospitalised_patients")
                    val yesterdayTotalHospitalisedPatients: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )

                    data class Region(
                        @SerializedName("date")
                        val date: String,
                        @SerializedName("id")
                        val id: String,
                        @SerializedName("links")
                        val links: List<Link>,
                        @SerializedName("name")
                        val name: String,
                        @SerializedName("name_es")
                        val nameEs: String,
                        @SerializedName("name_it")
                        val nameIt: String,
                        @SerializedName("source")
                        val source: String,
                        @SerializedName("sub_regions")
                        val subRegions: List<SubRegion>,
                        @SerializedName("today_confirmed")
                        val todayConfirmed: Int,
                        @SerializedName("today_deaths")
                        val todayDeaths: Int,
                        @SerializedName("today_hospitalised_patients_with_symptoms")
                        val todayHospitalisedPatientsWithSymptoms: Int,
                        @SerializedName("today_intensive_care")
                        val todayIntensiveCare: Int,
                        @SerializedName("today_new_confirmed")
                        val todayNewConfirmed: Int,
                        @SerializedName("today_new_deaths")
                        val todayNewDeaths: Int,
                        @SerializedName("today_new_hospitalised_patients_with_symptoms")
                        val todayNewHospitalisedPatientsWithSymptoms: Int,
                        @SerializedName("today_new_intensive_care")
                        val todayNewIntensiveCare: Int,
                        @SerializedName("today_new_open_cases")
                        val todayNewOpenCases: Int,
                        @SerializedName("today_new_recovered")
                        val todayNewRecovered: Int,
                        @SerializedName("today_new_total_hospitalised_patients")
                        val todayNewTotalHospitalisedPatients: Int,
                        @SerializedName("today_open_cases")
                        val todayOpenCases: Int,
                        @SerializedName("today_recovered")
                        val todayRecovered: Int,
                        @SerializedName("today_total_hospitalised_patients")
                        val todayTotalHospitalisedPatients: Int,
                        @SerializedName("today_vs_yesterday_confirmed")
                        val todayVsYesterdayConfirmed: Double,
                        @SerializedName("today_vs_yesterday_deaths")
                        val todayVsYesterdayDeaths: Double,
                        @SerializedName("today_vs_yesterday_hospitalised_patients_with_symptoms")
                        val todayVsYesterdayHospitalisedPatientsWithSymptoms: Any,
                        @SerializedName("today_vs_yesterday_intensive_care")
                        val todayVsYesterdayIntensiveCare: Double,
                        @SerializedName("today_vs_yesterday_open_cases")
                        val todayVsYesterdayOpenCases: Double,
                        @SerializedName("today_vs_yesterday_recovered")
                        val todayVsYesterdayRecovered: Double,
                        @SerializedName("today_vs_yesterday_total_hospitalised_patients")
                        val todayVsYesterdayTotalHospitalisedPatients: Double,
                        @SerializedName("yesterday_confirmed")
                        val yesterdayConfirmed: Int,
                        @SerializedName("yesterday_deaths")
                        val yesterdayDeaths: Int,
                        @SerializedName("yesterday_hospitalised_patients_with_symptoms")
                        val yesterdayHospitalisedPatientsWithSymptoms: Int,
                        @SerializedName("yesterday_intensive_care")
                        val yesterdayIntensiveCare: Int,
                        @SerializedName("yesterday_open_cases")
                        val yesterdayOpenCases: Int,
                        @SerializedName("yesterday_recovered")
                        val yesterdayRecovered: Int,
                        @SerializedName("yesterday_total_hospitalised_patients")
                        val yesterdayTotalHospitalisedPatients: Int
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String,
                            @SerializedName("rel")
                            val rel: String,
                            @SerializedName("type")
                            val type: String
                        )

                        data class SubRegion(
                            @SerializedName("date")
                            val date: String,
                            @SerializedName("id")
                            val id: String,
                            @SerializedName("name")
                            val name: String,
                            @SerializedName("name_es")
                            val nameEs: String,
                            @SerializedName("name_it")
                            val nameIt: String,
                            @SerializedName("source")
                            val source: String,
                            @SerializedName("today_confirmed")
                            val todayConfirmed: Int,
                            @SerializedName("today_deaths")
                            val todayDeaths: Int,
                            @SerializedName("today_intensive_care")
                            val todayIntensiveCare: Int,
                            @SerializedName("today_new_confirmed")
                            val todayNewConfirmed: Int,
                            @SerializedName("today_new_deaths")
                            val todayNewDeaths: Int,
                            @SerializedName("today_new_intensive_care")
                            val todayNewIntensiveCare: Int,
                            @SerializedName("today_new_recovered")
                            val todayNewRecovered: Int,
                            @SerializedName("today_new_total_hospitalised_patients")
                            val todayNewTotalHospitalisedPatients: Int,
                            @SerializedName("today_recovered")
                            val todayRecovered: Int,
                            @SerializedName("today_total_hospitalised_patients")
                            val todayTotalHospitalisedPatients: Int,
                            @SerializedName("today_vs_yesterday_confirmed")
                            val todayVsYesterdayConfirmed: Double,
                            @SerializedName("today_vs_yesterday_deaths")
                            val todayVsYesterdayDeaths: Double,
                            @SerializedName("today_vs_yesterday_intensive_care")
                            val todayVsYesterdayIntensiveCare: Double,
                            @SerializedName("today_vs_yesterday_recovered")
                            val todayVsYesterdayRecovered: Double,
                            @SerializedName("today_vs_yesterday_total_hospitalised_patients")
                            val todayVsYesterdayTotalHospitalisedPatients: Double,
                            @SerializedName("yesterday_confirmed")
                            val yesterdayConfirmed: Int,
                            @SerializedName("yesterday_deaths")
                            val yesterdayDeaths: Int,
                            @SerializedName("yesterday_intensive_care")
                            val yesterdayIntensiveCare: Int,
                            @SerializedName("yesterday_recovered")
                            val yesterdayRecovered: Int,
                            @SerializedName("yesterday_total_hospitalised_patients")
                            val yesterdayTotalHospitalisedPatients: Int
                        )
                    }
                }

                data class SriLanka(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Sudan(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Suriname(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Sweden(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Switzerland(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Region>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )

                    data class Region(
                        @SerializedName("date")
                        val date: String,
                        @SerializedName("id")
                        val id: String,
                        @SerializedName("links")
                        val links: List<Link>,
                        @SerializedName("name")
                        val name: String,
                        @SerializedName("name_es")
                        val nameEs: String,
                        @SerializedName("name_it")
                        val nameIt: String,
                        @SerializedName("source")
                        val source: String,
                        @SerializedName("sub_regions")
                        val subRegions: List<Any>,
                        @SerializedName("today_confirmed")
                        val todayConfirmed: Int,
                        @SerializedName("today_deaths")
                        val todayDeaths: Int,
                        @SerializedName("today_new_confirmed")
                        val todayNewConfirmed: Int,
                        @SerializedName("today_new_deaths")
                        val todayNewDeaths: Int,
                        @SerializedName("today_new_open_cases")
                        val todayNewOpenCases: Int,
                        @SerializedName("today_new_recovered")
                        val todayNewRecovered: Int,
                        @SerializedName("today_open_cases")
                        val todayOpenCases: Int,
                        @SerializedName("today_recovered")
                        val todayRecovered: Int,
                        @SerializedName("today_vs_yesterday_confirmed")
                        val todayVsYesterdayConfirmed: Double,
                        @SerializedName("today_vs_yesterday_deaths")
                        val todayVsYesterdayDeaths: Any,
                        @SerializedName("today_vs_yesterday_open_cases")
                        val todayVsYesterdayOpenCases: Double,
                        @SerializedName("today_vs_yesterday_recovered")
                        val todayVsYesterdayRecovered: Any,
                        @SerializedName("yesterday_confirmed")
                        val yesterdayConfirmed: Int,
                        @SerializedName("yesterday_deaths")
                        val yesterdayDeaths: Int,
                        @SerializedName("yesterday_open_cases")
                        val yesterdayOpenCases: Int,
                        @SerializedName("yesterday_recovered")
                        val yesterdayRecovered: Int
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String,
                            @SerializedName("rel")
                            val rel: String,
                            @SerializedName("type")
                            val type: String
                        )
                    }
                }

                data class Syria(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Taiwan(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Tajikistan(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Tanzania(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Thailand(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class TimorLeste(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Any,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Togo(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class TrinidadAndTobago(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Tunisia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Turkey(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class US(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Region>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )

                    data class Region(
                        @SerializedName("date")
                        val date: String,
                        @SerializedName("id")
                        val id: String,
                        @SerializedName("links")
                        val links: List<Link>,
                        @SerializedName("name")
                        val name: String,
                        @SerializedName("name_es")
                        val nameEs: String,
                        @SerializedName("name_it")
                        val nameIt: String,
                        @SerializedName("source")
                        val source: String,
                        @SerializedName("sub_regions")
                        val subRegions: List<SubRegion>,
                        @SerializedName("today_confirmed")
                        val todayConfirmed: Int,
                        @SerializedName("today_deaths")
                        val todayDeaths: Int,
                        @SerializedName("today_new_confirmed")
                        val todayNewConfirmed: Int,
                        @SerializedName("today_new_deaths")
                        val todayNewDeaths: Int,
                        @SerializedName("today_new_open_cases")
                        val todayNewOpenCases: Int,
                        @SerializedName("today_new_recovered")
                        val todayNewRecovered: Int,
                        @SerializedName("today_new_tests")
                        val todayNewTests: Int,
                        @SerializedName("today_new_total_hospitalised_patients")
                        val todayNewTotalHospitalisedPatients: Int,
                        @SerializedName("today_open_cases")
                        val todayOpenCases: Int,
                        @SerializedName("today_recovered")
                        val todayRecovered: Int,
                        @SerializedName("today_tests")
                        val todayTests: Int,
                        @SerializedName("today_total_hospitalised_patients")
                        val todayTotalHospitalisedPatients: Int,
                        @SerializedName("today_vs_yesterday_confirmed")
                        val todayVsYesterdayConfirmed: Double,
                        @SerializedName("today_vs_yesterday_deaths")
                        val todayVsYesterdayDeaths: Double,
                        @SerializedName("today_vs_yesterday_open_cases")
                        val todayVsYesterdayOpenCases: Double,
                        @SerializedName("today_vs_yesterday_recovered")
                        val todayVsYesterdayRecovered: Double,
                        @SerializedName("today_vs_yesterday_tests")
                        val todayVsYesterdayTests: Double,
                        @SerializedName("today_vs_yesterday_total_hospitalised_patients")
                        val todayVsYesterdayTotalHospitalisedPatients: Double,
                        @SerializedName("yesterday_confirmed")
                        val yesterdayConfirmed: Int,
                        @SerializedName("yesterday_deaths")
                        val yesterdayDeaths: Int,
                        @SerializedName("yesterday_open_cases")
                        val yesterdayOpenCases: Int,
                        @SerializedName("yesterday_recovered")
                        val yesterdayRecovered: Int,
                        @SerializedName("yesterday_tests")
                        val yesterdayTests: Int,
                        @SerializedName("yesterday_total_hospitalised_patients")
                        val yesterdayTotalHospitalisedPatients: Int
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String,
                            @SerializedName("rel")
                            val rel: String,
                            @SerializedName("type")
                            val type: String
                        )

                        data class SubRegion(
                            @SerializedName("date")
                            val date: String,
                            @SerializedName("id")
                            val id: String,
                            @SerializedName("name")
                            val name: String,
                            @SerializedName("name_es")
                            val nameEs: String,
                            @SerializedName("name_it")
                            val nameIt: String,
                            @SerializedName("source")
                            val source: String,
                            @SerializedName("today_confirmed")
                            val todayConfirmed: Int,
                            @SerializedName("today_deaths")
                            val todayDeaths: Int,
                            @SerializedName("today_new_confirmed")
                            val todayNewConfirmed: Int,
                            @SerializedName("today_new_deaths")
                            val todayNewDeaths: Int,
                            @SerializedName("today_new_recovered")
                            val todayNewRecovered: Int,
                            @SerializedName("today_recovered")
                            val todayRecovered: Int,
                            @SerializedName("today_vs_yesterday_confirmed")
                            val todayVsYesterdayConfirmed: Double,
                            @SerializedName("today_vs_yesterday_deaths")
                            val todayVsYesterdayDeaths: Double,
                            @SerializedName("today_vs_yesterday_recovered")
                            val todayVsYesterdayRecovered: Any,
                            @SerializedName("yesterday_confirmed")
                            val yesterdayConfirmed: Int,
                            @SerializedName("yesterday_deaths")
                            val yesterdayDeaths: Int,
                            @SerializedName("yesterday_recovered")
                            val yesterdayRecovered: Int
                        )
                    }
                }

                data class Uganda(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Ukraine(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class UnitedArabEmirates(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class UnitedKingdom(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Region>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )

                    data class Region(
                        @SerializedName("date")
                        val date: String,
                        @SerializedName("id")
                        val id: String,
                        @SerializedName("links")
                        val links: List<Link>,
                        @SerializedName("name")
                        val name: String,
                        @SerializedName("name_es")
                        val nameEs: String,
                        @SerializedName("name_it")
                        val nameIt: String,
                        @SerializedName("source")
                        val source: String,
                        @SerializedName("sub_regions")
                        val subRegions: List<SubRegion>,
                        @SerializedName("today_confirmed")
                        val todayConfirmed: Int,
                        @SerializedName("today_deaths")
                        val todayDeaths: Int,
                        @SerializedName("today_new_confirmed")
                        val todayNewConfirmed: Int,
                        @SerializedName("today_new_deaths")
                        val todayNewDeaths: Int,
                        @SerializedName("today_new_open_cases")
                        val todayNewOpenCases: Int,
                        @SerializedName("today_new_recovered")
                        val todayNewRecovered: Int,
                        @SerializedName("today_open_cases")
                        val todayOpenCases: Int,
                        @SerializedName("today_recovered")
                        val todayRecovered: Int,
                        @SerializedName("today_vs_yesterday_confirmed")
                        val todayVsYesterdayConfirmed: Double,
                        @SerializedName("today_vs_yesterday_deaths")
                        val todayVsYesterdayDeaths: Any,
                        @SerializedName("today_vs_yesterday_open_cases")
                        val todayVsYesterdayOpenCases: Double,
                        @SerializedName("today_vs_yesterday_recovered")
                        val todayVsYesterdayRecovered: Double,
                        @SerializedName("yesterday_confirmed")
                        val yesterdayConfirmed: Int,
                        @SerializedName("yesterday_deaths")
                        val yesterdayDeaths: Int,
                        @SerializedName("yesterday_open_cases")
                        val yesterdayOpenCases: Int,
                        @SerializedName("yesterday_recovered")
                        val yesterdayRecovered: Int
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String,
                            @SerializedName("rel")
                            val rel: String,
                            @SerializedName("type")
                            val type: String
                        )

                        data class SubRegion(
                            @SerializedName("date")
                            val date: String,
                            @SerializedName("id")
                            val id: String,
                            @SerializedName("name")
                            val name: String,
                            @SerializedName("name_es")
                            val nameEs: String,
                            @SerializedName("name_it")
                            val nameIt: String,
                            @SerializedName("source")
                            val source: String,
                            @SerializedName("today_confirmed")
                            val todayConfirmed: Int,
                            @SerializedName("today_intensive_care")
                            val todayIntensiveCare: Int,
                            @SerializedName("today_new_confirmed")
                            val todayNewConfirmed: Int,
                            @SerializedName("today_new_intensive_care")
                            val todayNewIntensiveCare: Int,
                            @SerializedName("today_new_total_hospitalised_patients")
                            val todayNewTotalHospitalisedPatients: Int,
                            @SerializedName("today_total_hospitalised_patients")
                            val todayTotalHospitalisedPatients: Int,
                            @SerializedName("today_vs_yesterday_confirmed")
                            val todayVsYesterdayConfirmed: Double,
                            @SerializedName("today_vs_yesterday_intensive_care")
                            val todayVsYesterdayIntensiveCare: Any,
                            @SerializedName("today_vs_yesterday_total_hospitalised_patients")
                            val todayVsYesterdayTotalHospitalisedPatients: Any,
                            @SerializedName("yesterday_confirmed")
                            val yesterdayConfirmed: Int,
                            @SerializedName("yesterday_intensive_care")
                            val yesterdayIntensiveCare: Int,
                            @SerializedName("yesterday_total_hospitalised_patients")
                            val yesterdayTotalHospitalisedPatients: Int
                        )
                    }
                }

                data class Uruguay(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Uzbekistan(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Venezuela(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Vietnam(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class WestBankAndGaza(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class WesternSahara(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Yemen(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Zambia(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }

                data class Zimbabwe(
                    @SerializedName("date")
                    val date: String,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("links")
                    val links: List<Link>,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("name_es")
                    val nameEs: String,
                    @SerializedName("name_it")
                    val nameIt: String,
                    @SerializedName("regions")
                    val regions: List<Any>,
                    @SerializedName("source")
                    val source: String,
                    @SerializedName("today_confirmed")
                    val todayConfirmed: Int,
                    @SerializedName("today_deaths")
                    val todayDeaths: Int,
                    @SerializedName("today_new_confirmed")
                    val todayNewConfirmed: Int,
                    @SerializedName("today_new_deaths")
                    val todayNewDeaths: Int,
                    @SerializedName("today_new_open_cases")
                    val todayNewOpenCases: Int,
                    @SerializedName("today_new_recovered")
                    val todayNewRecovered: Int,
                    @SerializedName("today_open_cases")
                    val todayOpenCases: Int,
                    @SerializedName("today_recovered")
                    val todayRecovered: Int,
                    @SerializedName("today_vs_yesterday_confirmed")
                    val todayVsYesterdayConfirmed: Double,
                    @SerializedName("today_vs_yesterday_deaths")
                    val todayVsYesterdayDeaths: Double,
                    @SerializedName("today_vs_yesterday_open_cases")
                    val todayVsYesterdayOpenCases: Double,
                    @SerializedName("today_vs_yesterday_recovered")
                    val todayVsYesterdayRecovered: Double,
                    @SerializedName("yesterday_confirmed")
                    val yesterdayConfirmed: Int,
                    @SerializedName("yesterday_deaths")
                    val yesterdayDeaths: Int,
                    @SerializedName("yesterday_open_cases")
                    val yesterdayOpenCases: Int,
                    @SerializedName("yesterday_recovered")
                    val yesterdayRecovered: Int
                ) {
                    data class Link(
                        @SerializedName("href")
                        val href: String,
                        @SerializedName("rel")
                        val rel: String,
                        @SerializedName("type")
                        val type: String
                    )
                }
            }

            data class Info(
                @SerializedName("date")
                val date: String,
                @SerializedName("date_generation")
                val dateGeneration: String,
                @SerializedName("yesterday")
                val yesterday: String
            )
        }
    }

    data class Metadata(
        @SerializedName("by")
        val `by`: String,
        @SerializedName("url")
        val url: List<String>
    )

    data class Total(
        @SerializedName("date")
        val date: String,
        @SerializedName("name")
        val name: String,
        @SerializedName("name_es")
        val nameEs: String,
        @SerializedName("name_it")
        val nameIt: String,
        @SerializedName("rid")
        val rid: String,
        @SerializedName("source")
        val source: String,
        @SerializedName("today_confirmed")
        val todayConfirmed: Int,
        @SerializedName("today_deaths")
        val todayDeaths: Int,
        @SerializedName("today_new_confirmed")
        val todayNewConfirmed: Int,
        @SerializedName("today_new_deaths")
        val todayNewDeaths: Int,
        @SerializedName("today_new_open_cases")
        val todayNewOpenCases: Int,
        @SerializedName("today_new_recovered")
        val todayNewRecovered: Int,
        @SerializedName("today_open_cases")
        val todayOpenCases: Int,
        @SerializedName("today_recovered")
        val todayRecovered: Int,
        @SerializedName("today_vs_yesterday_confirmed")
        val todayVsYesterdayConfirmed: Double,
        @SerializedName("today_vs_yesterday_deaths")
        val todayVsYesterdayDeaths: Double,
        @SerializedName("today_vs_yesterday_open_cases")
        val todayVsYesterdayOpenCases: Double,
        @SerializedName("today_vs_yesterday_recovered")
        val todayVsYesterdayRecovered: Double,
        @SerializedName("yesterday_confirmed")
        val yesterdayConfirmed: Int,
        @SerializedName("yesterday_deaths")
        val yesterdayDeaths: Int,
        @SerializedName("yesterday_open_cases")
        val yesterdayOpenCases: Int,
        @SerializedName("yesterday_recovered")
        val yesterdayRecovered: Int
    )
}