 package vea;

import java.io.File;
import static java.lang.Integer.MAX_VALUE;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.stage.FileChooser;

/**
 *
 * @author dan
 */
public class Main extends Application {

    Stage window;
    Label label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13;
    VBox vbox1, vbox2, vbox3, vbox4;
    HBox hbox1, hbox2, hbox3, hbox4, hbox5, hbox6, hbox7;
    Scene scene1, scene2, scene3, scene4;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;
    BorderPane bp1, bp2, bp3, bp4, bp5, bp6;
    GridPane gp1;
    TextField input1;
    TableView<TestResults> resultTable;
    SplitPane pane1, pane2, pane3, pane4;
    ScrollBar sb;

    FileChooser chooseVideo = new FileChooser();
    File file;

    private final String mediaUrl = "http://download.oracle.com/otndocs/products/javafx/oow2010-2.flv";

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;

        btn1 = new Button("New Test");
        btn2 = new Button("Go Home");
        Tooltip homeBtn = new Tooltip();
        homeBtn.setText("Click here to go home and start new test");
        btn2.setTooltip(homeBtn);

        btn3 = new Button("Change Media");
        btn4 = new Button("Proceed to evaluation");
        btn5 = new Button("Proceed to results");
        btn6 = new Button("Save");
        btn7 = new Button("Delete Row");
        btn6.setMaxWidth(MAX_VALUE);

        //Buttons for Media page
        Button gridButton1 = new Button("add video");
        Tooltip vidAddBtn = new Tooltip();
        vidAddBtn.setText("Your chosen video will have its details displayed to the right");
        gridButton1.setTooltip(vidAddBtn);

        Button gridButton2 = new Button("add video");

        Button a = new Button("DSCQS");
        Tooltip method1 = new Tooltip();
        method1.setText("Double-Stimulus Continuous Quality Scale");
        a.setTooltip(method1);
        Button b = new Button("DSIS");
        Tooltip method2 = new Tooltip();
        method2.setText("Double-Stimulus Impairment Scale");
        b.setTooltip(method2);
        Button c = new Button("MICSQ");
        Tooltip method3 = new Tooltip();
        method3.setText("Multimodal Interactive Continuous Scoring of Quality");
        c.setTooltip(method3);

        //home Page
        bp1 = new BorderPane();
        bp1.setPadding(new Insets(10));

        label1 = new Label("VEA");
        label2 = new Label("Welcome to VEA. to begin, please click the button in \n the bottom left corner to proceed.");
        Tooltip welc = new Tooltip();
        welc.setText("VEA stands for Video Evaluation Application");
        label2.setTooltip(welc);

        //Menu which will be on all pages
        Menu myMenu = new Menu("_Menu");

        MenuItem help = new MenuItem("_Help");
        help.setOnAction(e -> PopUps.PopupHelp("Help Page"));

        MenuItem exitProg = new MenuItem("_Exit");
        exitProg.setOnAction(e -> closeProgram());
        myMenu.getItems().addAll(help, exitProg);

        pane1 = new SplitPane();
        pane1.setOrientation(Orientation.VERTICAL);
        pane2 = new SplitPane();
        pane2.setOrientation(Orientation.VERTICAL);
        pane3 = new SplitPane();
        pane3.setOrientation(Orientation.VERTICAL);
        pane4 = new SplitPane();
        pane4.setOrientation(Orientation.VERTICAL);

        MenuBar mainMenu = new MenuBar();
        mainMenu.getMenus().add(myMenu);

        hbox1 = new HBox(20);
        hbox1.getChildren().addAll(label1);
        hbox1.setAlignment(Pos.CENTER);

        pane1.getItems().addAll(mainMenu, bp1);

        bp1.setTop(hbox1);
        bp1.setCenter(label2);
        bp1.setBottom(btn1);

        scene1 = new Scene(pane1, 800, 500);
        scene1.getStylesheets().add("/vea/CustomStyles.css");

        //Input Page
        bp2 = new BorderPane();
        bp2.setPadding(new Insets(10));
        bp5 = new BorderPane();
        bp5.setPadding(new Insets(10, 10, 10, 10));

        gp1 = new GridPane();
        gp1.setPadding(new Insets(10, 10, 10, 10));
        gp1.setHgap(30);
        gp1.setVgap(15);

        label3 = new Label("Media Selection");
        label4 = new Label("Please insert your media");
        input1 = new TextField("Enter test name");
        input1.setPromptText("Enter name for test");
        input1.setMinWidth(60);

        hbox2 = new HBox(20);
        hbox2.getChildren().addAll(label3, input1);
        hbox3 = new HBox(20);
        hbox3.getChildren().addAll(btn2, btn4);
        hbox3.setSpacing(10);
        hbox3.setAlignment(Pos.BOTTOM_CENTER);

