import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP147 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        int tmp;

        for (int i = 0; i < num; i++) {
            tmp = b;
            b += a;
            a = tmp;
        }

        out.println(a);
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
        new ACMP147().run();
    }
}
