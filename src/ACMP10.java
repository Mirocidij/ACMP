import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP10 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        long a = in.nextInt(),
            b = in.nextInt(),
            c = in.nextInt(),
            d = in.nextInt();

        for (int x = -100; x <= 100; x++) {
            if (x * x * x * a + x * x * b + x * c + d == 0)
                out.print(x + " ");
        }
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
        new ACMP10().run();
    }
}
