package com.codeavial.prostudent.di


import com.codeavial.prostudent.data.repository.SessionRepositoryImpl
import com.codeavial.prostudent.data.repository.SubjectRepositoryImpl
import com.codeavial.prostudent.data.repository.TaskRepositoryImpl
import com.codeavial.prostudent.domain.repository.SessionRepository
import com.codeavial.prostudent.domain.repository.SubjectRepository
import com.codeavial.prostudent.domain.repository.TaskRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindSubjectRepository(
        impl: SubjectRepositoryImpl
    ): SubjectRepository

    @Singleton
    @Binds
    abstract fun bindTaskRepository(
        impl: TaskRepositoryImpl
    ): TaskRepository

    @Singleton
    @Binds
    abstract fun bindSessionRepository(
        impl: SessionRepositoryImpl
    ): SessionRepository
}