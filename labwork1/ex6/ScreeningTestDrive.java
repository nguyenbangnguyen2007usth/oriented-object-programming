public class ScreeningTestDrive {
    public static void main(String[] args) {
        Screening dune = new Screening();
        dune.setTitle("Dune");
        dune.setRoom("2H-201");
        dune.setSeats(40);

        Screening alien = new Screening();
        alien.setTitle("Alien");
        alien.setRoom("2H-105");
        alien.setSeats(25);

        dune.sell(3);
        dune.cancel(1);
        alien.sell(30);      // more than the room has: refused
        alien.sell(5);
        alien.cancel(6);     // more than were sold: refused

        dune.printInfo();
        alien.printInfo();
        // The original code could never do this: with static attributes there is
        // only ONE title, ONE room, ONE seats and ONE sold for the whole program -
        // the second screening would overwrite the first.
    }
}
