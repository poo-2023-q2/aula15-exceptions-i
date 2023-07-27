public class Circle {
    private double coordX;
    private double coordY;
    private double radius;

    public Circle(double coordX, double coordY, double radius) {
        setCoordX(coordX);
        setCoordY(coordY);
        setRadius(radius);
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void setCoordX(double coordX) {
        if (coordX < 0.0 || coordX > 1.0) {
            throw new InvalidCoordinateException(coordX);
        }
        this.coordX = coordX;
    }

    public void setCoordY(double coordY) {
        if (coordY < 0.0 || coordY > 1.0) {
            throw new InvalidCoordinateException(coordY);
        }
        this.coordY = coordY;
    }

    public void setRadius(double radius) {
        if (radius < 0.0) {
            throw new InvalidRadiusException(radius);
        }
        this.radius = radius;
    }

    public double getCoordX() {
        return coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public double getRadius() {
        return radius;
    }

    
}
