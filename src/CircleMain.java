public class CircleMain {
    public static void main(String[] args) {
        try {
            new Circle(-1,0, 10);
        } catch (InvalidCoordinateException e) {
            System.err.println("Please check the coordinates. " + e.getMessage());
        } catch(InvalidRadiusException e) {
            System.err.println("Invalid radius value. Please check. " + e.getMessage());
        }

        try {
            new Circle(0,0, -10);
        } catch (InvalidCoordinateException e) {
            System.err.println("Please check the coordinates. " + e.getMessage());
        } catch(InvalidRadiusException e) {
            System.err.println("Please check the radius. " + e.getMessage());
        }
    }
}
