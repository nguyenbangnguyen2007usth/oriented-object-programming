public class Film extends Title {
    private int duration;

    public Film(String name, int year, int duration) {
        super(name, year);
        this.duration = duration;
    }

    public int getDuration() { return duration; }

    @Override
    public int runningTime() {
        return duration;
    }
}