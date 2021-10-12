package br.com.multitrek.contatos.repository

import br.com.multitrek.contatos.datasource.ContactRemoteDataSource
import br.com.multitrek.contatos.model.Contact
import retrofit2.Call
import retrofit2.Response


interface ContactRepository {
    suspend fun getAllContacts(): Response<List<Contact>>
}

class ContactRepositoryImpl(
    private val contactRemoteDataSource: ContactRemoteDataSource
) : ContactRepository {

    override suspend fun getAllContacts(): Response<List<Contact>> =
        contactRemoteDataSource.getAllContacts()

}