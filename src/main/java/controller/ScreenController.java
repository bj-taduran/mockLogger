package controller;

import handler.DefaultScreenHandler;
import handler.EditScreenHandler;
import handler.Handler;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import ui.ScreenManager;

public abstract class ScreenController {

    public void setScreenHandler(ScreenController screen) {
        if (screen instanceof DefaultScreenController) {
            setScreenHandler(new DefaultScreenHandler());
        } else if (screen instanceof EditScreenController) {
            setScreenHandler(new EditScreenHandler());
        }
    }

    protected abstract void setScreenHandler(Handler handler);

    public abstract void setScreenManager(ScreenManager screenManager);

    public abstract ObservableList<Node> getFxmlRootNodeChildren();
}
