import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP949 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt(),
            aN = in.nextInt(),
            aN1 = in.nextInt();

        for (int i = 0; i < n - 1; i++) {
            int tmp = aN1;
            aN1 = aN;
            aN = tmp - aN;
        }

        out.println(aN);
        out.println(aN1);
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
        new ACMP949().run();
    }
}
