package main.logic.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass //методы под аннотацией будут выполнен при начале использования класса.
    public static void beforeClass() {
        System.out.println("Before CalculatorTest.class");
    }

    @AfterClass //методы под аннотацией будут выполнен по завершению использования класса.
    public  static void afterClass() {
        System.out.println("After CalculatorTest.class");
    }

    @Before // методы под этой аннотацией будет выполнен до запуска очередного теста.
    public void initTest() {
        calculator = new Calculator();
    }

    @After // методы под этой аннотацией будет выполнен после запуска очередного теста.
    public void afterTest() {
        calculator = null;
    }

    @Test //указывает на тестирующий метод.
    public void testGetSum() throws Exception {
        assertEquals(15, calculator.getSum(7,8));
    }

    @Test
    public void testGetDivide() throws Exception {
        assertEquals(20, calculator.getDivide(100,5));
    }

    @Test
    public void testGetMultiple() throws Exception {

    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        calculator.getDivide(15,0);
    }

    @Ignore("Message for ignored test")
    @Test
    public void ignoredTest() {
        System.out.println("will not print it");
    }
}