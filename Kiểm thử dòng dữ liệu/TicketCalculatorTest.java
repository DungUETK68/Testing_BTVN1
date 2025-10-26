import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketCalculatorTest {

    @Test
    void testChildWithoutMember() {
        assertEquals(50000, TicketCalculator.ticketPrice(10, false));
    }

    @Test
    void testAdultWithoutMember() {
        assertEquals(100000, TicketCalculator.ticketPrice(30, false));
    }

    @Test
    void testSeniorWithoutMember() {
        assertEquals(70000, TicketCalculator.ticketPrice(70, false));
    }

    @Test
    void testAdultWithMember() {
        assertEquals(90000, TicketCalculator.ticketPrice(30, true));
    }
}
