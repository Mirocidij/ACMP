package my;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ACMP297 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        List<Character> rounds = new ArrayList<>(
            Arrays.asList('0', '6', '8', '9')
        );
        char[] nums = in.nextLine().toCharArray();
        int count = 0;

        for (char c : nums) {
            if (rounds.contains(c)) {
                if (c == '8') count += 2;
                else count++;
            }
        }

        out.println(count);
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
        new ACMP297().run();
    }
}
