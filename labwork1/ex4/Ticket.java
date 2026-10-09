public class Ticket {
    private String filmTitle;
    private String seat;
    private double price;

    public String getFilmTitle() { return filmTitle; }
    public void setFilmTitle(String t) { filmTitle = t; }

    public String getSeat() { return seat; }
    public void setSeat(String s) { seat = s; }

    public double getPrice() { return price; }
    public void setPrice(double p) { price = p; }

    public void print() {
        System.out.println("  " + filmTitle + " - seat " + seat + " - " + price + " credits");
    }
}