        label5 = new Label("insert video");
        label6 = new Label("insert video");
        label7 = new Label("Resolution: \nFrame Rate: \nEncoding Format: ");
        label8 = new Label("Resolution: \nFrame Rate: \nEncoding Format: ");
        GridPane.setConstraints(gridButton1, 0, 0);
        GridPane.setConstraints(gridButton2, 0, 1);
        GridPane.setConstraints(label5, 1, 0);
        GridPane.setConstraints(label6, 1, 1);
        GridPane.setConstraints(label7, 2, 0);
        GridPane.setConstraints(label8, 2, 1);
        gp1.getChildren().addAll(gridButton1, gridButton2, label5, label6, label7, label8);
        gp1.setAlignment(Pos.TOP_CENTER);

        HBox testMethods = new HBox();
        testMethods.getChildren().addAll(a, b, c);
        testMethods.setPadding(new Insets(10, 10, 10, 10));
        testMethods.setSpacing(10);
        testMethods.setAlignment(Pos.CENTER);

        pane2.getItems().addAll(mainMenu, bp2);

        bp2.setTop(hbox2);
        bp2.setCenter(gp1);
        bp2.setBottom(bp5);
        bp5.setTop(testMethods);
        bp5.setBottom(hbox3);
        scene2 = new Scene(pane2, 800, 500);
        scene2.getStylesheets().add("/vea/CustomStyles.css");

        //MediaPlayer Page 
        bp4 = new BorderPane();
        bp4.setPadding(new Insets(10));
        bp5 = new BorderPane();
        bp5.setPadding(new Insets(10));

        label9 = new Label("MediaPlayer");
        label10 = new Label();

        /*Create a method that gets the value of the scroll bars current position and links it to set 
        values displayed in results      */
        sb = new ScrollBar();
        sb.setMin(0);
        sb.setMax(100);
        sb.setValue(50);

        hbox4 = new HBox(20);
        hbox4.getChildren().addAll(label9, label10);
        hbox4.setAlignment(Pos.CENTER);
        hbox5 = new HBox(20);
        hbox5.getChildren().addAll(btn3, btn5);
        hbox5.setAlignment(Pos.BOTTOM_CENTER);
        hbox5.setSpacing(10);

        //VideoPlayer section, still part of MediaPlayer page
        Button vidPlay = new Button("Start");
        Button vidPause = new Button("Pause");
        Button vidStop = new Button("Stop");
        Media media = new Media(mediaUrl);
        MediaPlayer player = new MediaPlayer(media);
        MediaView viewer = new MediaView(player);

        vidPlay.setOnAction(e -> player.play());
        vidPause.setOnAction(e -> player.pause());
        vidStop.setOnAction(e -> player.stop());

        hbox6 = new HBox();
        hbox6.getChildren().addAll(vidPlay, vidPause, vidStop);
        hbox6.setAlignment(Pos.BOTTOM_CENTER);
        hbox6.setSpacing(5);
        vbox1 = new VBox();
        vbox1.getChildren().addAll(viewer, hbox6);

        pane3.getItems().addAll(mainMenu, bp4);

        bp4.setTop(hbox4);
        bp4.setCenter(vbox1);
        bp4.setBottom(bp5);
        bp5.setTop(sb);
        bp5.setBottom(hbox5);
        scene3 = new Scene(pane3, 800, 500);
        scene3.getStylesheets().add("/vea/CustomStyles.css");

        //Results Page
        bp6 = new BorderPane();
        bp6.setPadding(new Insets(0, 0, 0, 0));

        label12 = new Label("Results ");
        label12.setId("resultLabel");
        label12.setAlignment(Pos.CENTER);

        TableColumn<TestResults, String> nameColumn = new TableColumn<>("Test Name");
        TableColumn<TestResults, Integer> numberColumn = new TableColumn<>("Test no.");
        TableColumn<TestResults, String> result1Column = new TableColumn<>("Screen Brightness");
        TableColumn<TestResults, String> result2Column = new TableColumn<>("Observation Angle");
        TableColumn<TestResults, String> result3Column = new TableColumn<>("Monitor Resolution");
        TableColumn<TestResults, String> result4Column = new TableColumn<>("Screen Size");
        TableColumn<TestResults, String> result5Column = new TableColumn<>("User Rating");

