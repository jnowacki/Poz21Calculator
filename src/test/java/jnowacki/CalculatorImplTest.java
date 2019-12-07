package jnowacki;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CalculatorImplTest {

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

    @Test
    public void shouldClearNumbersFromDisplayWhenNotEmpty() {
        //given
        calculator.pressNumber(5);
        assertFalse(calculator.display().isEmpty());

        //when
        calculator.clear();

        //then
        assertTrue(calculator.display().isEmpty());
    }

    @Test
    public void shouldAddTwoPositiveNumbers() {
        //given
        int a = 3;
        int b = 4;
        String expected = "7";

        //when
        calculator.add(a, b);

        //then
        assertEquals(expected, calculator.display());
    }

    @Test
    public void shouldAddTwoPositiveNumbersWhenDisplayNotEmpty() {
        //given
        int a = 3;
        int b = 4;
        String expected = "7";

        calculator.pressNumber(5);
        assertFalse(calculator.display().isEmpty());

        //when
        calculator.add(a, b);

        //then
        assertEquals(expected, calculator.display());
    }

    @Test
    public void shouldTestMultipleNumbers() {
        testAndAssertAdd("5", 3, 2);
        testAndAssertAdd("13", 3, 10);
        testAndAssertAdd("-5", 3, -8);
    }

    private void testAndAssertAdd(String expected, int a, int b) {
        calculator.add(a, b);
        assertEquals(expected, calculator.display());
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldThrowNewExWhenDivBy0 (){
        calculator.div(2, 0);
    }
}