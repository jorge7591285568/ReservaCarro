package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.App;

public class MasterController {

    @FXML
    private BorderPane masterPane;

    @FXML
    private VBox menu;

    @FXML
    private Label userModelo;

    @FXML
    private Circle userPicture;

    @FXML
    void logOff(MouseEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION, "Deseja realmente sair??", ButtonType.YES, ButtonType.NO);
        alert.showAndWait()
                .filter(response -> response == ButtonType.YES)
                .ifPresent(response -> {
                    App.setRoot("controller/Login.fxml");
                });
    }

    @FXML
    void showHome(ActionEvent event) {
        limparBotoes(event.getSource());
        masterPane.setCenter(new Pane());

    }

    @FXML
    void showReservas(ActionEvent event) {
        limparBotoes(event.getSource());
        masterPane.setCenter(new Pane());
    }

    private void limparBotoes(Object source) {
        menu.getChildren().forEach((node) -> {
            if (node instanceof Button btn) {
                btn.getStyleClass().clear();
                btn.getStyleClass().add("btn-menu");
            }
        }

        );
        if (source instanceof Button btn) {
            btn.getStyleClass().clear();
            btn.getStyleClass().add("btn-menu-selected");
        }
    }

    @FXML
    void showModelo(ActionEvent event) {
        limparBotoes(event.getSource());
        showFXMLFile("CadModelor.fxml");
    }

    @FXML
    void showCarros(ActionEvent event) {
        limparBotoes(event.getSource());
        showFXMLFile("CadCarro.fxml");
    }

    private void showFXMLFile(String resourceName) {
        try {
            Pane fxmlCarregado = FXMLLoader.load(getClass().getResource(resourceName));
            masterPane.setCenter(fxmlCarregado);
        } catch (Exception e) {
            new Alert(AlertType.ERROR, "Erro ao carregar o arquivo " + resourceName).showAndWait();
            e.printStackTrace();
        }
    }
}