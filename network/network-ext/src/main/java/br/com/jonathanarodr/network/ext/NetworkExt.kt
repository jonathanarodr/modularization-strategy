package br.com.jonathanarodr.network.ext

import br.com.jonathanarodr.network.provider.NetworkProvider
import br.com.jonathanarodr.network.provider.Request

inline fun <reified T> safeCallApi(provider: NetworkProvider, request: Request, block: T.() -> Unit = { }) {
    try {
        provider.call(request, T::class.java).run(block)
    } catch (exeption: Exception) {
        println(exeption)
    }
}
