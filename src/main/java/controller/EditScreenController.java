package controller;

import handler.EditHandler;
import handler.Handler;
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
import base.Main;
import ui.ScreenManager;

public class EditScreenController extends ScreenController {

    private ScreenManager screenManager;
    private EditHandler handler;

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
        handler.addLogMessage(getFxmlRootNodeChildren());
    }

    @FXML
    private void deleteLogMessage(ActionEvent event) {
        handler.deleteLogMessage(getFxmlRootNodeChildren(), event);
    }

    @Override
    protected void setScreenHandler(Handler handler) {
        this.handler = (EditHandler) handler;
    }
}
