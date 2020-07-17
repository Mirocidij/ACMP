import java.io.PrintWriter;
import java.util.Scanner;

public class ACMP327 {
    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        int count = in.nextInt();
        String ticket;

        for (int i = 0; i < count; i++) {
            ticket = in.next();
            int nTicket = Integer.parseInt(ticket) - 1;

            int rightSum = 0;
            int leftSum = 0;

            for (int k = 0; k < 3; k++) {
                rightSum += nTicket % 10;
                nTicket /= 10;
            }
            for (int k = 0; k < 3; k++) {
                leftSum += nTicket % 10;
                nTicket /= 10;
            }

            if (rightSum == leftSum) {
                out.println("Yes");
                continue;
            }

            nTicket = Integer.parseInt(ticket) + 1;
            rightSum = 0;
            leftSum = 0;

            for (int k = 0; k < 3; k++) {
                rightSum += nTicket % 10;
                nTicket /= 10;
            }
            for (int k = 0; k < 3; k++) {
                leftSum += nTicket % 10;
                nTicket /= 10;
            }

            if (rightSum == leftSum) {
                out.println("Yes");
            } else {
                out.println("No");
            }
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
        new ACMP327().run();
    }
}
