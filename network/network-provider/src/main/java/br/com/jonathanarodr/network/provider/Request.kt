package br.com.jonathanarodr.network.provider

enum class Method {
    GET,
    POST,
    PUT,
    DELETE
}

data class Request(
    val method: Method,
    val endpoint: String,
    val body: Any? = null
)
