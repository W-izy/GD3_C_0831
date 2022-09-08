package com.wisnawa.gd3_c_0831.entity

class Dosen (var name: String, var pengajar : String) {

    //companion object seperti static di java dan berikut adalah array untuk menyimpan data dummy mahasiswa
    companion object{
        @JvmField
        var listofDosen = arrayOf(
            Dosen("Fedelis Brian", "Pengajar kelas A, B, dan D"),
            Dosen("Thomas Adi", "Pengajar Kelas C")
        )
    }
}