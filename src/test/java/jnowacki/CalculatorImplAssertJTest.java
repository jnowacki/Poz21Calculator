package jnowacki;

import org.junit.*;
import static org.assertj.core.api.Assertions.*;

public class CalculatorImplAssertJTest {

    private static CalculatorImpl calculator;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("before class");
        calculator = new CalculatorImpl();
    }

    @Before
    public void setUp() {
        System.out.println("before method");
    }

    @AfterClass
    public static void cleanUpAfterClass() {
        System.out.println("after class");
    }

    @After
    public void tearDown() {
        calculator.clear();
        System.out.println("after method");
    }

    @Test
    public void shouldDisplayNumberInWindow() {
        //given
        int a = 5;
        int b = 2;
        int c = 7;

        String expected = "527";

        //when
        calculator.pressNumber(a);
        calculator.pressNumber(b);
        calculator.pressNumber(c);

        //then
        assertThat(calculator.display()).endsWith(expected);
    }
}