package main.java.controller;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import main.java.ui.ScreenManager;

/**
 * Created by bujo on 7/18/15.
 */
public interface ManagedScreen {

    public void setScreenManager(ScreenManager screenManager);

    public ObservableList<Node> getFxmlRootNodeChildren();
}
