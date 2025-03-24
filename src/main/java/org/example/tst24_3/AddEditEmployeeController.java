package org.example.tst24_3;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import java.time.LocalDate;

public class AddEditEmployeeController {
    @FXML
    private TextField name;
    @FXML
    private DatePicker dateOfJoiningCompany;
    @FXML
    private Spinner<Double> workPlan;
    @FXML
    private TextField level;

    @FXML
    private void initialize() {
        SpinnerValueFactory<Double> valueFactory = new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 100, 1);
        workPlan.setValueFactory(valueFactory);
    }

    public Employee getEmployee() {
        if (name == null || dateOfJoiningCompany == null || workPlan == null || level == null) {
            return null;
        }

        return new Employee(
                name.getText(),
                dateOfJoiningCompany.toString(),
                Float.parseFloat(
                        workPlan.getValue().toString()
                ),
                level.toString()
        );
    }

}
