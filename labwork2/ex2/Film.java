package labwork2.ex2;

public class Film extends Title {
    private int duration;

    public Film(String name, int year, int duration) {
        super(name, year);
        this.duration = duration;
    }

    @Override
    public int runningTime() { 
        return duration; 
    }

    @Override
    public String kind() { 
        return "Film"; 
    }
}