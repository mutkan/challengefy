package com.challengefy.base.di.module

import com.challengefy.base.di.scope.ActivityScope
import com.challengefy.estimate.activity.EstimateActivity
import com.challengefy.estimate.module.EstimateModule
import com.challengefy.home.activity.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindModule {

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun injectorSplashActivity(): SplashActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [EstimateModule::class])
    abstract fun injectorEstimateActivity(): EstimateActivity
}
