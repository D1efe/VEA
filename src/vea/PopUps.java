package vea;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PopUps {

    public static void PopupHelp(String title) {

        InformationStrings info = new InformationStrings();
        Label label = new Label("Welcome to the help page, all the information you need can be found here");
        Stage window = new Stage();
        Scene scene;
        Button btn = new Button("click to close");
        ScrollPane sb = new ScrollPane();
        sb.setHvalue(0);
        sb.setVvalue(0);

        VBox longText = new VBox(20);

        Label label1 = new Label(info.getIntro().getText());
        Label label2 = new Label(info.getAddVid().getText());
        Label label3 = new Label(info.getDsis().getText());
        Label label4 = new Label(info.getMicsq().getText());
        Label label5 = new Label(info.getDscqs().getText());
        Label label6 = new Label(info.getImpairments().getText());
        Label label7 = new Label(info.getEvalBar().getText());
        Label label8 = new Label(info.getResultTable().getText());

        window.setTitle(title);
        window.initModality(Modality.APPLICATION_MODAL);
        window.setMinWidth(300);
        window.setMinHeight(300);

        btn.setOnAction(e -> window.close());

        //winDiv.getItems().addAll(label1, label2, label3, label4, label5, label6, label7, layout);
        longText.getChildren().addAll(label1, label2, label3, label4, label5, label6, label7, label8, btn);
        sb.vvalueProperty().bind(longText.heightProperty());
        sb.setContent(longText);

        scene = new Scene(sb);
        scene.getStylesheets().add("/vea/CustomStyles.css");

        window.setScene(scene);
        window.showAndWait();

    }

    public static void PopupError(String title) {

        Label label = new Label("Please enter a name for your test");
        Stage window = new Stage();
        Scene scene;
        Button btn = new Button("click to close");

        window.setTitle(title);
        window.initModality(Modality.APPLICATION_MODAL);
        window.setMinWidth(500);
        window.setMinHeight(300);

        btn.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, btn);
        layout.setAlignment(Pos.CENTER);

        scene = new Scene(layout);
        scene.getStylesheets().add("/vea/CustomStyles.css");

        window.setScene(scene);
        window.showAndWait();

    }
}
