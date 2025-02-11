package com.melvin.ongandroid.model.login

import com.google.gson.annotations.SerializedName

// data class that represents the user object
data class User(
    @SerializedName("id") val id: Int = 0,
    @SerializedName("name") var name: String = "",
    @SerializedName("email") var email: String = "",
    @SerializedName("password") val password: String = "",
    @SerializedName("profile_image") val imageProfile: String? = ""
)