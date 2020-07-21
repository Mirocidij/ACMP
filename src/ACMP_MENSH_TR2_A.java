import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP_MENSH_TR2_A {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int m = in.nextInt();
        int n = in.nextInt();
        boolean[] sieve = new boolean[n + 1];

        for (int i = 2; i * i <= n; ++i) {
            if (!sieve[i]) {
                for (int j = i * i; j <= n; j += i) {
                    sieve[j] = true;
                }
            }
        }

        boolean hasPrime = false;
        for (int i = m; i <= n; i++) {
            if (!sieve[i]) {
                hasPrime = true;
                out.println(i);
            }
        }

        if (!hasPrime) {
            out.println("Absent");
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
        new ACMP_MENSH_TR2_A().run();
    }
}
