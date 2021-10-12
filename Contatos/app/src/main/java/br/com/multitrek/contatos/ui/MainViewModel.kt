package br.com.multitrek.contatos.ui

import androidx.lifecycle.ViewModel
import br.com.multitrek.contatos.repository.ContactRepository

class MainViewModel(
    private val contactRepository: ContactRepository
) : ViewModel() {}