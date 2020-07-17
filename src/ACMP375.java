import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class ACMP375 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int from = in.nextInt();
        int to = in.nextInt();
        BigInteger bigInteger = in.nextBigInteger(from);
        out.println(bigInteger.toString(to).toUpperCase());
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
        new ACMP375().run();
    }
}
