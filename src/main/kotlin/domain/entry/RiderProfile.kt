package org.koprotech.domain.entry

import org.koprotech.domain.value.ProviderType
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

@ExperimentalUuidApi
data class RiderProfile (
    val id: Uuid,
    val providerType: ProviderType,
    val providerId: String,
    val name: String,
)
