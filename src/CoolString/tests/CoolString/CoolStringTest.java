package CoolString;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoolStringTest {

    CoolString sut;

    @BeforeEach
    void setSut() {
        sut = new CoolString("johan");
    }

    @Test
    void canCreateInstanceOfCoolStringWithStringValue() {
        assertEquals(sut.getValue(), "johan");
    }
    @Test
    void nullValueInConstructorShouldThrowNullPointerException() {
        assertThrows(NullPointerException.class,
                () -> sut = new CoolString(null));
    }
    
}