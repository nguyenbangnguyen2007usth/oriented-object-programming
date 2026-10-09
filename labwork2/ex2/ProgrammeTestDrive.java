package labwork2.ex2;

public class ProgrammeTestDrive {
    public static void main(String[] args) {
        Title[] programme = new Title[3];
        programme[0] = new Film("Dune", 2021, 155);
        programme[1] = new Series("Bluey", 2018, 9, 7);
        programme[2] = new ShortFilm("The Neighbors Window", 2019, 20);

        int total = 0;
        // Vòng lặp này sẽ tự động gọi hàm toString() của từng phần tử để in ra màn hình
        for (Title t : programme) {
            System.out.println(t);
        }

        // Vòng lặp tính tổng thời lượng
        for (Title t : programme) {
            total = total + t.runningTime();
        }
        System.out.println("Total: " + total + " min");

        // Tìm phim có thời lượng dài nhất
        Title longest = programme[0];
        for (Title t : programme) {
            if (t.runningTime() > longest.runningTime()) {
                longest = t;
            }
        }
        System.out.println("Longest: " + longest.getName());
    }
}