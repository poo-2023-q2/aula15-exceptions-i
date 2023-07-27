/**
 * Divide operation with a flag to  notify errors
 */
public class QuotientWithBooleanFlag {

    public static class BooleanFlag {
        boolean value;
    }

    /**
     * Check if a string can be successfully converted to a number
     * @param s the string
     * @return true if the string is convertible to number
     */
    public static boolean isNumber(String s) {
        return s.matches("^\\d+$");
    }

    /**
     * Divides two integers
     * If the division cannot be performed (b is 0), then
     * status is false and return value is zero
     * @param a the dividend
     * @param b the divisor
     * @param status true if the operation could be performed
     * @return the result
     *
     */
    public static int divide(int a, int b, BooleanFlag status) {
        if (b == 0) {
            status.value = false;
            return 0;
        }
        status.value = true;

        return a / b;
    }

    /**
     * Perform selections to prevent runtime exceptions
     *
     * @param args the string arguments
     */
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Missing operands. Cannot proceed");
        } else if (!isNumber(args[0]) || !isNumber(args[1])) {
            System.err.println("All args must be numbers");
        } else {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            BooleanFlag flag = new BooleanFlag();

            int c = divide(a, b, flag);

            if (!flag.value) {
                System.err.println("Divisor cannot be zero");
            } else {
                System.out.printf("%d/%d = %d\n", a, b, c);
            }
        }
    }
}
