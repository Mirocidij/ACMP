import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP756 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int m = in.nextInt(),
            n = in.nextInt();

        out.println((m - 1) * (n - 1));
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
        new ACMP756().run();
    }
}
