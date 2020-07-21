import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP637 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] commands = new int[n];
        for (int i = 0; i < n; i++) {
            commands[i] = in.nextInt();
        }
        int hallCount = in.nextInt();
        int count = 0;

        for (int c : commands)
            count += Math.min(c, hallCount);

        out.println(count);
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
        new ACMP637().run();
    }
}
