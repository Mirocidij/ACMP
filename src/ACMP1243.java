import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP1243 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        int cent = (a * 100 + b) * n;
        out.printf("%d %d", cent / 100, cent % 100);
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
        new ACMP1243().run();
    }
}
