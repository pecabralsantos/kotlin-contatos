package br.com.multitrek.contatos.repository

import br.com.multitrek.contatos.datasource.ContactRemoteDataSource
import br.com.multitrek.contatos.model.Contact
import retrofit2.Call

class ContactRemoteRepository constructor(
    private val contactRemoteDataSource: ContactRemoteDataSource
) {
    suspend fun getAllContacts(): Call<List<Contact>> =
        contactRemoteDataSource.getAllContacts()
}