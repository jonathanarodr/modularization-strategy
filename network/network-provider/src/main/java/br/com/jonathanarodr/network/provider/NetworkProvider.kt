package br.com.jonathanarodr.network.provider

interface NetworkProvider {
    fun <T> call(request: Request, response: Class<T>): T
}
