package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testDivideGivesCorrectResult() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        // divide(10, 5) = 2
        int result = calculator.divide(10, 5);

        // Assert
        assertEquals(2, result);
    }

    @Test
    public void testDivideThrowsExceptionWhenDivisionByZero() {
        // Arrange
        Calculator calculator = new Calculator();
        // divide(10, 0) throws exception
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }


}