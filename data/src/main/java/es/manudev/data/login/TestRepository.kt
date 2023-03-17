package es.manudev.data.login

import es.manudev.data.login.network.TestDataSource
import es.manudev.domain.repository.ITestRepository
import javax.inject.Inject

class TestRepository @Inject constructor(
    private val api: TestDataSource
) : ITestRepository {

    override suspend fun testCallRetrofit(user: String, password: String): Boolean {
        return api.doTest(user, password)
    }

}
