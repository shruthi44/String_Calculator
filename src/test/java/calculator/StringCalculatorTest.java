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
      assertEquals("Invalid input.", ex.getMessage());
    }

    @Test
    public void addShouldThrowExceptionLastCharacterComma(){
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> calculator.add(new String("3,4,5,")));
        assertEquals("Invalid input.", ex.getMessage());
    }

    @Test
    public void addShouldThrowExceptionOnlyCharacterComma(){
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> calculator.add(new String(",")));
        assertEquals("Invalid input.", ex.getMessage());
    }

    @Test
    public void addShouldThrowExceptionForNegativeNumbers(){
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> calculator.add(new String("-3,-4,5")));
        assertEquals("Negative numbers are not allowed.[-3, -4]", ex.getMessage());
    }
    @Test
    public void addShouldAcceptLineBreaksFromUser() {
        assertEquals(15, calculator.add(new String("4,5/n/n6")));
    }
}

