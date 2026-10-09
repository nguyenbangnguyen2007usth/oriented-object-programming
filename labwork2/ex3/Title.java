package labwork2.ex3;

public class Title {
    private String name;
    private int year;
    
    public Title(String name, int year) {
        this.name = name;
        this.year = year;
    }
    
    public String getName() { return name; }
    public int runningTime() { return 0; }
    public String kind() { return "Title"; }
}