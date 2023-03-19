package es.manudev.domain.usecase

import es.manudev.domain.repository.ITestRepository
import javax.inject.Inject

class TestUseCase @Inject constructor(
    private val repository: ITestRepository
) {
    suspend operator fun invoke(): Boolean {
        return repository.testCallRetrofit()
    }
}
