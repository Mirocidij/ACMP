import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP22 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        String binary = Integer.toBinaryString(Integer.parseInt(in.next()));
        int count = 0;
        for (char c : binary.toCharArray()) {
            if (c == '1') count++;
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
        new ACMP22().run();
    }
}
