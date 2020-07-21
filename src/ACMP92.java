import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP92 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        out.printf("%d %d %d", n/3/2, n/3*2, n/3/2);
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
        new ACMP92().run();
    }
}
