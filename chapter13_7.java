// This program will display a window with an ellipse shape centered at (50, 30) with horizontal radius 20 and 
// vertical radius 15. The ellipse will have a light gray fill color, a black stroke color, and a stroke width 
// of 3. The window title will be "Ellipse".


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;

public class EllipseDriver extends Application {
    public void start(Stage stage) {
        // Creates an Ellipse shape with center at (50, 30) and radii of 20 and 15
        Ellipse ellipse = new Ellipse(50, 30, 20, 15);

        // Creates a Group that contains the Ellipse shape
        Group root = new Group(ellipse);

        // Creates a Scene with the Group as its root and dimensions of 600x300
        Scene scene = new Scene(root, 600, 300);

        // Sets the fill color of the ellipse to LIGHTGRAY
        ellipse.setFill(Color.LIGHTGRAY);
        
        // Sets the stroke color of the ellipse to BLACK
        ellipse.setStroke(Color.BLACK);
        
        // Sets the stroke width of the ellipse to 3
        ellipse.setStrokeWidth(3);

        // Sets the Scene of the stage to the created scene
        stage.setScene(scene);
        
        // Sets the title of the stage to "Ellipse"
        stage.setTitle("Ellipse");
        
        // Displays the stage
        stage.show();
    }

    public static void main(String[] args) {
        // Launches the JavaFX application
        launch(args);
    }
}
x