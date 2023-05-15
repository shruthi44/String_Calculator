package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringCalculatorTest {
    private StringCalculator calculator = new StringCalculator();

    @Test
    public void addShouldThrowIllegalArgumentExceptionForEmptyArray() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> calculator.add());
        assertEquals("No input.", ex.getMessage());
    }

    @Test
    public void addShouldReturnZeroEmptyString() {
        assertEquals(0, calculator.add(new String ("")));
    }

//    @Test
//    public void addShouldThrowExceptionInvalidInputCharacter() {
//        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> calculator.add(new String[]{"4, h"}));
//        assertEquals("Invalid input", ex.getMessage());
//    }

//    @Test
//    public void addShouldThrowExceptionInvalidInputSpace() {
//        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> calculator.add(new String[]{"4, 5 6"}));
//        assertEquals("Invalid input", ex.getMessage());
//    }

//    @Test
//    public void addShouldThrowExceptionInvalidInputSpecialCharacter() {
//        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> calculator.add(new String[]{"4, 5 !"}));
//        assertEquals("Invalid input", ex.getMessage());
//    }

    @Test
    public void addShouldReturnSumOfIntegers() {
        assertEquals(15, calculator.add(new String("4,5,6")));
    }
    @Test
    public void addShouldReturnInvalidInput(){
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> calculator.add(new String("3,4 5")));
      assertEquals("Invalid input", ex.getMessage());
    }
    }

