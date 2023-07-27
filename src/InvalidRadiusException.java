
public class InvalidRadiusException extends RuntimeException {
    public InvalidRadiusException(double radius) {
        super("Radius is invalid: " + radius);
    }
}