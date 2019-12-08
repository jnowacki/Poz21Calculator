package jnowacki;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestExercisesTest {

    @Test
    public void fiveShouldBeGreaterThanThree() {
        assertThat(5, is(greaterThan(3)));
    }

    @Test
    public void emptyStringShouldBeEmpty() {
    }

    @Test
    public void doesStringContainKonfabulacja() {
    }

    @Test
    public void doesArrayContainRightValues() {

    }

    @Test
    public void doesArrayContainRightValuesInAnyOrder() {
    }

    @Test
    public void doesListContainAndHasRightLength() {

    }
}
