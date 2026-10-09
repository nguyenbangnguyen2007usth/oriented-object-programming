package labwork2.ex2;

public class ShortFilm extends Film {
    public ShortFilm(String name, int year, int duration) {
        super(name, year, duration);
    }

    @Override
    public String kind() {
        return "Short film";
    }
}