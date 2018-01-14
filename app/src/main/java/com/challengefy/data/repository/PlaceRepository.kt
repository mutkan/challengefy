package com.challengefy.data.repository

import com.challengefy.data.model.Address
import com.challengefy.data.model.PredictionAddress
import com.google.android.gms.maps.model.LatLng
import io.reactivex.Single

interface PlaceRepository {
    fun autoComplete(
            query: String,
            northeast: LatLng?,
            southwest: LatLng?
    ): Single<List<PredictionAddress>>

    fun detailPrediction(predictionAddress: PredictionAddress): Single<Address>
    fun getCurrentPlace(): Single<Address>
}
