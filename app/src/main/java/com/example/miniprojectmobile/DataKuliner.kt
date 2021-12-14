package com.example.miniprojectmobile

data class KulinerItem(val jamBukaTutup: String,
                       val kordinat: String,
                       val nama: String,
                       val gambarUrl: String,
                       val kategori: String,
                       val id: Int = 0,
                       val alamat: String)


data class DataKuliner(val kuliner: List<KulinerItem>?)
