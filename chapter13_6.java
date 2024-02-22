import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.Scanner;

public class chapter13_6 {
    public static void main(String[] args) {
        // Create a circle centered at (50, 30) with a radius of 20
        Circle circle = new Circle(50, 30, 20);

        // Ask the user to supply additional x and y coordinate values
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y coordinate: ");
        double y = scanner.nextDouble();

        // Check if the point (x, y) is within the circle
        boolean containsPoint = circle.contains(x, y);
        if (containsPoint) {
            System.out.println("The point (" + x + ", " + y + ") is inside the circle.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is outside the circle.");
        }

        // Check if there is any overlap between the circle and a rectangle
        Rectangle rectangle = new Rectangle(x, y, 20, 15);
        boolean intersects = circle.intersects(rectangle.getBoundsInLocal());
        if (intersects) {
            System.out.println("The circle intersects with the rectangle.");
        } else {
            System.out.println("The circle does not intersect with the rectangle.");
        }
    }
}
