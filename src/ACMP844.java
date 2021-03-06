import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP844 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        long a = in.nextLong();
        long b = in.nextLong();
        long s = a * b;
        double side = Math.sqrt(s);

        if (side % 1 == 0) {
            out.println((long) side);
        } else {
            out.println(0);
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
        new ACMP844().run();
    }
}