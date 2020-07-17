import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class ACMP803 {
    int cycleStart = -1;
    int cycleEnd = -1;

    // your solution here
    private void solve(Scanner in, PrintWriter out) {
        BigDecimal a = in.nextBigDecimal();
        BigDecimal b = in.nextBigDecimal();
        int index = in.nextInt();

        BigDecimal res = a.divide(b, new MathContext(10, RoundingMode.CEILING));
        String f = res.remainder(BigDecimal.ONE).toString();
        if (f.equals("0")) {
            out.println(0);
            return;
        }
        String fractional = f.substring(2);

        if (fractional.length() >= index) {
            out.println(fractional.charAt(index - 1));
        } else {
            if (hasNumSeq(fractional)) {
                out.println(fractional.charAt(cycleStart));
            } else {
                int index2 = (index % 6) - 1;
                if (fractional.length() <= index2) {
                    out.println(0);
                    return;
                }

                out.println(fractional.charAt(index2));
            }
        }
    }

    boolean hasNumSeq(String c) {
        char[] chars = c.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                cycleStart = i;
                return true;
            }
        }

        return false;
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
        new ACMP803().run();
    }
}