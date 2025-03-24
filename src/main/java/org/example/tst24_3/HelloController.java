package org.example.tst24_3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label infoLabel;
    @FXML
    private ListView<Employee> employeeListView;

    @FXML
    public void initialize() {
        Employee n = new Employee("pes", "1.1.2052", 101.f, "Junior");
        Employee o = new Employee("kocka", "18.8.1252", 50.f, "Senior");
        Employee p = new Employee("jirka", "9.7.1982", 115.f, "Medior");

        employeeListView.getItems().addAll(n, o, p);
    }
    @FXML
    public void onSelectedEmployee (MouseEvent event) {
        // ziskani aktualne oznaceneho uzivatele
        Employee e = employeeListView.getSelectionModel().getSelectedItem();
        if (e != null) {
            if (e.level.equals("Senior")) {
                infoLabel.getStyleClass().set(0, "Senior");
                infoLabel.setText(
                        "Jmeno: " + e.name +
                                "\nDatum nástupu: " + e.dateOfJoiningCompany +
                                "\núvazek: " + e.workPlan +
                                "\núroveň: " + e.level
                );
            }
            if (e.level.equals("Medior")) {
                infoLabel.getStyleClass().set(0, "Medior");
                infoLabel.setText(
                        "Jmeno: " + e.name +
                                "\nDatum nástupu: " + e.dateOfJoiningCompany +
                                "\núvazek: " + e.workPlan +
                                "\núroveň: " + e.level
                );
            }
            if (e.level.equals("Junior")) {
                infoLabel.getStyleClass().set(0, "Junior");
                infoLabel.setText(
                        "Jmeno: " + e.name +
                                "\nDatum nástupu: " + e.dateOfJoiningCompany +
                                "\núvazek: " + e.workPlan +
                                "\núroveň: " + e.level
                );
            }
        } else {
            System.out.println("Value is null, or no employee selected");
        }
    }
    @FXML
    public void removeEmployee () {
        Employee e = employeeListView.getSelectionModel().getSelectedItem();
        if (e != null) {
            employeeListView.getItems().remove(e);
        }
    }

    @FXML
    public void createEmployee() throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("AddNewEmployee.fxml"));

        HBox form = loader.load();
        AddEditEmployeeController controller = loader.getController();
        Stage dialogStage = new Stage();
        dialogStage.setTitle("Create employee");
        dialogStage.initModality(Modality.APPLICATION_MODAL);
        assert form != null;
        dialogStage.setScene(new Scene(form));
        dialogStage.showAndWait();
        Employee newEmployee = controller.getEmployee();
        if (newEmployee != null) {
            employeeListView.getItems().add(newEmployee);
        }
    }

    @FXML
    public void editEmployee() throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("AddNewEmployee.fxml"));

        HBox form = loader.load();
        AddEditEmployeeController controller = loader.getController();
        Stage dialogStage = new Stage();
        dialogStage.setTitle("Edit employee");
        dialogStage.initModality(Modality.APPLICATION_MODAL);
        assert form != null;
        dialogStage.setScene(new Scene(form));
        dialogStage.showAndWait();
        Employee newEmployee = controller.getEmployee();
        if (newEmployee != null) {
            employeeListView.getItems().add(newEmployee);
        }
    }
}