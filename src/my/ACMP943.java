package my;

import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP943 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int y = in.nextInt();
        int x = in.nextInt();

        int num = (y - 1) * m;
        out.println(y % 2 == 0 ? num + (m - x) : num + (x - 1));
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
        new ACMP943().run();
    }
}
