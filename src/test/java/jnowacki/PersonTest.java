package jnowacki;

import org.junit.Test;

import static jnowacki.PersonAssert.assertThat;

public class PersonTest {

    @Test
    public void t1() {
        assertThat(new Person( 19, "asd")).isOver18();
    }
}