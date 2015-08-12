package main.java;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.java.ui.ScreenManager;

public class Main extends Application {

    public static String defaultPage = "default";
    public static String defaultPagePath = "../../resources/default.fxml";
    public static String editPage = "edit";
    public static String editPagePath = "../../resources/edit.fxml";

    @Override
    public void start(Stage stage) throws Exception {
        ScreenManager mainContainer = new ScreenManager();

        mainContainer.loadScreen(Main.defaultPage, Main.defaultPagePath);
        mainContainer.loadScreen(Main.editPage, Main.editPagePath);

        mainContainer.setScreen(Main.defaultPage);
        mainContainer.setPrefHeight(450);
        mainContainer.setPrefWidth(350);

        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String... args) { launch(args); }
}
