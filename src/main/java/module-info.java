module org.update4j.demo.bootstrap {
    requires transitive org.update4j;
    requires transitive javafx.fxml;
    requires transitive javafx.controls;
    exports org.update4j.demo.bootstrap;
    exports icons;
    exports font.roboto;
    opens icons;
    opens font.roboto;
    opens org.update4j.demo.bootstrap;
}
