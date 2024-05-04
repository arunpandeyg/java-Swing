module org.arun.javafxmedia {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens org.arun.javafxmedia to javafx.fxml;
    exports org.arun.javafxmedia;
}