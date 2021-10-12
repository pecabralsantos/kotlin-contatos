package br.com.multitrek.contatos.ui

import androidx.lifecycle.ViewModel
import br.com.multitrek.contatos.repository.ContactRemoteRepository

class MainViewModel constructor(
    private val contactRemoteRepository: ContactRemoteRepository
) : ViewModel() {}