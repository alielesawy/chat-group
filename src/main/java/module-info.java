module org {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires slf4j.simple;
    requires javafx.media;
    requires slf4j.api;
    requires annotations;
    requires java.desktop;


    opens org.client.login to javafx.fxml;
    exports org.client.login;

    opens org.client.chatscreen to javafx.fxml;
    exports org.client.chatscreen;


}