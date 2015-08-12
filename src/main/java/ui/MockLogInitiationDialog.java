package ui;

public class MockLogInitiationDialog {

//    public MockLogInitiationDialog(String title, String headerText) {
//
//        Dialog<Pair<String, List<String>>> dialog = new Dialog<>();
//
//        dialog.setTitle(title);
//        dialog.setHeaderText(headerText);
//
//        ButtonType addButtonType = new ButtonType("Add", ButtonBar.ButtonData.OK_DONE);
//        dialog.getDialogPane().getButtonTypes().addAll(addButtonType, ButtonType.CANCEL);
//
//        GridPane grid = new GridPane();
//        grid.setHgap(10);
//        grid.setVgap(10);
//        grid.setPadding(new Insets(20, 150, 10, 10));
//
//        TextField projectName = new TextField();
//        projectName.setPromptText("Project Name");
//
//        List<TextField> textFields = new ArrayList<>();
//
//        TextField errorLevel = new TextField();
//        errorLevel.setPromptText("Error Level");
//        textFields.add(errorLevel);
//
//        TextField warningLevel = new TextField();
//        warningLevel.setPromptText("Warning Level");
//        textFields.add(warningLevel);
//
//        TextField infoLevel = new TextField();
//        infoLevel.setPromptText("Information Level");
//        textFields.add(infoLevel);
//
//        TextField debugLevel = new TextField();
//        debugLevel.setPromptText("Debug Level");
//        textFields.add(debugLevel);
//
//        for(TextField field: textFields) {
//            Label label = new Label("Log Level");
//            label.setTextFill(Paint.valueOf("blue"));
//            grid.add(label, 0, 1);
//
//            Button rmLogLevel = new Button("-");
//            grid.add(rmLogLevel, 0, 2);
//        }
//
//        Button addLogLevel = new Button("+");
//        grid.add(addLogLevel, 0, 1);
//
//        Node addButton = dialog.getDialogPane().lookupButton(addButtonType);
//        addButton.setDisable(true);
//
//        projectName.textProperty().addListener((observable, oldValue, newValue) -> {
//            addButton.setDisable(newValue.trim().isEmpty());
//        });
//
//        dialog.getDialogPane().setContent(grid);
//
//        Platform.runLater(() -> projectName.requestFocus());
//
//        dialog.setResultConverter(dialogButton -> {
//            if(dialogButton == addButtonType) {
//                List<String> levels = new ArrayList<String>();
//                levels.add(errorLevel.getText());
//                levels.add(warningLevel.getText());
//                levels.add(infoLevel.getText());
//                levels.add(debugLevel.getText());
//                return new Pair<String, List<String>>(projectName.getText(), levels);
//            }
//            return null;
//        });
//
//        Optional<Pair<String, List<String>>> result = dialog.showAndWait();
//    }

}
