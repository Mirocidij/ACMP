import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP52 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        String num = in.next();
        if (num.length() != 6) {
            out.println("NO");
        } else {
            int left = 0;
            int right = 0;
            int n = Integer.parseInt(num);

            for (int i = 0; i < 3; i++) {
                right += n % 10;
                n /= 10;
            }
            for (int i = 0; i < 3; i++) {
                left += n % 10;
                n /= 10;
            }

            if (left == right) {
                out.println("YES");
            } else {
                out.println("NO");
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
        new ACMP52().run();
    }
}


