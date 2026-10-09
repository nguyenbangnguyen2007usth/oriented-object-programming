public class TitleTestDrive {
    public static void main(String[] args) {
        Film dune = new Film("Dune", 2021, 155);
        Series bluey = new Series("Bluey", 2018, 9, 7);
        
        dune.printInfo();
        bluey.printInfo();
    }
}