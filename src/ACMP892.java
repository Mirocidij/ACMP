import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP892 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int month = in.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                out.println("Autumn");
                break;
            default:
                out.println("Error");
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
        new ACMP892().run();
    }
}
