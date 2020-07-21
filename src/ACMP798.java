import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP798 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        long m = in.nextLong(),
            n = in.nextLong(),
            i = in.nextLong(),
            j = in.nextLong(),
            c = in.nextLong();

        if (m * n % 2 == 0) out.println("equal");
        else if ((i + j) % 2 == c) out.println("black");
        else out.println("white");
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
        new ACMP798().run();
    }
}
