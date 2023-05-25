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
    @Test
    void setValueShouldUpdateValue() {
        sut.setValue("eiemi");
        assertEquals(sut.getValue(), "eiemi");
    }
    @Test
    void toStringReturnsSameValue() {
        assertEquals(sut.getValue(), sut.toString());
    }
    @Test
    void setNewValueAndSeeIfToStringReturnsThat() {
        sut.setValue("Harry Potter");
        assertEquals(sut.getValue(), sut.toString());
    }
    @Test
    void makingSureTwoIdenticalObjectsAreEqual() {
        CoolString test = new CoolString("johan");
        assertEquals(sut, test);
    }
    @Test
    void makingSureTwoNotIdenticalObjectsAreNotEqual() {
        CoolString test = new CoolString("eiemi");
        assertNotEquals(sut,test);
    }
    
}