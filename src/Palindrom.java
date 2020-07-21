import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Palindrom {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        char[] str = in.nextLine().toCharArray();

        for (int i = 0; i < str.length / 2; i++) {
            if (str[i] != str[str.length - 1 - i]) {
                out.println("It isn't palindrome");
                return;
            }
        }

        out.println("It is palindrome!");
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
        new Palindrom().run();
    }
}
