package org.koprotech

import org.koprotech.domain.entry.RiderProfile
import org.koprotech.domain.value.ProviderType
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

@ExperimentalUuidApi
fun main() {
    val riderProfile = RiderProfile(
        id = Uuid.random(),
        providerType = ProviderType.STRAVA,
        providerId = "12345",
        name = "John Doe",
    )

    println("Rider Profile: $riderProfile")
}