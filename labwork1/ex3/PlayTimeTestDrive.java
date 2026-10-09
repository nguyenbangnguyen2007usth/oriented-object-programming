public class PlayTimeTestDrive {
    public static void main(String[] args) {
        PlayTime film = new PlayTime();
        film.setHours(2);
        film.setMinutes(85);
        PlayTime shortFilm = new PlayTime();
        shortFilm.setHours(0);
        shortFilm.setMinutes(70);

        film.print();
        shortFilm.print();

        PlayTime doubleBill = film.add(shortFilm);
        doubleBill.print();
        PlayTime gap = film.subtract(shortFilm);
        gap.print();

        film.print();
    }
}