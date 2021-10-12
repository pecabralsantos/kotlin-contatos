package br.com.multitrek.contatos.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MockApiModule {

    fun clientProvider(): MockApiEndpoint {
        return Retrofit.Builder()
            .baseUrl(URLs.MOCK_API.url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MockApiEndpoint::class.java)
    }

}