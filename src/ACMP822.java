import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP822 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int x3 = in.nextInt();
        int y3 = in.nextInt();

        double area = area(x1, y1, x2, y2, x3, y3);
        if (area % 1 == 0) {
            out.println((long) area);
        } else {
            out.println(area);
        }
    }

    private double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        return Math.abs(1. * (x2 - x1) * (y3 - y1) - (1. * (x3 - x1) * (y2 - y1))) / 2.;
    }

    void run() {
        try (
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)
        ) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new ACMP822().run();
    }
}