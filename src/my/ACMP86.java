package my;

import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP86 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();

        out.println(n * n - (n * 3 - 2));
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
        new ACMP86().run();
    }
}


