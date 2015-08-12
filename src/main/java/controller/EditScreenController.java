package main.java.controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import main.java.Main;
import main.java.ui.ScreenManager;

public class EditScreenController implements ManagedScreen {

    ScreenManager screenManager;

    @Override
    public void setScreenManager(ScreenManager screenManager) {
        this.screenManager = screenManager;
    }

    @Override
    public ObservableList<Node> getFxmlRootNodeChildren() {
        VBox root = (VBox) screenManager.getScreen(Main.editPage);
        return root.getChildren();
    }

    @FXML
    private void goToDefaultScreen(ActionEvent event) {
        screenManager.setScreen(Main.defaultPage);
    }

    @FXML
    private void addLogMessage(ActionEvent event) {
        VBox node = (VBox) screenManager.getScreen(Main.editPage);
        ObservableList<Node> list = node.getChildren();

        GridPane gridPane = (GridPane) list.get(1);
        ObservableList<Node> logMessages = gridPane.getChildren();

        HBox hbox = new HBox();
        TextField message = new TextField();
        message.setPromptText("LOG MESSAGE");
        TextField rateOfShowingUp = new TextField();
        rateOfShowingUp.setPromptText("%");
        Button button = new Button("-");
        button.onActionProperty().setValue(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                deleteLogMessage(event);
            }
        });

        hbox.getChildren().addAll(message, rateOfShowingUp, button);

        gridPane.add(hbox, 0, logMessages.size());
    }

    @FXML
    private void deleteLogMessage(ActionEvent event) {
        ObservableList<Node> list = getFxmlRootNodeChildren();

        GridPane gridPane = (GridPane) list.get(1);
        ObservableList<Node> logMessages = gridPane.getChildren();

        logMessages.remove(((Node) event.getSource()).getParent());
    }
}
