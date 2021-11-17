module di.esteban.tasca4animacions {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;

    opens di.esteban.tasca4animacions to javafx.fxml;
    exports di.esteban.tasca4animacions;
}