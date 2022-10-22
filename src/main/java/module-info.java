module com.example.lessonnn2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lessonnn2 to javafx.fxml;
    exports com.example.lessonnn2;
}