import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP970 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt(),
            b = in.nextInt(),
            c = in.nextInt();

        if (a + b == c || a + c == b || b + c == a) out.println("YES");
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
        new ACMP970().run();
    }
}
