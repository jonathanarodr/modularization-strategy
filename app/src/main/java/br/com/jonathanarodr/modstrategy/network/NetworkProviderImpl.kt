package br.com.jonathanarodr.modstrategy.network

import br.com.jonathanarodr.network.provider.NetworkProvider
import br.com.jonathanarodr.network.provider.Request
import com.google.gson.Gson

class NetworkProviderImpl(
    private val gson: Gson = Gson(),
) : NetworkProvider {

    private val mockResponse = """
        { greeting: "Hello World" }
    """.trimIndent()

    /**
     * Class responsible for using the internal sdk
     */
    @Suppress("UNCHECKED_CAST")
    override fun <T> call(request: Request, response: Class<T>): T {
        return gson.fromJson(mockResponse, response)
    }
}
