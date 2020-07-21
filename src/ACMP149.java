import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP149 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            out.print(nums[i] + " ");
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
        new ACMP149().run();
    }
}
