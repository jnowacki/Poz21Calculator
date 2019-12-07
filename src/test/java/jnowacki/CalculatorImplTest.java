package jnowacki;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorImplTest {

    @BeforeClass
    public static void setUpClass(){
        System.out.println("before class");
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

        CalculatorImpl calculator = new CalculatorImpl();
        String expected = "527";

        //when
        calculator.pressNumber(a);
        calculator.pressNumber(b);
        calculator.pressNumber(c);

        //then
       assertEquals("Not equal", expected, calculator.display());
    }
}