package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.App;

public class LoginController {

    @FXML // fx:id="txSenha"
    private PasswordField txSenha; // Value injected by FXMLLoader

    @FXML // fx:id="txCliente"
    private TextField txCliente; // Value injected by FXMLLoader

    @FXML
    void entrar(ActionEvent event) {
        if (txCliente.getText().equals("admin") && txSenha.getText().equals("admin")) {
            new Alert(AlertType.INFORMATION, "Cliente e senha corretos").showAndWait();
            App.setRoot("controller/Master.fxml");
        } else {
            new Alert(AlertType.ERROR, "Cliente ou senha inválidos").show();
        }
    }

    @FXML
    void limparCampos(ActionEvent event) {
        txCliente.setText("");
        txSenha.setText("");
    }

}