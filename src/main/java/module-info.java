module com.banking_concurrency {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.banking_concurrency to javafx.fxml;
    exports com.banking_concurrency;
}