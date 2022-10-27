module com.example.kombinasyon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kombinasyon to javafx.fxml;
    exports com.example.kombinasyon;
}