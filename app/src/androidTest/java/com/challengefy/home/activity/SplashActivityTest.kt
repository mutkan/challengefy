package com.challengefy.home.activity

import android.content.Intent
import android.support.test.espresso.intent.Intents
import android.support.test.espresso.intent.Intents.intended
import android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.challengefy.estimate.activity.EstimateActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SplashActivityTest {

    @Rule
    @JvmField
    val rule = ActivityTestRule<SplashActivity>(SplashActivity::class.java, false, false)

    @Test
    fun testNavigatorIsBeingCalled() {
        Intents.init()

        rule.launchActivity(Intent())
        intended(hasComponent(EstimateActivity::class.java.name))

        Intents.release()
    }
}