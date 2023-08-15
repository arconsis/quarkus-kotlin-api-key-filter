package com.arconsis.quarkus.youtube

import io.quarkus.security.UnauthorizedException
import jakarta.ws.rs.container.ContainerRequestContext
import org.eclipse.microprofile.config.inject.ConfigProperty
import org.jboss.resteasy.reactive.server.ServerRequestFilter

class MyApiKeyFilter(@ConfigProperty(name = "my.application.api-keys") private val apiKeys: List<String>) {

    @ServerRequestFilter(preMatching = true)
    fun filterApiKey(containerRequestContext: ContainerRequestContext) {
        val apiKeyHeader = containerRequestContext.getHeaderString("x-api-key")

        if (!apiKeys.contains(apiKeyHeader)) {
            throw UnauthorizedException()
        }
    }
}