import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class ACMP894 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        String[] nums = in.nextLine().split(" ");

        double s = Double.parseDouble(nums[0]);
        double r1 = Double.parseDouble(nums[1]);
        double r2 = Math.sqrt(
            (r1*r1) - (s / Math.PI)
        );

        out.printf(Locale.US,"%.3f", r2);
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
        new ACMP894().run();
    }
}
