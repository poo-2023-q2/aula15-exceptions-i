/**
 * Efetua uma operacao de divisao entre dois inteiros, 
 * a partir da entrada padrao. Por nao haver tratamento 
 * de erros, multiplas excecoes podem ser disparadas para
 * o usuario a depender do valor de entrada.
 */
public class QuotientNaive {
    
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.printf("%d/%d = %d\n", a, b, a / b);
        System.out.println("End of program");
    }
}
