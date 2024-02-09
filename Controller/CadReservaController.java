package br.edu.ifba.saj.fwads.controller;


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
        txModelo.setText("");
        txMarca.setText("");
        txPassageiro.setText("");
        txAno.setText("");
    }

}
