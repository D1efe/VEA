package vea;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
/**
 *
 * @author dan
 */
public class CloseProgram {

    static Boolean answer;

    public static Boolean conf(String title, String text) {

        Stage window = new Stage();
        Label label = new Label(text);
        
        Button yes = new Button("Yes");
        Button no = new Button("No");

        yes.setOnAction(e -> {
            answer = true;
            window.close();
        });
        no.setOnAction(e -> {
            answer = false;
            window.close();
        });
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(label, yes, no);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 300, 250);
        window.setScene(scene);
        window.showAndWait();

        return answer;
    }
}
