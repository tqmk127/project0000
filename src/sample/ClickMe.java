package sample;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class ClickMe extends Application {

    public static void main(String[] args) {

        launch(args);

    }

    Button btn, btn1;

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Create the button
        btn = new Button();
        btn1 = new Button();
        btn.setText("Click me please!");
        btn1.setText("Just one click");
        btn.setOnAction(e -> buttonClick());
        btn1.setOnAction(e -> buttonClick1() );

        // Add the button to layout pane
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);
        pane.setBottom(btn1);

        // Add the layout pane to a scene
        Scene scene = new Scene(pane, 300,500);

        //Finalize an show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("The Click Me App");
        primaryStage.show();
    }

    public void buttonClick() {

        if (btn.getText() == "Click me please!"){

            btn.setText("You clicked me!");
        }
        else {

            btn.setText("Click me please!");
        }
    }

    public void buttonClick1(){
        if (btn1.getText() == "Just one click"){

            btn1.setText("Thank you!");
        }
        else {
            btn1.setText("Just one click");
        }
    }
}
