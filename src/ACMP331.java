import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ACMP331 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) throws ParseException {
        String[] time = in.next().split(":");
        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        hours += in.nextInt();
        minutes += in.nextInt();

        if (minutes >= 60) {
            hours++;
        }

        out.printf("%02d:%02d", hours % 24, minutes % 60);
    }

    void run() {
        try (
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)
        ) {
            solve(in, out);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ACMP331().run();
    }
}


