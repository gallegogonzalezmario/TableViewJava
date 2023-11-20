module es.ieslosmontecillos.tableviewjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.tableviewjava to javafx.fxml;
    exports es.ieslosmontecillos.tableviewjava;
}