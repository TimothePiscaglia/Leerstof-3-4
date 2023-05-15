module be.odisee.javafxmaven {
    requires javafx.controls;
    requires javafx.fxml;


    opens be.odisee.javafxmaven to javafx.fxml;
    exports be.odisee.javafxmaven;
}