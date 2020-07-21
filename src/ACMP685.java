import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ACMP685 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int[] sandCost = new int[3];
        int[] capacity = new int[3];
        for (int i = 0; i < 3; i++) {
            sandCost[i] = in.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            capacity[i] = in.nextInt();
        }
        Arrays.sort(sandCost);
        Arrays.sort(capacity);

        out.println(sandCost[0] * capacity[0] + sandCost[1] * capacity[1] + sandCost[2] * capacity[2]);
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
        new ACMP685().run();
    }
}
