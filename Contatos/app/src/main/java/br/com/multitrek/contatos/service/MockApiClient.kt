package br.com.multitrek.contatos.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MockApiClient {

    fun clientProvider(): Endpoint {
        return Retrofit.Builder()
            .baseUrl(URLs.MOCK_API.url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Endpoint::class.java)
    }

}