package CoolString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoolStringTest {

    CoolString sut;

    @Test
    void canCreateInstanceOfCoolStringWithString() {
        // Arrange
        String value = "johan";
        String expected = "johan";

        // Act
        sut = new CoolString(value);
        
        // Assert
        assertEquals(expected, value);
    }
    @Test
    void nullValueInConstructorShouldThrowNewNullPointerException() {
        // Arrange
        String value = null;

        // Arrange & Assert
        assertThrows(NullPointerException.class,
                () -> sut = new CoolString(value));
    }

}