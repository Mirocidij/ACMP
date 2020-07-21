import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class ACMP_MENSH_TR1_E {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        BigInteger a = in.nextBigInteger();
        int n = in.nextInt();

        out.println(a.pow(n));
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
        new ACMP_MENSH_TR1_E().run();
    }
}
