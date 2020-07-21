import java.io.PrintWriter;
import java.util.Scanner;

public class Fibonachi {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int n = 15;
        long[] fib = new long[n];
        fib[0] = fib[1] = 1;
        fib[2] = fib[0] + fib[1];
        fib[3] = 4;

        for (int i = 4; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2] + fib[i - 3] + fib[i - 4];
        }

        for (long i : fib) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (long i : fib) {
            System.out.print(i + " ");
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
        new Fibonachi().run();
    }
}
