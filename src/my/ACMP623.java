package my;

import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP623 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        long n1 = 1;
        long n2 = 1;
        long tmp;

        long n = in.nextInt();

        for (int i = 0; i < n; i++) {
            tmp = n2;
            n2 = (n2 + n1) % 10;
            n1 = tmp;
        }

        out.println(n1 );
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
        new ACMP623().run();
    }
}
