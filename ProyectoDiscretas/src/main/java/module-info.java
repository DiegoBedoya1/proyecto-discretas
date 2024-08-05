module com.pooespol.proyectodiscretas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.pooespol.proyectodiscretas to javafx.fxml;
    exports com.pooespol.proyectodiscretas;
}
