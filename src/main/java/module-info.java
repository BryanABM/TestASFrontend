module com.example.testasfrontend {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testasfrontend to javafx.fxml;
    exports com.example.testasfrontend;
}