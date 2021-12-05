module com.mycompany.finalproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.scripting;

    opens com.mycompany.finalproject to javafx.fxml;
    exports com.mycompany.finalproject;
}
