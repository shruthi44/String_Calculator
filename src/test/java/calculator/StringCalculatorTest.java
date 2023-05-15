package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringCalculatorTest {
    private StringCalculator calculator = new StringCalculator();

    @Test
    public void addShouldThrowIllegalArgumentExceptionForEmptyArray() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> calculator.add(new String[]{}));
        assertEquals("No input.", ex.getMessage());
    }

    @Test
    public void addShouldReturnZeroEmptyString() {
        assertEquals(0, calculator.add(new String[]{""}));
    }
}
