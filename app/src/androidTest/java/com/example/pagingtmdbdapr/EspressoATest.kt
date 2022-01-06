package com.example.pagingtmdbdapr

// not static below
//import static androidx.fragment.app.testing.launchFragmentInContainer;
//import static androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
// not static below
//import static androidx.fragment.app.testing.launchFragmentInContainer;
//import static androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


//@RunWith(AndroidJUnit4::class)
@RunWith(AndroidJUnit4ClassRunner::class)
public class EspressoATest//: AppCompatActivity()
{var act: ActivityScenario<Toolmenu>? = null

// Rule and ViewAssertion

    @Before
    fun setup(){
       // act = launchActivity()
    }

    @Test
    fun testAddingSpend() {

      //  var firstActivity: IntentsTestRule<Toolmenu> = IntentsTestRule(Toolmenu::class.java)
       // firstActivity.launchActivity(Intent())
        onView(withId(R.id.texttet)) // withId(R.id.my_view) is a ViewMatcher
           // .perform(click()) // click() is a ViewAction
            //  .check(matches(isDisplayed()));
            .check(matches(withText("tet")))


        /*

        val amount = 100
        val desc = "Bought Eggs"
        //Espresso Matcher and Action
        onView(withId(R.id.edit_text_amount)).perform(typeText(amount.toString()))
        onView(withId(R.id.edit_text_description)).perform(typeText(desc))
        Espresso.closeSoftKeyboard()
        onView(withId(R.id.button_add)).perform(click())

        //Assertion
        onView(withId(R.id.text_view_success_message)).check(matches(withText("Spend Added")))

    }
      */
    }
}