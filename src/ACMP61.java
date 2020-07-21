import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP61 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int left = 0,
            right = 0;

        for (int i = 0; i < 4; i++) {
            left += in.nextInt();
            right += in.nextInt();
        }

        if (left == right) out.println("DRAW");
        else if (left > right) out.println(1);
        else out.println(2);
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
        new ACMP61().run();
    }
}
