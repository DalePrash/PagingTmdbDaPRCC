package com.example.pagingtmdbdapr

//import androidx.test.

//import android.support.test.rule.ActivityTestRule

import android.R
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
public class ActivityInputOutputTest {


   // @Rule
   @get:Rule
    public var activityRule = ActivityTestRule(Toolmenu::class.java)

    @Test
    fun testCLick() {
        onView(ViewMatchers.withId(com.example.pagingtmdbdapr.R.id.buttonmenu)) // withId(R.id.my_view) is a ViewMatcher
             .perform(click()) // click() is a ViewAction
          //   .check(matches(isDisplayed()));
            .check(ViewAssertions.matches(ViewMatchers.withText("gofToNext")))
    }


/*
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.pagingtmdbdapr", appContext.packageName)
    }

 */

    @Test
    fun activityLaunch() {
        onView(ViewMatchers.withId(com.example.pagingtmdbdapr.R.id.texttet)) // withId(R.id.my_view) is a ViewMatcher
            // .perform(click()) // click() is a ViewAction
            //  .check(matches(isDisplayed()));
            .check(ViewAssertions.matches(ViewMatchers.withText("tet")))


     /*   onView(withId(R.id.button_main)).perform(click())
        onView(withId(R.id.text_header)).check(matches(isDisplayed()))
        onView(withId(R.id.button_second)).perform(click())
        onView(withId(R.id.text_header_reply)).check(matches(isDisplayed()))

      */
    }
}