package org.example.tst24_3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class AddEditEmployeeController {
    @FXML
    protected void openNewWindow() throws IOException {
        FXMLLoader root = FXMLLoader.load(getClass().getResource("AddNewEmployee.fxml"));
        VBox form = root.load();

        AddEditEmployeeController controller = root.getController();

        Stage stage = new Stage();
        stage.setTitle("Add/edit Employee");
        stage.setScene(new Scene(form));
        stage.showAndWait();
    }
}
