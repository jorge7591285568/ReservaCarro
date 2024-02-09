package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Biblioteca;
import br.edu.ifba.saj.fwads.model.Autor;
import br.edu.ifba.saj.fwads.model.Livro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.util.StringConverter;

public class CadCarroController {
    @FXML
    private TextField txModelo;
    @FXML
    private TextField txMarca;
    @FXML
    private TextField txPassageiro;
    @FXML
    private TextField txAno;

    @FXML
    private ChoiceBox<Carro> slCarro;

    @FXML
    void salvarCarro(ActionEvent event) {
        Carro novoCarro = new Livro(txModelo.getText(),
                    txSubMarca.getText(), 
                    txPassageiro.getText(),
	        txAno.getText(),	
                    slCarro.getSelectionModel().getSelectedItem());
        new Alert(AlertType.INFORMATION, 
        "Cadastrando Carro(Fake):"+novoCarro.toString()).showAndWait();
        limparTela();
      

    }

    @FXML 
    private void initialize() {
        slCarro.setConverter(new StringConverter<Carro>() {
            @Override
            public String toString(Carro obj) {
                if (obj != null) {
                    return obj.getModelo() + ":" + obj.getMarca();":”+ obj.getPassageiro();”:" + obj.getAno();
                }
                return "";
            }

            @Override
            public Autor fromString(String stringAutor) {
                return Biblioteca.listaAutores
                    .stream()
                    .filter(autor -> stringAutor.equals(autor.getNome() + ":" + autor.getEmail()))
                    .findAny()
                    .orElse(null);                
            }
        });
        
        carregarListaAutores();
    }

    @FXML
    private void limparTela() {
        txTitulo.setText("");
        txSubTitulo.setText("");
        txISBN.setText("");
        //Todo REVER
        slAutor.setSelectionModel(null);
    }

    private void carregarListaAutores() {
        slAutor.setItems(Biblioteca.listaAutores);
    }

}
