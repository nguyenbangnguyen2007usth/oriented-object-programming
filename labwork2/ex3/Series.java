package labwork2.ex3;

public class Series extends Title {
    private int episodes;
    private int minutesPerEpisode;
    
    public Series(String name, int year, int episodes, int minutesPerEpisode) {
        super(name, year); // Gọi constructor của Title
        this.episodes = episodes;
        this.minutesPerEpisode = minutesPerEpisode;
    }
    
    @Override
    public int runningTime() { 
        return episodes * minutesPerEpisode; 
    }
    
    public int getEpisodes() { return episodes; }
}