package labwork2.ex2;

public class Series extends Title {
    private int episodes;
    private int minutesPerEpisode;

    public Series(String name, int year, int episodes, int minutesPerEpisode) {
        super(name, year);
        this.episodes = episodes;
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int runningTime() {
        return episodes * minutesPerEpisode;
    }

    @Override
    public String kind() {
        return "Series";
    }

    @Override
    public String toString() {
        return super.toString() + " (" + episodes + " x " + minutesPerEpisode + " min)";
    }
}