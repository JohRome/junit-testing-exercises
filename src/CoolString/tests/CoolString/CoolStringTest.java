package CoolString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoolStringTest {

    CoolString sut;

    @Test
    void canCreateInstanceOfCoolStringWithStringValue() {
        // Arrange
        String value = "johan";
        sut = new CoolString(value);

        // Assert
        assertEquals(sut.getValue(), "johan");
    }
    @Test
    void nullValueInConstructorShouldThrowNullPointerException() {
        // Arrange
        String value = null;

        // Arrange & Assert
        assertThrows(NullPointerException.class,
                () -> sut = new CoolString(value));
    }
}