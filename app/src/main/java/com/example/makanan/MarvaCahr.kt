package com.example.makanan

import com.example.makanan.R

data class MarvaCahr(
    var charName: String,
    var name : String,
    var imageRes : Int,
)

fun getAllMarvaCahr(): List<MarvaCahr> {
    return listOf(
        MarvaCahr("nasigoreng", "makanan sedap",R.drawable.nasigoreng),
        MarvaCahr("panggang", "makanan sedap",R.drawable.panggang),
        MarvaCahr("bakso", "makanan sedap",R.drawable.bakso),
        MarvaCahr("penyet", "makanan sedap",R.drawable.penyet),
        MarvaCahr("mieayam", "makanan sedap",R.drawable.mieayam),
        MarvaCahr("rendang", "makanan sedap",R.drawable.rendang),
        MarvaCahr("bakmi", "makanan sedap",R.drawable.bakmi),
        MarvaCahr("ayam", "makanan sedap",R.drawable.ayam),
        MarvaCahr("telur", "makanan sedap",R.drawable.telur),
        MarvaCahr("nasipadang", "makanan sedap",R.drawable.nasipadang)
    )
}
