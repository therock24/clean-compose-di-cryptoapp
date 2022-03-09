package com.therock24.cleanarch_di_cryptoapp.data.repository

import com.therock24.cleanarch_di_cryptoapp.data.remote.CoinPaprikaApi
import com.therock24.cleanarch_di_cryptoapp.data.remote.dto.CoinDetailDto
import com.therock24.cleanarch_di_cryptoapp.data.remote.dto.CoinDto
import com.therock24.cleanarch_di_cryptoapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImplementation @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}