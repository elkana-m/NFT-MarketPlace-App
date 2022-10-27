package com.example.nftsoko

import java.util.UUID

data class NFTCategories (
    val title: String,
    val image: Int,
    val id: UUID = UUID.randomUUID()
)

val categories = listOf<NFTCategories>(
    NFTCategories("Music", R.drawable.card_blur), // need to import card_music
    NFTCategories("Art", R.drawable.card_blur), // need to import card_art
    NFTCategories("Virtual Worlds", R.drawable.card_blur) // need to import card_vw
)
