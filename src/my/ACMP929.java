package my;

import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP929 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        long n = in.nextLong();
        long copyOfN = n;
        long sum = 0;

        for (int i = 6; i > 0; i--) {
            if (n >= i) {
                sum += n / i * (7 - i);
                n %= i;
            }
        }

        out.println(sum + " " + copyOfN * 6);
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
        new ACMP929().run();
    }
}


