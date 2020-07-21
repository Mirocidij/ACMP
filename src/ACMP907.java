import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP907 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int w = in.nextInt(),
            h = in.nextInt(),
            r = in.nextInt();

        if (Math.min(w, h) / 2 >= r) out.println("YES");
        else out.println("NO");
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
        new ACMP907().run();
    }
}
