package com.barasan.myhilt.module

import com.barasan.myhilt.module.qualifier.Hashcode
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object HashcodModule {

    @Hashcode
    @Provides
    fun provideHashcode() = hashCode().toString()

}

