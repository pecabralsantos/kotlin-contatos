package br.com.multitrek.contatos.datasource

import br.com.multitrek.contatos.model.Contact
import br.com.multitrek.contatos.service.MockApiModule
import retrofit2.Call
import retrofit2.Response

interface ContactRemoteDataSource {
    suspend fun getAllContacts(): Response<List<Contact>>
}

class ContactRemoteDataSourceImpl(
    private val mockApiModule: MockApiModule
) : ContactRemoteDataSource {

    override suspend fun getAllContacts(): Response<List<Contact>> =
        mockApiModule.clientProvider().getAllContacts()

}