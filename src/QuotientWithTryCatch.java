/**
 * Nessa versao, fazemos um teste com try..catch...finally para
 * capturar as possiveis excecoes que podem ser geradas pelo programa.
 * Como vantagem, podemos apontar que o algoritmo principal, que faz a entrada
 * de dados e a operacao em si, nao fica misturado com tratamento de erros. Alem
 * disso, o tratamento de erros fica concentrado em uma regiao continua do programa
 * (sequencia de blocos catch), o que contribui para a melhor legibilidade do programa.
 */
public class QuotientWithTryCatch {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            System.out.printf("%d/%d = %d\n", a, b, a / b);
        } catch (ArithmeticException e) {
            System.err.println("We had an arithmetic error. Please check if the operands are valid");
        } catch (NumberFormatException e) {
            System.err.println("We could not convert one or both the arguments");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Usage: Quotient4 dividend divisor");
        } finally {
            System.out.println("I always execute");
        }
        System.out.println("Program flow continues normally");

    }
}
