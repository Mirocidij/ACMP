import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP773 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int k = in.nextInt();
        out.println(k * k * in.nextInt());
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
        new ACMP773().run();
    }
}
