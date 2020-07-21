import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP264 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int maxSeq = 0;
        int curSeq = 0;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            if (t > 0) {
                curSeq++;
                if (curSeq > maxSeq) maxSeq = curSeq;
            } else {
                curSeq = 0;
            }
        }

        out.println(maxSeq);
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
        new ACMP264().run();
    }
}
