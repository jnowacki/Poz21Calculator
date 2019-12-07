package jnowacki;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculatorImplTest {

    private static CalculatorImpl calculator;

    @BeforeClass
    public static void setUpClass(){
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
       assertEquals("Not equal", expected, calculator.display());
    }

    @Test
    public void shouldDisplayNumberInWindowWhen0Pressed() {
        //given
        int a = 0;
        String expected = "0";

        //when
        calculator.pressNumber(a);

        //then
       assertEquals("Not equal", expected, calculator.display());
    }
}