import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestM {
    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        int result = calculator.addition(10, 15);
        Assertions.assertEquals(25,result);
    }

    @Test
    void testSoustraction() {
        int result = calculator.soustraction(15,10);
        Assertions.assertEquals(5, result);
    }

    @Test
    void testMultiplication() {
        int result = calculator.multiplication(5, 5);
        Assertions.assertEquals(25,result);
    }

    @Test
    void testDivision () {
        double result = calculator.division(35,5);
        Assertions.assertEquals(7, result);
    }
}
