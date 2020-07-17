import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP935 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int x1, y1, x2, y2;
        x1 = in.nextInt();
        y1 = in.nextInt();
        x2 = in.nextInt();
        y2 = in.nextInt();

        out.println(
            isBlack(x1, y1) == isBlack(x2, y2)
                ? "YES"
                : "NO"
        );
    }

    boolean isBlack(int x, int y) {
        boolean result = false;

        if (x % 2 == 0 && y % 2 == 0) {
            result = true;
        } else if (x % 2 != 0 && y % 2 != 0) {
            result = true;
        }

        return result;
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
        new ACMP935().run();
    }
}
