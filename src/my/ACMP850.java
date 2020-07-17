package my;

import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP850 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int minA = (a + 1) / 2;
        int minB = (b + 1) / 2;

        out.println(Math.max(minA, minB) + " " + Math.min(a, b));
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
        new ACMP850().run();
    }
}