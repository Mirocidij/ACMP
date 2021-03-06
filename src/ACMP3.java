import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP3 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        long n = in.nextLong();
        out.println(n * n);
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
        new ACMP3().run();
    }
}
