package my;

import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP539 {
    private void solve(Scanner in, PrintWriter out) {
        int count = in.nextInt();

        if (count == 1) {
            out.println(0);
            return;
        }

        if (count % 2 == 0) {
            out.println(count / 2);
        } else {
            out.println(count);
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
        new ACMP539().run();
    }
}