package jnowacki;

import org.junit.Test;

import static jnowacki.CarAssert.assertThat;

public class CarTest {

    @Test
    public void testCar() {
        assertThat(new Car("mazda")).isOk();
    }

    @Test
    public void testCarAge() {
        assertThat(new Car("mazda", 2000))
        .isItSafeToDriveItInYear(2025);
    }
}
