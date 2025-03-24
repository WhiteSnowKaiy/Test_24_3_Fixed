module org.example.tst24_3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.tst24_3 to javafx.fxml;
    exports org.example.tst24_3;
}