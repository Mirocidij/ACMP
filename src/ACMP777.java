import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP777 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int s = in.nextInt(),
            t = in.nextInt();

        if (t > s) out.println(t - s);
        else out.println(12 - s + t);
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
        new ACMP777().run();
    }
}
