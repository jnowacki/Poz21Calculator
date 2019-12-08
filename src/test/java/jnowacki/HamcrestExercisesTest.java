package jnowacki;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static jnowacki.AnyLetterItemCountListMatcher.hasOnly3LetterCountItems;
import static jnowacki.PersonSchoolAgeMatcher.isEligibleToSchool;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestExercisesTest {

    @Test
    public void fiveShouldBeGreaterThanThree() {
        assertThat(5, is(greaterThan(3)));
    }

    @Test
    public void emptyStringShouldBeEmpty() {
        assertThat("", isEmptyOrNullString());
    }

    @Test
    public void doesStringContainKonfabulacja() {

        String value = "afdsfdsfdsfaqwtjjfvvjfyu";

        assertThat(value, not(containsString("konfabulacja")));
    }

    @Test
    public void doesArrayContainRightValues() {

        Integer[] values = {5, 7, 2};

        assertThat(values, arrayContaining(5, 7, 2));
    }

    @Test
    public void doesArrayContainRightValuesInAnyOrder() {

        Integer[] values = {5, 7, 2};

        assertThat(values, arrayContainingInAnyOrder(2, 5, 7));
    }

    @Test
    public void doesListContainAndHasRightLength() {

        List<String> values = Arrays.asList("raz", "dwa", "trzy");

        assertThat(values, hasItem("dwa"));
        assertThat(values, hasSize(3));
    }

    @Test
    public void shouldBeginWithA() {
        String testedValue = "aString";

        assertThat(testedValue, beginsWith(is('a')));
    }

    private static Matcher<String> beginsWith(Matcher<? super Character> matcher) {
        return new FeatureMatcher<String, Character>(matcher,
                "a String that begins with", "first letter") {
            @Override
            protected Character featureValueOf(String actual) {
                return actual.charAt(0);
            }
        };
    }

    private static Matcher<String> hasGivenLength(Matcher<? super Integer> matcher) {
        return new FeatureMatcher<String, Integer>(matcher,
                "a String that begins with", "first letter") {
            @Override
            protected Integer featureValueOf(String actual) {
                return actual.length();
            }
        };
    }

    @Test
    public void shouldHaveLength3() {
        String testedValue = "aaa";

        assertThat(testedValue, hasGivenLength(is(3)));
    }

    @Test
    public void shouldHaveLength6() {
        String testedValue = "aaaaaa";

        assertThat(testedValue, hasGivenLength(is(6)));
    }

    @Test
    public void shouldHaveLength12() {
        String testedValue = "aaaaaaaaaaaa";

        assertThat(testedValue, hasGivenLength(is(12)));
    }

    public static Matcher<NumberWrapper> returnsRightNumber(Matcher<? super Integer> matcher) {
        return new FeatureMatcher<NumberWrapper, Integer>(matcher, "a wrapper that returns", "returned value") {
            @Override
            protected Integer featureValueOf(NumberWrapper actual) {
                return actual.getNumber();
            }
        };
    }

    @Test
    public void shouldReturn15() {
        Integer testedValue = 15;

        assertThat(new NumberWrapper(), returnsRightNumber(is(testedValue)));
    }

    @Test
    public void shouldHaveOnly3LetterItems() {
        List<String> myList = Arrays.asList("as", "da", "rt");

        assertThat(myList, hasOnly3LetterCountItems(2));
    }

    @Test
    public void testPersonAge() {
        assertThat(new Person(1), not(isEligibleToSchool()));
        assertThat(new Person(6), isEligibleToSchool());
        assertThat(new Person(12), isEligibleToSchool());
    }
}
