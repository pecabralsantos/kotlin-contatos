package br.com.multitrek.contatos.repository

import br.com.multitrek.contatos.model.Contact
import br.com.multitrek.contatos.service.MockApiClient
import retrofit2.Call

interface ContactRepository {
    suspend fun getContactsList(): Call<List<Contact>>
}

class ContactRepositoryImpl(
    private val mockApiClient: MockApiClient
) : ContactRepository {

    override suspend fun getContactsList(): Call<List<Contact>> =
        mockApiClient.clientProvider().getContactsList()

}