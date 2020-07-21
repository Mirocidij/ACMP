import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP25 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();

        if (a > b) out.println(">");
        else if (a < b) out.println("<");
        else out.println("=");
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
        new ACMP25().run();
    }
}
