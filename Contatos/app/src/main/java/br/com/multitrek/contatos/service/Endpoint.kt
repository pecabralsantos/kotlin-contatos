package br.com.multitrek.contatos.service

import br.com.multitrek.contatos.model.Contact
import retrofit2.Call
import retrofit2.http.GET

interface Endpoint {

    @GET("contacts")
    suspend fun getContactsList(): Call<List<Contact>>

}