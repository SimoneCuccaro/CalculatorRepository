module com.example.calculatorexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculatorexample to javafx.fxml;
    exports com.example.calculatorexample;
}