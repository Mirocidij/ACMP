package my;

import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP26 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        double x1, y1, r1, x2, y2, r2, d;
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        r1 = in.nextDouble();
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        r2 = in.nextDouble();

        d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        if (r1 + r2 >= d && r1 + d >= r2 && r2 + d >= r1) {
            out.println("YES");
        } else out.println("NO");
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
        new ACMP26().run();
    }
}
