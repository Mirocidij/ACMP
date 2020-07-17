package my;

import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP284 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int count = in.nextInt();
        int[] array = new int[count];

        for (int i = 0; i < count; i++) {
            array[i] = in.nextInt();
        }

        count = in.nextInt();

        for (int i = 0; i < count; i++) {
            int from = in.nextInt() - 1;
            int to = in.nextInt();

            while (from < to) {
                out.print(array[from++] + " ");
            }

            out.println();
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
        new ACMP284().run();
    }
}
