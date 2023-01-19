package ru.stas

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    var name: String,
    var age: Int,
    var sex: Boolean
): Parcelable