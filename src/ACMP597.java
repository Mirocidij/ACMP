import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP597 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int r1 = in.nextInt(),
            r2 = in.nextInt(),
            r3 = in.nextInt();

        if (r2 * 2 + r3 * 2 <= r1 * 2) {
            out.println("YES");
        } else out.println("NO");
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
        new ACMP597().run();
    }
}
