public class TicketCartTestDrive {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        t1.setFilmTitle("Dune");
        t1.setSeat("C12");
        t1.setPrice(5.0);

        Ticket t2 = new Ticket();
        t2.setFilmTitle("Dune");
        t2.setSeat("C13");
        t2.setPrice(5.0);

        Ticket t3 = new Ticket();
        t3.setFilmTitle("Cu Li Never Cries");
        t3.setSeat("A1");
        t3.setPrice(4.0);

        TicketCart cart = new TicketCart();
        cart.addToCart(t1);
        cart.addToCart(t2);
        cart.addToCart(t3);
        cart.removeFromCart(t2);

        // attack (a): remove a ticket that is not in the cart
        Ticket stranger = new Ticket();
        stranger.setFilmTitle("Alien");
        stranger.setSeat("Z9");
        stranger.setPrice(5.0);
        cart.removeFromCart(stranger);

        cart.checkOut();
        System.out.println("Tickets after check-out: " + cart.getCount());

        // attack (b): add an eleventh ticket
        for (int i = 1; i <= 11; i++) {
            Ticket t = new Ticket();
            t.setFilmTitle("Heat");
            t.setSeat("B" + i);
            t.setPrice(3.0);
            cart.addToCart(t);
        }
        System.out.println("Tickets in cart: " + cart.getCount());
    }
}
