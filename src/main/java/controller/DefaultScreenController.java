package controller;

import handler.DefaultHandler;
import handler.Handler;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import base.Main;
import ui.ScreenManager;

public class DefaultScreenController extends ScreenController {

    private ScreenManager screenManager;
    private DefaultHandler handler;

    @Override
    public void setScreenManager(ScreenManager screenManager) {
        this.screenManager = screenManager;
    }

    @Override
    public ObservableList<Node> getFxmlRootNodeChildren() {
        return null;
    }

    @FXML
    private void goToEditScreen(final ActionEvent event) {
        screenManager.setScreen(Main.editPage);
    }

    @Override
    protected void setScreenHandler(Handler handler) {
        this.handler = (DefaultHandler) handler;
    }
}
