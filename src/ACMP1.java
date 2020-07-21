import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP1 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        out.println(in.nextInt() + in.nextInt());
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
        new ACMP1().run();
    }
}
