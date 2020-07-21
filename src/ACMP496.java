import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP496 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] list = new int[n];
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            list[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int sum = list[i] + list[(i + 1) % n] + list[(i + 2) % n];
            if (sum > maxSum) maxSum = sum;
        }

        out.println(maxSum);
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
        new ACMP496().run();
    }
}
