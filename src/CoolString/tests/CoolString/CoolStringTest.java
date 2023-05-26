package CoolString;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the CoolString class.
 */
class CoolStringTest {

    CoolString sut;

    /**
     * Sets up the CoolString object for each test.
     */
    @BeforeEach
    void setSut() {
        sut = new CoolString("johan");
    }

    /**
     * Tests that a CoolString object can be created with a string value.
     */
    @Test
    void canCreateInstanceOfCoolStringWithStringValue() {
        assertEquals(sut.getValue(), "johan");
    }

    /**
     * Tests that passing a null value to the constructor throws a NullPointerException.
     */
    @Test
    void nullValueInConstructorShouldThrowNullPointerException() {
        assertThrows(NullPointerException.class,
                () -> sut = new CoolString(null));
    }

    /**
     * Tests that setting a new value updates the value of the CoolString.
     */
    @Test
    void setValueShouldUpdateValue() {
        sut.setValue("eiemi");
        assertEquals(sut.getValue(), "eiemi");
    }

    /**
     * Tests that the toString() method returns the same value as the CoolString.
     */
    @Test
    void toStringReturnsSameValue() {
        assertEquals(sut.getValue(), sut.toString());
    }

    /**
     * Tests that setting a new value and calling toString() returns the updated value.
     */
    @Test
    void setNewValueAndSeeIfToStringReturnsThat() {
        sut.setValue("Harry Potter");
        assertEquals(sut.getValue(), sut.toString());
    }

    /**
     * Tests that two CoolString objects with the same value are considered equal.
     */
    @Test
    void makingSureTwoIdenticalObjectsAreEqual() {
        CoolString test = new CoolString("johan");
        assertEquals(sut, test);
    }

    /**
     * Tests that two CoolString objects with different values are not considered equal.
     */
    @Test
    void makingSureTwoNotIdenticalObjectsAreNotEqual() {
        CoolString test = new CoolString("eiemi");
        assertNotEquals(sut,test);
    }
    
}
