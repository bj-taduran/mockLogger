package controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import base.Main;
import ui.ScreenManager;

public class DefaultScreenController implements ManagedScreen {

    private ScreenManager screenManager;

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
}
