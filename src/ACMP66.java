import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP66 {
    char[] chars = {
        'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd',
        'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm', 'q'
    };

    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        char c = in.next().toCharArray()[0];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                out.println(chars[i + 1]);
                return;
            }
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
        new ACMP66().run();
    }
}
