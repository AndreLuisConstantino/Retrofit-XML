package br.senai.sp.jandira.retrofit_reqres

import retrofit2.Retrofit

object RetrofitHelper {

    private const val baseurl = "https://www.reqres.in/"

    fun getInstance(): Retrofit{

        return Retrofit.Builder()
            .baseUrl(baseurl)
            .addConverterFactory()
    }

}