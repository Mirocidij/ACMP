import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] c = in.readLine().toCharArray();

        for (int i = 0; i < c.length / 2; i++) {
            if (c[i] != c[c.length - 1 -i]) {
                System.out.println("It isn't palindrome!");
                return;
            }
        }

        System.out.println("It is palindrome!");
    }
}
