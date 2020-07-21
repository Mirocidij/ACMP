import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP754 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int max = 0;
        for (int i = 0; i < 3; i++) {
            int mass = in.nextInt();
            if (mass >= 94 && mass <= 727) {
                max = Math.max(mass, max);
            } else {
                out.println("Error");
                return;
            }
        }

        out.println(max);
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
        new ACMP754().run();
    }
}
