package jnowacki;

import org.assertj.core.api.AbstractAssert;

public class PersonAssert extends AbstractAssert<PersonAssert, Person> {

    public PersonAssert(Person actual) {
        super(actual, PersonAssert.class);
    }

    public static PersonAssert assertThat(Person actual) {
        return new PersonAssert(actual);
    }

    public PersonAssert isOver18() {
        isNotNull();

        if (actual.getAge() < 18) {
            failWithMessage("Expected person age to be over 18, was <%s>", actual.getAge());
        }

        return this;
    }

    public PersonAssert isUnder65() {
        isNotNull();

        if (actual.getAge() > 65) {
            failWithMessage("Expected person age to be under 65, was <%s>", actual.getAge());
        }

        return this;
    }
}
