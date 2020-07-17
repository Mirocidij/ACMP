import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP_86 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();

        // n*n - ((n - 1) * 3 + 1)
        out.println(n*n - ((n - 1) * 3 + 1));
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
        new ACMP_86().run();
    }
}
