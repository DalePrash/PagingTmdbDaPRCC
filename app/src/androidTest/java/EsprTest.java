

// only static works in these imports and trying in androidTest
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import  static androidx.test.espresso.matcher.ViewMatchers.withText;

// not static below
import  android.os.Bundle;
//import static androidx.fragment.app.testing.launchFragmentInContainer;
import com.example.pagingtmdbdapr.R;
import com.example.pagingtmdbdapr.combinedroomservice.CombinedActivity;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import  static androidx.test.espresso.matcher.ViewMatchers.withText;

//import static androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import static androidx.test.espresso.action.ViewActions.click;

@RunWith(AndroidJUnit4.class)
class EsprTest {




   /*     @Rule
        public ActivityTestRule<CombinedActivity> mActivityRule =
                new ActivityTestRule<>(CombinedActivity.class);

    */

@Test
public void d()
{
        onView(withId(R.id.buttonXX))            // withId(R.id.my_view) is a ViewMatcher
                .perform(click())               // click() is a ViewAction
              //  .check(matches(isDisplayed()));
                .check(matches(withText("goToNext")));

}

}
