package com.udacity.gradle.builditbigger;

/**
 * Created by Ro on 17/12/2017.
 */

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<com.udacity.gradle.builditbigger.MainActivity> mActivityTestRule =
            new ActivityTestRule<>(com.udacity.gradle.builditbigger.MainActivity.class);

    @Test
    public void mainActivityTest() {
        //Click Button and wait for view transition
        onView(withId(R.id.btnJoke)).perform(click());
        //After view transition check for null or timeout strings.
        onView(withId(R.id.tvJoke))
                .check(matches(not(withText("")))).check(matches(not(withText("timeout"))));
    }
}