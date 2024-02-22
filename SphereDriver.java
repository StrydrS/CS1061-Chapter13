// Chapter 13 exercises 1, 2, and 3


public class SphereDriver {
    public static void main(String[] args) {
        // Instantiate a Point at x=10, y=15, and z=20
        Point centerPoint = new Point(10.0, 15.0, 20.0);
        
        // Instantiate a Sphere centered at that point and having a radius of 8
        Sphere sphere = new Sphere(centerPoint, 8.0);
        
        // Call the sphere's describe method
        System.out.println("Before Transformations:");
        sphere.describe();
        
        // Shift the sphere’s location by +3.0 in the x-direction, −2.5 in the y-direction, and +4.0 in the z-direction
        double[] shiftOffset = {3.0, -2.5, 4.0};
        sphere.shift(shiftOffset);
        
        // Increase its radius by a factor of 1.5
        double scaleFactor = 1.5;
        sphere.scale(scaleFactor);
        
        // Call the sphere's describe method again
        System.out.println("\nAfter Transformations:");
        sphere.describe();
    }
}

class Point {    
    // Instance variables
    private double[] position;

    // Constructor to initialize the position array with x, y, and z values
    public Point(double x, double y, double z) {
        this.position = new double[]{x, y, z};
    }

    // Method to shift the point's position by the specified offset
    public Point shift(double[] offset) {
        for (int i = 0; i < position.length; i++) {
            position[i] += offset[i];
        }
        return this; // Support chaining
    }

    // Accessor method to return the point's position
    public double[] getPosition() {
        return position;
    }

}

class Sphere {
    // Instance variables
    private Point center;
    private double radius;

    // Constructor to initialize center (Point) and radius (double)
    public Sphere(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // Method to shift the sphere's position by the specified offset
    public Sphere shift(double[] offset) {
        center.shift(offset); // Utilizing the shift method from the Point class
        return this; // Support chaining
    }

    // Method to scale the sphere's radius by the specified factor
    public Sphere scale(double factor) {
        this.radius *= factor;
        return this; // Support chaining
    }

    // Method to describe the sphere
    public void describe() {
        System.out.println("Sphere:");
        System.out.println("Center: " + java.util.Arrays.toString(center.getPosition()));
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        // Example usage
        Point center = new Point(1.0, 2.0, 3.0);
        Sphere sphere = new Sphere(center, 5.0);
        
        double[] shiftOffset = {2.0, 3.0, 1.0};
        double scaleFactor = 1.5;
        
        // Chaining: shift and then scale
        sphere.shift(shiftOffset).scale(scaleFactor);
        
        // Describe the sphere after transformations
        sphere.describe();
    }
}


