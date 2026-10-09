public class Film {
    private String title;
    private int year;
    private int duration;

    public String getTitle() { return title; }
    public void setTitle(String t) { title = t; }

    public int getYear() { return year; }
    public void setYear(int y) { year = y; }

    public int getDuration() { return duration; }
    public void setDuration(int d) { duration = d; }

    public void play() {
        System.out.println("Now playing: " + title
            + " (" + year + "), " + duration + " min");
    }
}
