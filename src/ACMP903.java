import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP903 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        out.println(in.nextInt() + 1);
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
        new ACMP903().run();
    }
}
