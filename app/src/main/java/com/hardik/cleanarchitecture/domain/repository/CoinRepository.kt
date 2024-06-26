package com.hardik.cleanarchitecture.domain.repository

import com.hardik.cleanarchitecture.data.remote.dto.CoinDetailDto
import com.hardik.cleanarchitecture.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}