public class Seat {
    private String row;
    private int number;
    private boolean reserved;

    public String getRow() { return row; }
    public void setRow(String r) { row = r; }

    public int getNumber() { return number; }
    public void setNumber(int n) {
        if (n <= 0) {
            System.out.println("Invalid seat number: " + n);
            return;
        }
        number = n;
    }

    public boolean isReserved() { return reserved; }

    public void reserve() {
        if (reserved) {
            System.out.println("Seat " + row + number + " is already reserved");
        } else {
            reserved = true;
            System.out.println("Seat " + row + number + " reserved");
        }
    }

    public void release() {
        if (!reserved) {
            System.out.println("Seat " + row + number + " is not reserved");
        } else {
            reserved = false;
            System.out.println("Seat " + row + number + " released");
        }
    }

    public void printInfo() {
        if (reserved) {
            System.out.println("Seat " + row + number + " - reserved");
        } else {
            System.out.println("Seat " + row + number + " - free");
        }
    }
}
