package vea;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class TestResultsTable {

    TableColumn<TestResults, String> nameColumn = new TableColumn<>("Test Name");
    TableColumn<TestResults, Integer> numberColumn = new TableColumn<>("Test no.");
    TableColumn<TestResults, String> result1 = new TableColumn<>("result1");
    TableColumn<TestResults, String> result2 = new TableColumn<>("result2");
    TableColumn<TestResults, String> result3 = new TableColumn<>("result3");
    TableColumn<TestResults, String> result4 = new TableColumn<>("result4");
    
    
}
