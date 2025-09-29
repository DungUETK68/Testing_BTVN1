import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketCalculatorTest {

    // -----Decision Table Tests-----
    @Test
    void testChildNoMember() {
        assertEquals(50000, TicketCalculator.ticketPrice(10, false));
    }

    @Test
    void testChildWithMember() {
        assertEquals(40000, TicketCalculator.ticketPrice(10, true));
    }

    @Test
    void testSeniorNoMember() {
        assertEquals(70000, TicketCalculator.ticketPrice(65, false));
    }

    @Test
    void testSeniorWithMember() {
        assertEquals(60000, TicketCalculator.ticketPrice(65, true));
    }

    @Test
    void testAdultNoMember() {
        assertEquals(100000, TicketCalculator.ticketPrice(30, false));
    }

    @Test
    void testAdultWithMember() {
        assertEquals(90000, TicketCalculator.ticketPrice(30, true));
    }

    // -----Boundary Value Tests-----
    @Test
    void testAge12() {
        assertEquals(50000, TicketCalculator.ticketPrice(12, false));
        assertEquals(40000, TicketCalculator.ticketPrice(12, true));
    }

    @Test
    void testAge13() {
        assertEquals(100000, TicketCalculator.ticketPrice(13, false));
        assertEquals(90000, TicketCalculator.ticketPrice(13, true));
    }

    @Test
    void testAge36() {
        assertEquals(100000, TicketCalculator.ticketPrice(36, false));
        assertEquals(90000, TicketCalculator.ticketPrice(36, true));
    }

    @Test
    void testAge59() {
        assertEquals(100000, TicketCalculator.ticketPrice(59, false));
        assertEquals(90000, TicketCalculator.ticketPrice(59, true));
    }

    @Test
    void testAge60() {
        assertEquals(70000, TicketCalculator.ticketPrice(60, false));
        assertEquals(60000, TicketCalculator.ticketPrice(60, true));
    }
}
