package com.barasan.myhilt.module

import com.barasan.myhilt.module.qualifier.TestHashcode
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object TestHashcodModule {

    @TestHashcode
    @Provides
    fun provideTestHashcode() = hashCode().toString()

}

