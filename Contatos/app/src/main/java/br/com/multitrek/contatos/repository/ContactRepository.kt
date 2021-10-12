package br.com.multitrek.contatos.repository

import br.com.multitrek.contatos.datasource.ContactRemoteDataSource
import br.com.multitrek.contatos.model.Contact
import retrofit2.Call


interface ContactRepository {
    suspend fun getAllContacts(): Call<List<Contact>>
}

class ContactRepositoryImpl(
    private val contactRemoteDataSource: ContactRemoteDataSource
) : ContactRepository {

    override suspend fun getAllContacts(): Call<List<Contact>> =
        contactRemoteDataSource.getAllContacts()

}