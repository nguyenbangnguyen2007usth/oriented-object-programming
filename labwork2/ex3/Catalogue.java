package labwork2.ex3;

public class Catalogue {
    public static void main(String[] args) {
        Title[] items = { 
            new Film("Dune", 2021, 155),
            new Series("Bluey", 2018, 9, 7) 
        };
        
        for (Title t : items) {
            System.out.println(t.kind() + ": " + t.getName()
                    + " - " + t.runningTime() + " min");
        }
        
        // Ép kiểu Title về Series để gọi getEpisodes()
        System.out.println(((Series) items[1]).getEpisodes() + " episodes"); 
    }
}