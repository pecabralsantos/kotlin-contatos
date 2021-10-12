package br.com.multitrek.contatos.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.multitrek.contatos.model.Contact
import br.com.multitrek.contatos.repository.ContactRepository
import kotlinx.coroutines.launch

class MainViewModel(
    private val contactRepository: ContactRepository
) : ViewModel() {

    private val list: MutableLiveData<List<Contact>> = MutableLiveData()

    init {
        getAll()
    }

    private fun getAll() {
        viewModelScope.launch {
            val response = contactRepository.getAllContacts()
            if (response.isSuccessful) {
                list.value = response.body()
            } else {
                Log.e("ERROR", "Deu ruim")
            }
        }
    }

}