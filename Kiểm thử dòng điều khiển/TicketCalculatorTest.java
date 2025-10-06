import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketCalculatorTest {

    @Test
    void testChildWithMember() {
        assertEquals(40000, TicketCalculator.ticketPrice(10, true));
    }

    @Test
    void testSeniorWithoutMember() {
        assertEquals(70000, TicketCalculator.ticketPrice(65, false));
    }

    @Test
    void testAdultWithoutMember() {
        assertEquals(100000, TicketCalculator.ticketPrice(30, false));
    }
}
