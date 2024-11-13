package io.github.guilhermemelo01.activityfragments

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Filme(
    val nome: String,
    val descricao: String,
    val avaliacoes: Double,
    val diretor: String,
    val distribuidor: String,
) : Parcelable

//data class Filme(
//    val nome: String,
//    val descricao: String,
//    val avaliacoes: Double,
//    val diretor: String,
//    val distribuidor: String,
//) : Serializable