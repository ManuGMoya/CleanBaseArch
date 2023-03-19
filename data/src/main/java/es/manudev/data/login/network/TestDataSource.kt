package es.manudev.data.login.network

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class TestDataSource @Inject constructor(private val testApiClient: TestApiClient) {

    suspend fun doTest(): Boolean {
        return withContext(Dispatchers.IO) {
            val response = testApiClient.doTest()
            response.body()?.success ?: false
        }
    }
}
