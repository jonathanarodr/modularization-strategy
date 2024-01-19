package br.com.jonathanarodr.feature

import br.com.jonathanarodr.network.ext.safeCallApi
import br.com.jonathanarodr.network.provider.Method
import br.com.jonathanarodr.network.provider.NetworkProvider
import br.com.jonathanarodr.network.provider.Request

class FeatureProviderImpl(
    override val provider: NetworkProvider,
): FeatureProvider {

    override fun invoke() {
        val request = Request(Method.GET, "foo-bar")

        safeCallApi<GreetingResponse>(provider, request) {
            println("Response is $this")
        }
    }
}
