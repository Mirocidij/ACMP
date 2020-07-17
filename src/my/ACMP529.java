package my;

import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP529 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        double a = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        out.println(a);
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
        new ACMP529().run();
    }
}


