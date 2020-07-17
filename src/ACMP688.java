import java.awt.*;
import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP688 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        Point gopher = new Point(in.nextInt(), in.nextInt());
        Point dog = new Point(in.nextInt(), in.nextInt());

        int rowCount = in.nextInt();

        for (int i = 0; i < rowCount; i++) {
            Point row = new Point(in.nextInt(), in.nextInt());

            double gopherToRowDistance = getDistance(gopher, row);
            double dogToRowDistance = getDistance(dog, row) / 2;

            if (gopherToRowDistance <= dogToRowDistance) {
                out.println(i + 1);
                return;
            }
        }

        out.println("NO");
    }

    double getDistance(Point one, Point two) {
        return Math.sqrt(
            (one.x - two.x) * (one.x - two.x) + (one.y - two.y) * (one.y - two.y)
        );
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
        new ACMP688().run();
    }
}
