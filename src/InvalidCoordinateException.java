
public class InvalidCoordinateException extends RuntimeException {
    public InvalidCoordinateException(double coord) {
        super("Coordinate is invalid: " + coord);
    }
}