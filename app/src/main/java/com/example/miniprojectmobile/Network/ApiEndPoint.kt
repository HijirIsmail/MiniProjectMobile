package com.example.miniprojectmobile.Network

import id.ac.unhas.winfood.DataKuliner
import retrofit2.Call
import retrofit2.http.GET


interface api {

    @GET("api/purwakarta/kuliner")

    fun getDataKuliner(): Call<DataKuliner>
}