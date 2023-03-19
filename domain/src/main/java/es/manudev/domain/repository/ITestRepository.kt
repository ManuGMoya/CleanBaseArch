package es.manudev.domain.repository

interface ITestRepository {
    suspend fun testCallRetrofit(): Boolean
}
