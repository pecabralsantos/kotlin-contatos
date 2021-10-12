package br.com.multitrek.contatos.service

import br.com.multitrek.contatos.model.Contact
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface MockApiEndpoint {

    @GET("contacts")
    suspend fun getAllContacts(): Response<List<Contact>>

}