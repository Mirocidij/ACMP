import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP21 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            int salary = in.nextInt();
            max = Math.max(salary, max);
            min = Math.min(salary, min);
        }
        out.println(max - min);
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
        new ACMP21().run();
    }
}
