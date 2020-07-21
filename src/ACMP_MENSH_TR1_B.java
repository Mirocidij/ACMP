import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP_MENSH_TR1_B {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int s = in.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        if (sum(nums) < s) {
            out.println("No solution");
            return;
        }


    }

    int sum(int[] arr) {
        int result = 0;

        for (int i : arr) {
            result += i;
        }

        return result;
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
        new ACMP_MENSH_TR1_B().run();
    }
}
