import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP817 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        long n = in.nextLong(),
            m = in.nextLong();

        long width = in.nextLong(),
            length = in.nextLong();

        long crossingCount = n * m;
        long roadCount = n + m;
        long s = roadCount * width * length - (crossingCount * width * width);
        out.println(s);
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
        new ACMP817().run();
    }
}
