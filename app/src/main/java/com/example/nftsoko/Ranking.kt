package com.example.nftsoko

import java.util.UUID

data class Ranking (
    val title: String,
    val image: Int,
    var percentChange: Double = 0.0,
    var eth: Double = 0.0,
    val id: UUID = UUID.randomUUID()
)

var rankings = listOf<Ranking>(
    Ranking("Azumi", R.drawable.card_blur, 3.99, 200055.02),  // import ranking01
    Ranking("Hape prime", R.drawable.card_blur, 33.79, 180055.45),  // import ranking02
    Ranking("Cryoto", R.drawable.card_blur, -6.56, 90055.62),  // import ranking03
    Ranking("Ape Club", R.drawable.card_blur, 3.99, 88055.12),  // import ranking04
    Ranking("Bat", R.drawable.card_blur, 3.99, 10055.06),  // import ranking05
    Ranking("Mutant", R.drawable.card_blur, 3.99, 9095.27),  // import ranking06
    Ranking("Metaverse", R.drawable.card_blur, -3.53, 2342.4),  // import ranking07
    Ranking("Mountain", R.drawable.card_blur, 5.23, 2349024.53),  // import ranking08
    Ranking("Mutant Ape", R.drawable.card_blur, -23.4, 93492.3),  // import ranking09
    Ranking("The Mountain", R.drawable.card_blur, 302.3, 239802.3)  // import ranking10
)