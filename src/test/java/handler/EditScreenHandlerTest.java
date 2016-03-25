package handler;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import mockit.integration.junit4.JMockit;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;


@RunWith(JMockit.class)
public class EditScreenHandlerTest {

    @Test
    public void testAddLogMessageSuccess() {
        ObservableList<Node> rootNodeChildren = (new VBox()).getChildren();

        TextField pseudoTextField = new TextField();
        rootNodeChildren.add(pseudoTextField);

        GridPane gridPane = new GridPane();
        int originalSize = gridPane.getChildren().size();
        rootNodeChildren.add(gridPane);

        EditHandler handler = new EditScreenHandler();
        handler.addLogMessage(rootNodeChildren);
        int newSize = gridPane.getChildren().size();

        assertEquals(originalSize + 1, newSize);
    }

}
