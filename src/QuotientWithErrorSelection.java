/**
 * Um modo classico de tratar erros eh evitar que eles ocorram, por exemplo,
 * utilizando estruturas de selecao ao longo do programa. Embora seja simples e 
 * nao demande estruturas adicionais, pode aumentar a verbosidade dos algoritmos
 * com aspectos nao-essenciais ao problema.
 */
public class QuotientWithErrorSelection {
    /**
     * Check if a string can be successfully converted to a number
     * @param s the string
     * @return true if the string is convertible to number
     */
    public static boolean isNumber(String s) {
        return s.matches("^\\d+$");
    }

    /**
     * Perform selections to prevent runtime exceptions
     * More complex, but less vulnerable
     *
     * @param args the string arguments
     */
    public static void divide(String[] args) {
        if (args.length < 2) {
            System.err.println("Missing operands. Cannot proceed");
        } else if (!isNumber(args[0]) || !isNumber(args[1])) {
            System.err.println("All args must be numbers");
        } else {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            if (b == 0) {
                System.err.println("Divisor cannot be zero");
            } else {
                System.out.printf("%d/%d = %d\n", a, b, a / b);
            }
        }
    }


    public static void main(String[] args) {
        divide(args);
    }
}
