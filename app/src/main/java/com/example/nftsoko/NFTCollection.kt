package com.example.nftsoko

data class NFTCollection (
    val title: String,
    val image: Int,
    var likes: Int
)

val collections = listOf<NFTCollection>(
    NFTCollection("3D Art", R.drawable.card_blur, 123), // need to import card_3d
    NFTCollection("Abstract Art", R.drawable.card_blur, 200), // need to import abstract
    NFTCollection("Portrait Art", R.drawable.card_blur, 242), // need to import portrait
    NFTCollection("Metaverse", R.drawable.card_blur, 420), // need to import metaverse
)