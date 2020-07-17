import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP940 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int index = in.nextInt() - 1;
        char[] chars = in.nextLine().trim().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (i == index) continue;

            out.print(chars[i]);
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
        new ACMP940().run();
    }
}
