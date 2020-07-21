import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP324 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        char[] numC = in.next().toCharArray();
        for (int i = 0; i < numC.length / 2; i++) {
            if (numC[i] != numC[numC.length - 1 - i]) {
                out.println("NO");
                return;
            }
        }

        out.println("YES");
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
        new ACMP324().run();
    }
}
