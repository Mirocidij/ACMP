package my;

import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP534 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int keyCount = in.nextInt();
        int[] keys = new int[keyCount];

        for (int i = 0; i < keyCount; i++) {
            keys[i] = in.nextInt();
        }

        int pressSequence = in.nextInt();

        for (int i = 0; i < pressSequence; i++) {
            keys[in.nextInt() - 1]--;
        }

        for (int i = 0; i < keys.length; i++) {
            if (keys[i] < 0) {
                out.println("yes");
            } else out.println("no");
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
        new ACMP534().run();
    }
}


