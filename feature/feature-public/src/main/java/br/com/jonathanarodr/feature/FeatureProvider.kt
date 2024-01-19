package br.com.jonathanarodr.feature

import br.com.jonathanarodr.network.provider.NetworkProvider

interface FeatureProvider {

    val provider: NetworkProvider

    operator fun invoke()
}
