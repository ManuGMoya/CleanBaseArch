package es.manudev.domain.repository

interface ITestRepository {
    suspend fun testCallRetrofit(user: String, password: String): Boolean
}
