public class TicketCart {
    private Ticket[] cartContents = new Ticket[10];
    private int count = 0;

    public int getCount() { return count; }

    public void addToCart(Ticket t) {
        if (count == cartContents.length) {
            System.out.println("Cart is full (10 tickets): cannot add " + t.getFilmTitle());
            return;
        }
        cartContents[count] = t;
        count++;
        System.out.println("Added " + t.getFilmTitle() + " - seat " + t.getSeat());
    }

    public void removeFromCart(Ticket t) {
        // find the position of this ticket object in the array
        int position = -1;
        for (int i = 0; i < count; i++) {
            if (cartContents[i] == t) position = i;
        }
        if (position == -1) {
            System.out.println("Ticket " + t.getFilmTitle() + " - seat " + t.getSeat() + " is not in the cart");
            return;
        }
        // shift the following tickets one place to the left
        for (int i = position; i < count - 1; i++) {
            cartContents[i] = cartContents[i + 1];
        }
        count--;
        cartContents[count] = null;
        System.out.println("Removed " + t.getFilmTitle() + " - seat " + t.getSeat());
    }

    public void checkOut() {
        System.out.println("Checking out " + count + " ticket(s):");
        double total = 0;
        for (int i = 0; i < count; i++) {
            cartContents[i].print();
            total = total + cartContents[i].getPrice();
        }
        System.out.println("  Total: " + total + " credits");
        // empty the cart
        for (int i = 0; i < count; i++) {
            cartContents[i] = null;
        }
        count = 0;
    }
}
