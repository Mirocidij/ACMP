import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP62 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        String point = in.next();
        char c = point.charAt(0);
        int x = (c - 'A') + 1;
        int y = Integer.parseInt(point.substring(1));

        if (x % 2 == 0) {
            if (y % 2 == 0) {
                out.println("BLACK");
            } else {
                out.println("WHITE");
            }
        } else {
            if (y % 2 == 0) {
                out.println("WHITE");
            } else {
                out.println("BLACK");
            }
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
        new ACMP62().run();
    }
}
