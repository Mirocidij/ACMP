import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP33 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int garry = in.nextInt(),
            larry = in.nextInt();

        int together = Math.min(10, (garry + larry) - 1);
        out.println((together - garry) + " " + (together - larry));
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
        new ACMP33().run();
    }
}
