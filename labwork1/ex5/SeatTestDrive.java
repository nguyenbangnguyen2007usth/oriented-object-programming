public class SeatTestDrive {
    public static void main(String[] args) {
        Seat s = new Seat();
        s.setRow("C");        // 1
        s.setNumber(12);      // 2
        s.reserve();          // 3
        s.reserve();          // 4
        s.release();          // 5
        s.release();          // 6
        s.setNumber(-4);      // 7
        s.printInfo();        // 8
    }
}
