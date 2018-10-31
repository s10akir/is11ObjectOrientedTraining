import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class JavaFXTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage){

        BorderPane border = new BorderPane();
        Button button = new Button("OK");

        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                System.out.println("ボタンが押下されました。");
            }
        });

//        button.setOnAction((ActionEvent)-> {
//            System.out.println("ボタンが押下されました。");
//        });

        border.setTop(button);
        Scene scene = new Scene(border, 500, 300);

        stage.setScene(scene);
        stage.show();

    }

}
