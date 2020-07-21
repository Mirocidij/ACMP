import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP766 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt(),
            m = in.nextInt(),
            k = in.nextInt();

        if (n * m >= k) out.println("YES");
        else out.println("NO");
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
        new ACMP766().run();
    }
}
