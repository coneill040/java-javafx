package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {        
        Button bt = new Button("Print HelloWorld in the console");
        bt.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent arg0)
            {
                System.out.println("HelloWorld! :)");
            }
        });
        
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 150);
        root.getChildren().add(bt);

        stage.setTitle("HelloWorld in JavaFX 2.0");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        Application.launch(args);
    }
}