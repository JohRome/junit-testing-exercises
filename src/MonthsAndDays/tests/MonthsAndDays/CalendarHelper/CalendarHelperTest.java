package MonthsAndDays.CalendarHelper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalendarHelperTest {

    CalendarHelper sut;

    @BeforeEach
    void setSut() {
        sut = new CalendarHelper();
    }

    @Test
    public void checkingThatDaysCorrespondTheRightNumber() {
        assertEquals("Monday", sut.getWeekday(1));
        assertEquals("Tuesday", sut.getWeekday(2));
        assertEquals("Wednesday", sut.getWeekday(3));
        assertEquals("Thursday", sut.getWeekday(4));
        assertEquals("Friday", sut.getWeekday(5));
        assertEquals("Saturday", sut.getWeekday(6));
        assertEquals("Sunday", sut.getWeekday(7));
    }
    @Test
    void zeroOrBelowShouldThrowNewIllegalStateExceptionForGetWeekday() {
        assertThrows(IllegalStateException.class,
                () -> sut.getWeekday(0));
        assertThrows(IllegalStateException.class,
                () -> sut.getWeekday(-1));
    }
    @Test
    void checkingThatMonthsCorrespondTheRightNumber() {
        assertEquals("January", sut.getMonth(1));
        assertEquals("February", sut.getMonth(2));
        assertEquals("Mars", sut.getMonth(3));
        assertEquals("April", sut.getMonth(4));
        assertEquals("May", sut.getMonth(5));
        assertEquals("June", sut.getMonth(6));
        assertEquals("Juli", sut.getMonth(7));
        assertEquals("August", sut.getMonth(8));
        assertEquals("September", sut.getMonth(9));
        assertEquals("October", sut.getMonth(10));
        assertEquals("November", sut.getMonth(11));
        assertEquals("December", sut.getMonth(12));
    }
    @Test
    void zeroOrBelowShouldThrowNewIllegalStateExceptionForGetMonth() {
        assertThrows(IllegalStateException.class,
                () -> sut.getMonth(0));
        assertThrows(IllegalStateException.class,
                () -> sut.getMonth(-1));
    }
}