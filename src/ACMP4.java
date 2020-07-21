import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP4 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        out.printf("%d%d%d", n, 9, 9 - n);
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
        new ACMP4().run();
    }
}
