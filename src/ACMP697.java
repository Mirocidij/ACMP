import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP697 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int l = in.nextInt(),
            w = in.nextInt(),
            h = in.nextInt();

        int s = l * h * 2 + w * h * 2;
        out.println((s + 15) / 16);
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
        new ACMP697().run();
    }
}
