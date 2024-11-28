module org.example.pproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.pproject to javafx.fxml;
    exports org.example.pproject;
    exports org.example.pproject.Controllers;
    opens org.example.pproject.Controllers to javafx.fxml;
    exports org.example.pproject.Models;
    opens org.example.pproject.Models to javafx.fxml;
    exports org.example.pproject.Dao;
    opens org.example.pproject.Dao to javafx.fxml;
}