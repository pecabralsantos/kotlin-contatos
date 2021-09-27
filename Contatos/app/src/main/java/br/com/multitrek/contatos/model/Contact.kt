package br.com.multitrek.contatos.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Contact(
    val id: String,
    val photo: String,
    val name: String,
    val phone: String,
    val email: String,
    val birthday: String,
    val about: String
) : Parcelable
