package es.manudev.data.login.network

import es.manudev.data.login.network.model.TestResponse
import retrofit2.Response
import retrofit2.http.GET

interface TestApiClient {

    @GET("/v3/f78c9d33-28b1-4f81-9cf1-6d6ff78fa014")
    suspend fun doTest(): Response<TestResponse>

}
