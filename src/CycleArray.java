import java.io.PrintWriter;
import java.util.Scanner;

public class CycleArray {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int n = 10;
        int[] list = new int[n];
        for (int i = 0; i < list.length; i++) {
            list[i] = i * 100;
            System.out.println(list[i]);
        }

        for (int i = 0; i < 10000; i++) {
            System.out.println(list[i % n] + "\t " + i);
        }
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
        new CycleArray().run();
    }
}
