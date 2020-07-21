import java.io.PrintWriter;
import java.util.Scanner;

public class SecondSize {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int[] n = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int first = Integer.MIN_VALUE,
            second = Integer.MIN_VALUE;

        for (int i = 0; i < n.length; i++) {
            if (n[i] > first) {
                second = first;
                first = n[i];
            } else if (n[i] > second) {
                second = n[i];
            }
        }

        out.println(second);
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
        new SecondSize().run();
    }
}
