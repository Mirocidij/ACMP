import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP819 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        long a = in.nextInt(),
            b = in.nextInt(),
            c = in.nextInt();

        out.printf("%d %d", a * b * 2 + a * c * 2 + b * c * 2 ,a * b * c);
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
        new ACMP819().run();
    }
}
