import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP106 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int tails = 0;
        int emblem = 0;
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            if (input == 1) tails++;
            if (input == 0) emblem++;
        }

        out.println(Math.min(tails, emblem));
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
        new ACMP106().run();
    }
}
