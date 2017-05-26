package ModeleSantiago;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Main extends Application {
	
	

    public static void main(String[] args) {
        launch(args);
    }

	@Override
	public void start(Stage stage) throws Exception{
		  
			stage.setWidth(1380);
	        stage.setHeight(740);
	        
	        stage.setTitle("Partie de Santiago");
	       
	        Group root = new Group();
	        Scene scene = new Scene(root);
	        scene.setFill(Color.GRAY);
	       
	        Rectangle console = new Rectangle(0, 500, 1400, 500);
	        console.setFill(Color.BEIGE);
	        
	        root.getChildren().add(console);
	        
	        stage.setScene(scene);
	        stage.show();
	        
		
	}
	
}