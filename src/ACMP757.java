import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP757 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        long c = in.nextLong() / 2;
        long h = in.nextLong() / 6;
        long o = in.nextLong();

        out.println(Math.min(Math.min(c, h), o));
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
        new ACMP757().run();
    }
}
