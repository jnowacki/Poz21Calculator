package jnowacki;

import org.junit.*;

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

}