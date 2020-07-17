import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP530 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int w = in.nextInt();
        int h = in.nextInt();

        char[][] image1 = new char[h][w];
        char[][] image2 = new char[h][w];

        for (int i = 0; i < image1.length; i++) {
            char[] chars = in.next().toCharArray();
            System.arraycopy(chars, 0, image1[i], 0, image1[i].length);
        }

        for (int i = 0; i < image2.length; i++) {
            char[] chars = in.next().toCharArray();
            System.arraycopy(chars, 0, image2[i], 0, image2[i].length);
        }

        char[] commands = in.next().toCharArray();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (image1[i][j] == '0' && image2[i][j] == '0') {
                    out.print(commands[0]);
                } else if (image1[i][j] == '0' && image2[i][j] == '1') {
                    out.print(commands[1]);
                } else if (image1[i][j] == '1' && image2[i][j] == '0') {
                    out.print(commands[2]);
                } else if (image1[i][j] == '1' && image2[i][j] == '1') {
                    out.print(commands[3]);
                }
            }
            out.println();
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
        new ACMP530().run();
    }
}


