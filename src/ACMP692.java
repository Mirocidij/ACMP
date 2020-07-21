import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP692 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        char[] binaryBits = Integer.toBinaryString(in.nextInt()).toCharArray();
        int oneCount = 0;
        for (char bit : binaryBits) {
            if (bit == '1') oneCount++;
        }

        if (oneCount == 1) out.println("YES");
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
        new ACMP692().run();
    }
}
