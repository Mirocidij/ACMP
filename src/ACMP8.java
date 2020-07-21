import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP8 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt(),
            b = in.nextInt(),
            c = in.nextInt();

        out.println(a * b == c ? "YES" : "NO");
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
        new ACMP8().run();
    }
}
