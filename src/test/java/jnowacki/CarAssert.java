package jnowacki;

import org.assertj.core.api.AbstractAssert;

import java.util.Arrays;
import java.util.List;

public class CarAssert extends AbstractAssert<CarAssert, Car> {

    public CarAssert(Car actual) {
        super(actual, CarAssert.class);
    }

    public static CarAssert assertThat(Car actual) {
        return new CarAssert(actual);
    }


    public CarAssert isOk() {
        isNotNull();

        List<String> frenchCars = Arrays.asList("citroen", "peugeot", "renault");
        String actualName = actual.getManufacturer().toLowerCase();

        if (frenchCars.contains(actualName) || actualName.startsWith("f")) {
            failWithMessage("Car should not be french or strating with f");
        }

        return this;
    }

    public CarAssert isItSafeToDriveItInYear(int year) {

    }
}
