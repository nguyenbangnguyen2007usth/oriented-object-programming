package labwork2.ex2;

public class Title {
    private String name;
    private int year;

    public Title(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() { return name; }
    public int getYear() { return year; }

    public int runningTime() { 
        return 0; 
    }

    public String kind() { 
        return "Title"; 
    }

    @Override
    public String toString() {
        return kind() + ": " + name + " (" + year + ") - " + runningTime() + " min";
    }
}