package com.therock24.cleanarch_di_cryptoapp.presentation.coin_list

import com.therock24.cleanarch_di_cryptoapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
