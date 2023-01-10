module fr.tomoetek.exosurchoix {
    requires javafx.controls;
    requires javafx.fxml;


    exports fr.tomoetek.exosurchoix;
    exports fr.tomoetek.exosurchoix.gui;
    opens fr.tomoetek.exosurchoix.gui to javafx.fxml;
}