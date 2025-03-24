package org.example.tst24_3;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
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
        }
    }
    @FXML
    public void removeEmployee () {
        Employee e = employeeListView.getSelectionModel().getSelectedItem();
        if (e != null) {
            employeeListView.getItems().remove(e);
        }
    }

}