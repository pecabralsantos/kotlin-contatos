package br.com.multitrek.contatos.service

import br.com.multitrek.contatos.model.Contact
import retrofit2.Call
import retrofit2.http.GET

interface MockApiEndpoint {

    @GET("contacts/1")
    suspend fun getAllContacts(): Call<List<Contact>>

}