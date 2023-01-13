module com.ezen.letter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ezen.letter to javafx.fxml;
    exports com.ezen.letter;
}