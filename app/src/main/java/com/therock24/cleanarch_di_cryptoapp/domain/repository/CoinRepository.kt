package com.therock24.cleanarch_di_cryptoapp.domain.repository

import com.therock24.cleanarch_di_cryptoapp.data.remote.dto.CoinDetailDto
import com.therock24.cleanarch_di_cryptoapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

    // add functions for local cache here
}