        nameColumn.setMinWidth(40);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("testName"));
        numberColumn.setMinWidth(50);
        numberColumn.setCellValueFactory(new PropertyValueFactory<>("testNumber"));
        result1Column.setMinWidth(70);
        result1Column.setCellValueFactory(new PropertyValueFactory<>("screenBrightness"));
        result2Column.setMinWidth(60);
        result2Column.setCellValueFactory(new PropertyValueFactory<>("observationAngle"));
        result3Column.setMinWidth(60);
        result3Column.setCellValueFactory(new PropertyValueFactory<>("monitorResolution"));
        result4Column.setMinWidth(60);
        result4Column.setCellValueFactory(new PropertyValueFactory<>("screenSize"));
        result5Column.setMinWidth(60);
        result5Column.setCellValueFactory(new PropertyValueFactory<>("rating"));

        resultTable = new TableView<>();
        //resultTable.setItems(getResults());
        resultTable.getColumns().addAll(nameColumn, numberColumn, result1Column,
                result2Column, result3Column, result4Column, result5Column);

        hbox6 = new HBox();
        hbox6.getChildren().addAll(label12);
        hbox6.setAlignment(Pos.CENTER);

        //right side of the page
        vbox2 = new VBox();
        vbox2.getChildren().addAll(btn2, btn6, btn7);
        vbox2.setPadding(new Insets(10, 10, 10, 10));
        vbox2.setSpacing(10);

        pane4.getItems().addAll(mainMenu, bp6);

        bp6.setTop(hbox6);
        bp6.setLeft(resultTable);
        bp6.setRight(vbox2);

        scene4 = new Scene(pane4, 800, 500);
        scene4.getStylesheets().add("/vea/CustomStyles.css");

        //Button functionality
        btn1.setOnAction(e -> {
            primaryStage.setScene(scene2);
            primaryStage.setTitle("Select your media");
        });

        btn2.setOnAction(e -> {
            primaryStage.setScene(scene1);
            primaryStage.setTitle("HomePage");
        });
        btn3.setOnAction(e -> {
            primaryStage.setScene(scene2);
            primaryStage.setTitle("Select your media");
        });
        btn4.setOnAction(e -> {
            /* String compare = input1.getText();
            if (input1.getText() == compare) {
                PopUps.PopupError("error");
                primaryStage.setScene(scene2);
                primaryStage.setTitle("Select your media");
            } else if (input1.getText() != compare) 
             */
            label10.setText("Test Name: " + input1.getText());

            primaryStage.setScene(scene3);
            primaryStage.setTitle("Media Evaluation");

        });
        btn5.setOnAction(e -> {
            primaryStage.setScene(scene4);
            primaryStage.setTitle("View results");
            addResult();
        });
        btn7.setOnAction(e -> delResults());

        primaryStage.setTitle("HomePage");
        primaryStage.setScene(scene1);
        primaryStage.show();
        primaryStage.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });
        gridButton1.setOnAction(e -> {
            addVideo();
            label5.setText(file.toString());
        });
        gridButton2.setOnAction(e -> {
            addVideo();
            label6.setText(file.toString());
        });
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void closeProgram() {
        Boolean result = CloseProgram.conf("Exit?", "Are you sure you want to quit?");
        if (result) {
            System.out.println("window will now close");
            window.close();
        }
    }

    public String getScrollValue(ScrollBar scroll) {
        Double scrollValue = scroll.getValue();
        String message;

        if (scrollValue >= 66) {
            message = "good";
        } else if (scrollValue < 66 && scrollValue > 33) {
            message = "decent";
        } else {
            message = "bad";

        }

        return message;
    }

     public ObservableList<TestResults> getResults() {
        ObservableList<TestResults> vidTestResults = FXCollections.observableArrayList();
        vidTestResults.add(new TestResults("example one", 1, "result A", "result B", "result C", "result D", "result E"));
        vidTestResults.add(new TestResults("example two", 2, "result a", "result b", "result c", "result d", "result e"));
        vidTestResults.add(new TestResults("example three", 3, "result 1A", "result 1B", "result 1C", "result 1D", "result 1E"));
        vidTestResults.add(new TestResults("example four", 4, "result 1a", "result 1b", "result 1c", "result 1d", "result 1e"));

        return vidTestResults;
    }
     
    public void addResult() {
        int x = resultTable.getItems().size() + 1;
        TestResults newResults = new TestResults();
        newResults.setTestName(input1.getText());
        newResults.setTestNumber(x);
        newResults.setScreenBrightness("50%");
        newResults.setObservationAngle("N/A");
        newResults.setMonitorResolution("1366 x 768");
        newResults.setScreenSize("15.4");
        newResults.setRating(getScrollValue(sb));
        resultTable.getItems().add(newResults);
        //results relative to the specs of laptop app is created on
        x++;
    }

    public void delResults() {
        ObservableList<TestResults> selectedResults, allResults;
        allResults = resultTable.getItems();
        selectedResults = resultTable.getSelectionModel().getSelectedItems();

        for (TestResults t : selectedResults) {
            allResults.remove(t);
        }

    }

    public void addVideo() {
        file = chooseVideo.showOpenDialog(window);
        if (file != null);
        chooseVideo.setTitle("Select a video file");
        chooseVideo.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("MPEG4", "*.mp4"),
                new FileChooser.ExtensionFilter("FLV", "*.flv"));
        chooseVideo.setInitialDirectory(new File(System.getProperty("user.home")));
    }

}
