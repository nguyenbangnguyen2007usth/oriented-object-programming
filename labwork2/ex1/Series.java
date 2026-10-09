public class Series extends Title {
    private int episodes;
    private int minutesPerEpisode;

    public Series(String name, int year, int episodes, int minutesPerEpisode) {
        super(name, year);
        this.episodes = episodes;
        this.minutesPerEpisode = minutesPerEpisode;
    }

    public int getEpisodes() { return episodes; }
    public int getMinutesPerEpisode() { return minutesPerEpisode; }

    @Override
    public int runningTime() {
        return episodes * minutesPerEpisode;
    }
}