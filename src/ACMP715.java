import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ACMP715 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt(),
            m = in.nextInt();

        char[][] blackWhitePicture = new char[n][m];
        char[][] negativeBlackWhitePicture = new char[n][m];

        for (int i = 0; i < n; i++) {
            blackWhitePicture[i] = in.next().toCharArray();
        }
        in.nextLine();
        for (int i = 0; i < n; i++) {
            negativeBlackWhitePicture[i] = in.next().toCharArray();
        }

        int mistakes = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (blackWhitePicture[i][j] == negativeBlackWhitePicture[i][j])
                    mistakes++;
            }
        }

        out.println(mistakes);
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
        new ACMP715().run();
    }
}
