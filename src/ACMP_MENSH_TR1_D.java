import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP_MENSH_TR1_D {
    private void solve(Scanner in, PrintWriter out) {
        // 2170
        // 1945
        // 1816

        System.out.println((1993 - 48) / 60);
        System.out.println((1993 - 48) % 60);

        long x1 = in.nextInt(), y1 = in.nextInt();
        long x2 = in.nextInt(), y2 = in.nextInt();
        long x3 = in.nextInt(), y3 = in.nextInt();
        long x0 = in.nextInt(), y0 = in.nextInt();

        long a1 = (x1 - x0) * (y2 - y1) - (x2 - x1) * (y1 - y0);
        long a2 = (x2 - x0) * (y3 - y2) - (x3 - x2) * (y2 - y0);
        long a3 = (x3 - x0) * (y1 - y3) - (x1 - x3) * (y3 - y0);

        if ((a1 >= 0 && a2 >= 0 && a3 >= 0) || (a1 <= 0 && a2 <= 0 && a3 <= 0)) {
            out.println("In");
        } else { out.println("Out"); }
    }

    void run() {
        try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) { new ACMP_MENSH_TR1_D().run(); }
}