import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP43 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        char[] chars = in.next().toCharArray();
        int maxLen = 0;
        int curLen = 0;

        for (char c : chars) {
            if (c == '0') {
                curLen++;
            } else {
                if (curLen > maxLen) maxLen = curLen;
                curLen = 0;
            }
        }
        if (curLen > maxLen) maxLen = curLen;

        out.println(maxLen);
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
        new ACMP43().run();
    }
}
