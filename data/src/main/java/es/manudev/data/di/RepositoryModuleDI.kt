package es.manudev.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import es.manudev.data.login.TestRepository
import es.manudev.domain.repository.ITestRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class RepositoryModuleDI {

    @Singleton
    @Binds
    abstract fun provideLoginRepository(impl: TestRepository): ITestRepository
}
