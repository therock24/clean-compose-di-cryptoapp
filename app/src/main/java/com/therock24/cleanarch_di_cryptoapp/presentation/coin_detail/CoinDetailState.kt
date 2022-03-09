package com.therock24.cleanarch_di_cryptoapp.presentation.coin_detail

import com.therock24.cleanarch_di_cryptoapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
