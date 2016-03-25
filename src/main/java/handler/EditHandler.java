package handler;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;

/**
 * Created by bujo on 8/15/15.
 */
public interface EditHandler extends Handler {
    public void addLogMessage(ObservableList<Node> rootNodeChildren);

    public void deleteLogMessage(ObservableList<Node> rootNodeChildren, ActionEvent event);
}
