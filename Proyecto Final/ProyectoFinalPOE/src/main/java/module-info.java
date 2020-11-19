module App {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires java.base;
    requires java.sql;
    requires jasperreports;
    requires java.desktop;

    opens controller to javafx.fxml;
    exports controller;
    exports model;
}