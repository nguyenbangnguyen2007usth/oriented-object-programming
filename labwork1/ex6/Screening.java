public class Screening {
    private String title;
    private String room;
    private int seats;
    private int sold;

    public String getTitle() { return title; }
    public void setTitle(String t) { title = t; }

    public String getRoom() { return room; }
    public void setRoom(String r) { room = r; }

    public int getSeats() { return seats; }
    public void setSeats(int s) {
        if (s > 0) seats = s;
    }

    public int getSold() { return sold; }

    public void sell(int n) {
        // n > 0: no zero/negative sale
        // sold + n <= seats: the room must not be overbooked
        if (n > 0 && sold + n <= seats) {
            sold = sold + n;
        } else {
            System.out.println(title + ": cannot sell " + n + " ticket(s)");
        }
    }

    public void cancel(int n) {
        // n > 0: no zero/negative cancel
        // sold - n >= 0: give back only tickets really sold
        if (n > 0 && sold - n >= 0) {
            sold = sold - n;
        } else {
            System.out.println(title + ": cannot cancel " + n + " ticket(s)");
        }
    }

    public void printInfo() {
        System.out.println(title + " (" + room + "): " + sold + "/" + seats + " sold");
    }
}
