package my;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ACMP691 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        List<Character> list = new ArrayList<>(
            Arrays.asList('A', 'B', 'C', 'E', 'H', 'K', 'M', 'O', 'P', 'T', 'X', 'Y')
        );
        int n = in.nextInt();
        boolean isCorrect = false;

        for (int i = 0; i < n; i++) {
            char[] tmp = in.next().toCharArray();

            if (
                list.contains(tmp[0])
                    && (tmp[1] >= '0' && tmp[1] <= '9')
                    && (tmp[2] >= '0' && tmp[2] <= '9')
                    && (tmp[3] >= '0' && tmp[3] <= '9')
                    && list.contains(tmp[4])
                    && list.contains(tmp[5])
                    && tmp.length == 6
            ) {
                out.println("Yes");
            } else out.println("No");
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
        new ACMP691().run();
    }
}
