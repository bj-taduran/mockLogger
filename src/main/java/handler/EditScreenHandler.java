package handler;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class EditScreenHandler implements EditHandler {

    @Override
    public void addLogMessage(ObservableList<Node> rootNodeChildren) {
        GridPane gridPane = (GridPane) rootNodeChildren.get(1);
        ObservableList<Node> logMessages = gridPane.getChildren();

        HBox hbox = new HBox();
        TextField message = new TextField();
        message.setPromptText("LOG MESSAGE");
        TextField rateOfShowingUp = new TextField();
        rateOfShowingUp.setPromptText("%");
        Button button = new Button("-");
        button.onActionProperty().setValue(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) { deleteLogMessage(rootNodeChildren, event); }
        });

        hbox.getChildren().addAll(message, rateOfShowingUp, button);

        gridPane.add(hbox, 0, logMessages.size());
    }

    @Override
    public void deleteLogMessage(ObservableList<Node> rootNodeChildren, ActionEvent event) {
        GridPane gridPane = (GridPane) rootNodeChildren.get(1);
        ObservableList<Node> logMessages = gridPane.getChildren();

        logMessages.remove(((Node) event.getSource()).getParent());
    }
}
