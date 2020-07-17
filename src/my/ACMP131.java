package my;

import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP131 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int count = in.nextInt();
        int index = -1;
        int maxAge = 0;
        int cAge = 0;
        int cSex = 0;

        for (int i = 0; i < count; i++) {
            cAge = in.nextInt();
            cSex = in.nextInt();

            if (cSex == 1 && cAge > maxAge) {
                index = i + 1;
                maxAge = cAge;
            }
        }

        out.println(index);
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
        new ACMP131().run();
    }
}
