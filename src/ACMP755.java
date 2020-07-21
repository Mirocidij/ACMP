import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP755 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int misha = in.nextInt(),
            masha = in.nextInt(),
            z = in.nextInt();

        if (misha + masha >= z) {
            out.println(misha + masha - z);
        } else out.println("Impossible");
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
        new ACMP755().run();
    }
}
