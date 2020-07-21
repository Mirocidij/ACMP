import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ACMP_MENSH_TR3_A {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int sqr = (int) Math.sqrt(n);

        for (int i = 2; i <= n; i++) {
            if (i > sqr) {
                out.println(n);
                return;
            }

            if (n % i == 0) {
                out.print(i);
                if (i == n) {
                    return;
                }
                out.print("*");
                n /= i;
                i--;
            }
        }
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
        new ACMP_MENSH_TR3_A().run();
    }
}
