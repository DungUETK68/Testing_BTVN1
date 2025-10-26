public class TicketCalculator {
    public static int ticketPrice(int age, boolean isMember) {
        final int basePrice = 100000;
        double price = basePrice;

        if (age <= 12) {
            price -= basePrice * 0.5;
        } else if (age >= 60) {
            price -= basePrice * 0.3;
        }

        if (isMember) {
            price -= basePrice * 0.1;
        }

        return (int) price;
    }
}
