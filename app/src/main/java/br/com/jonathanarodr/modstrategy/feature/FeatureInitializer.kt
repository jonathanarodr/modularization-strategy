package br.com.jonathanarodr.modstrategy.feature

import br.com.jonathanarodr.feature.FeatureProviderImpl
import br.com.jonathanarodr.feature.FeatureProvider
import br.com.jonathanarodr.modstrategy.network.NetworkProviderImpl

class FeatureInitializer(
    private val featureProvider: FeatureProvider = FeatureProviderImpl(
        provider = NetworkProviderImpl(),
    ),
) {

    operator fun invoke() {
        featureProvider()
    }
}
