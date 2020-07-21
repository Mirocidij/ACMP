import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP35 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int k = in.nextInt();

        for (int i = 0; i < k; i++) {
            long n = in.nextLong();
            long m = in.nextLong();

            out.println(19 * m + ((n + 239) * (n + 366) / 2));
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
        new ACMP35().run();
    }
}
