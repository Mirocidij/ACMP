import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP678 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int[] thimbles = new int[3];
        thimbles[0] = 1;
        char[] commands = in.next().toCharArray();

        for (char c : commands) {
            switch (c) {
                case 'C':
                    if (thimbles[0] == 1 || thimbles[2] == 1) {
                        swap(thimbles, 0, 2);
                    }
                    break;
                case 'B':
                    if (thimbles[1] == 1 || thimbles[2] == 1) {
                        swap(thimbles, 1, 2);
                    }
                    break;
                case 'A':
                    if (thimbles[0] == 1 || thimbles[1] == 1) {
                        swap(thimbles, 0, 1);
                    }
                    break;
            }
        }

        for (int i = 0; i < thimbles.length; i++) {
            if (thimbles[i] == 1) {
                out.println(i + 1);
            }
        }
    }

    // swap without tmp variable
    void swap(int[] array, int from, int to) {
        array[from] += array[to];
        array[to] = array[from] - array[to];
        array[from] = array[from] - array[to];
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
        new ACMP678().run();
    }
}


