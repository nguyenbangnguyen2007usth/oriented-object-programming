public class PlayTime {
    private int hours;
    private int minutes;

    public int getHours() { return hours; }
    public void setHours(int h) { hours = h; } // simple as possible
    
    // public void setHours(int h) {
    //     if (h < 0) {
    //         System.out.println("Invalid number of hours: " + h);
    //         return;
    //     }
    //     hours = h;
    // }


    public int getMinutes() { return minutes; }
    public void setMinutes(int m) { minutes = m; } // simple as possible
    // public void setMinutes(int m) {
    //     if (m < 0) {
    //         System.out.println("Invalid number of minutes: " + m);
    //         return;
    //     }
    //     hours = hours + m / 60;      // 75 / 60 = 1 hour
    //     minutes = m % 60;            // 75 % 60 = 15 minutes
    // }

    public void print() {
        System.out.println("Running time: " + hours + " hours " + minutes + " minutes");
    }

    
    // Conversion for hours:
    //     155 minutes -> 2 h 35 min
    //     2 h -5 min -> 1 h 55 min

    private PlayTime fromMinutes(int total) {
        if (total < 0) total = 0;    // a play time is never negative
        PlayTime result = new PlayTime();
        result.setHours(total / 60);
        result.setMinutes(total % 60);
        return result;
    }

    public PlayTime add(PlayTime other) {
        return fromMinutes(hours * 60 + minutes + other.getHours() * 60 + other.getMinutes());
    }

    public PlayTime subtract(PlayTime other) {
        return fromMinutes(hours * 60 + minutes - other.getHours() * 60 - other.getMinutes());
    }
    
    // public PlayTime add(PlayTime other) {
    //     PlayTime result = new PlayTime();
    //     result.setHours(hours + other.getHours());
    //     result.setMinutes(minutes + other.getMinutes());
    //     return result;
    // }

    // public PlayTime subtract(PlayTime other) {
    //     PlayTime result = new PlayTime();
    //     result.setHours(hours - other.getHours());
    //     result.setMinutes(minutes - other.getMinutes());
    //     return result;
    // }
}
