package com.example.nftsoko

import java.util.UUID

data class NFT (
    val title: String,
    val subtitle: String,
    val image: Int,
    var likes: Int = 0,
    var eth: Double = 0.0,
    val id: UUID = UUID.randomUUID()
)


val nfts = listOf<NFT>(
    NFT("Wave","wav2 #5672", R.drawable.card_blur, 5160, 0.018 ), // need to import card_wave2
    NFT("Abstract Pink","", R.drawable.card_blur, 1800, 0.906 ), // need to import card_pink
    NFT("Wave","wavepi #5267", R.drawable.card_blur, 2030, 0.26 ), // need to import card_wave2
    NFT("Abstract23","abstract #2038", R.drawable.card_blur, 2060 , 0.246 ), // need to import card_abs23
    NFT("Music","mali #7890", R.drawable.card_blur, 690, 0.03 ), // need to import card_musicnft
    NFT("Ball","baalli #4890", R.drawable.card_blur, 1690 , 0.46 ), // need to import card_ball
    NFT("Ring","ring #7288", R.drawable.card_blur, 400 , 0.106 ), // need to import card_ring
    NFT("Beer","beer #1238", R.drawable.card_blur, 200 , 0.26 ), // need to import card_beer



)