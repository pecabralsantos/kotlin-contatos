package br.com.multitrek.contatos.datasource

import br.com.multitrek.contatos.model.Contact
import br.com.multitrek.contatos.service.MockApiModule
import retrofit2.Call

class ContactRemoteDataSource constructor(
    private val mockApiModule: MockApiModule
) {
    suspend fun getAllContacts(): Call<List<Contact>> =
        mockApiModule.clientProvider().getAllContacts()
}