module com.banking_concurrency {
    requires javafx.controls;
    requires javafx.fxml;


    opens com to javafx.fxml;
    exports com;
}