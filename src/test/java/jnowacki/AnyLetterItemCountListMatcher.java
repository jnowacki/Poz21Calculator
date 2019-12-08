package jnowacki;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import java.util.List;

public class AnyLetterItemCountListMatcher extends TypeSafeMatcher<List<String>> {

    private int length;

    static AnyLetterItemCountListMatcher hasOnly3LetterCountItems(int length) {
        return new AnyLetterItemCountListMatcher(length);
    }

    public AnyLetterItemCountListMatcher(int length) {
        this.length = length;
    }

    @Override
    protected boolean matchesSafely(List<String> strings) {
        return strings.stream().allMatch(item -> item.length() == length);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("has only items with " + length + " letters");
    }
}

