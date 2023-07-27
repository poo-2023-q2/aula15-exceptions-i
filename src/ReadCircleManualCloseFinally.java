import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadCircleManualCloseFinally {

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);

            System.out.print("x: ");
            double x = scanner.nextDouble();
            System.out.print("y: ");
            double y = scanner.nextDouble();
            System.out.print("radius: ");
            double radius = scanner.nextDouble();

            Circle c = new Circle(x, y, radius);

            System.out.printf("Area: %.3f\n",  c.area());
        } catch (InputMismatchException e) {
            System.err.println("You typed an invalid real number");
        } catch (InvalidCoordinateException e) {
            System.err.println("The coordinate must be in range [0,1]. " + e.getMessage());
        } catch (InvalidRadiusException e) {
            System.err.println("The radius must be in range [0,1]. " + e.getMessage() );
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
