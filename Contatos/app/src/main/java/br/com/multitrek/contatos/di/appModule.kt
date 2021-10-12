package br.com.multitrek.contatos.di

import br.com.multitrek.contatos.datasource.ContactRemoteDataSource
import br.com.multitrek.contatos.datasource.ContactRemoteDataSourceImpl
import br.com.multitrek.contatos.repository.ContactRepository
import br.com.multitrek.contatos.repository.ContactRepositoryImpl
import br.com.multitrek.contatos.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single<ContactRepository> { ContactRepositoryImpl(get()) }
    single<ContactRemoteDataSource> { ContactRemoteDataSourceImpl(get()) }

    viewModel { MainViewModel(get()) }
}