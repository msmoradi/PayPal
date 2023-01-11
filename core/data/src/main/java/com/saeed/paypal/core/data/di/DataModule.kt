package com.saeed.paypal.core.data.di

import com.saeed.paypal.core.data.repository.ActivitiesRepository
import com.saeed.paypal.core.data.repository.fake.FakeActivitiesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    @Binds
    fun bindsActivitiesRepository(
        topicsRepository: FakeActivitiesRepository
    ): ActivitiesRepository
}
