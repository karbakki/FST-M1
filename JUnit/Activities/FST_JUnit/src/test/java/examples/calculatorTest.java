package examples;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

// The Test class should start or end with "Test"
public class calculatorTest {

    private examples.calculator calculator;

    @BeforeEach
    public void setUp() throws Exception {
        calculator = new calculator();
        System.out.println("Before each mehod will excute>>");
    }

    @Test
    @DisplayName("Simple multiplication should work")
    public void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5));
        System.out.println("Multiplication");
    }

   @Test
   @DisplayName("Simple addition should work")
    public void testAdd(){
        assertEquals(10,calculator.add(5,5));
       System.out.println("Addition");
    }

    @AfterEach
    public void after(){
        System.out.println("<<After the testing method executed");
    }

    @BeforeAll
    public static void start(){
        System.out.println("This is for beforeAll method");
        System.out.println("---------------------------------");
    }
    @AfterAll
    public static void end(){
        System.out.println("---------------------------------");
        System.out.println("This is for AfterAll method");

    }

    @Test
    @DisplayName("Subtraction test execution")
    public void testSub(){
        assertEquals(2,calculator.sub(4,2));
        assertNotEquals(4,calculator.sub(4,2));
        System.out.println("Subtraction");
    }

    @Test
    @DisplayName("Division test execution")
    public void testDiv(){
        assertEquals(2,calculator.div(4,2));
        System.out.println("Division");
    }

   @Test
   @DisplayName("Even odd test")
   public void evenOdd(){
        assertAll(
                () -> assertTrue(calculator.isEvenNumber(5)),
                () -> assertTrue(calculator.isEvenNumber(4)),
                () -> assertTrue(calculator.isEvenNumber(2))
        );
    }
}
