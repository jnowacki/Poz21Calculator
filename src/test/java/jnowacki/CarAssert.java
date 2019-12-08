package jnowacki;

import org.assertj.core.api.AbstractAssert;

public class CarAssert extends AbstractAssert<CarAssert, Car> {

    public CarAssert(Car actual) {
        super(actual, CarAssert.class);
    }

    public static CarAssert assertThat(Car actual) {
        return new CarAssert(actual);
    }


    public CarAssert isOk() {
        isNotNull();

        if (*) {
            failWithMessage("Expected person age to be under 65, was <%s>", actual.getAge());
        }

        return this;
    }
}
