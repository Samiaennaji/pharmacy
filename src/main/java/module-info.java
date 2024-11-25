module org.example.pproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.pproject to javafx.fxml;
    exports org.example.pproject;
}