package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Biblioteca;
import br.edu.ifba.saj.fwads.model.Autor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class CadReservaController {

    @FXML
    private TextField txModelo;
    @FXML
    private TextField txMarca;
    @FXML
    private TextField txPassageiro;
    @FXML
    private TextField txAno;

    @FXML
    private void salvarReserva() {
        Reserva novaReserva = new Reserva(txModelo.getText(),
                    txMarca.getText(), 
                    txPassageiro.getText()
                    txAno.getText());
        new Alert(AlertType.INFORMATION, 
        "Cadastrando Reserva:"+novaReserva.getModelo()).showAndWait();
        Estoque.listaCarros.add(novaReserva);
        limparTela();
    }
    @FXML
    private void limparTela() {
        txNome.setText("");
        txEmail.setText("");
        txCPF.setText("");
    }

}
