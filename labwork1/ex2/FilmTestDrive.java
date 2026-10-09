public class FilmTestDrive {
    public static void main(String[] args) {
        Film dune = new Film();
        dune.setTitle("Dune");
        dune.setYear(2021);
        dune.setDuration(148);
        dune.setDuration(155);      // the director's cut
        dune.play();

        Film cuLi = new Film();
        cuLi.setTitle("Cu Li Never Cries");
        cuLi.setYear(2024);
        cuLi.setDuration(92);
        cuLi.play();

        // FilmProgram would have needed a second set of three variables
        // (title2, year2, duration2) and a second copy of the println line.
        // Every new film adds three variables and one more copy of the code;
        // with the class, every new film is one object and the same play().
    }
}
