module me.tormented.funkin {
    requires javafx.controls;
    requires javafx.fxml;


    opens me.tormented.funkin to javafx.fxml;
    exports me.tormented.funkin;
}