import java.util.Scanner;

class Day {
    private int year;
    private int month;
    private int date;

    Day(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    int getYear() { return year; }
    int getMonth() { return month; }
    int getDate() { return date; }

    void setYear(int year) { this.year = year; }
    void setMonth(int month) { this.month = month; }
    void setDate(int date) { this.date = date; }

    void set(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    int dayOfWeek() {
        int y = year;
        int m = month;
        if (m == 1 || m == 2) {
            y--;
            m += 12;
        }
        return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
    }
}

public class MyApp {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String[] wd = {"日", "月", "火", "水", "木", "金", "土"};

        System.out.println("誕生日を西暦で入力せよ");
        System.out.print("年："); int y = stdIn.nextInt();
        System.out.print("月："); int m = stdIn.nextInt();
        System.out.print("日："); int d = stdIn.nextInt();

        Day birthday = new Day(y, m, d);

        System.out.println("あなたの誕生日"
                            + birthday.getYear() + "年"
                            + birthday.getMonth() + "月"
                            + birthday.getDate() + "日は"
                            + wd[birthday.dayOfWeek()] + "曜日です"
        );
    }
}