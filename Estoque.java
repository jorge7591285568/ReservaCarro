package br.edu.ifba.saj.fwads;
import br.edu.ifba.saj.fwads.model.Autor;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Estoque {
    public static ObservableList<Carros> carros = FXCollections.observableArrayList();
    static{
        //CarroseEstoque.add(new Carro("modelo = Passeio","Marca = Volks”,"Passageiros = 4",”Ano = 2023”));
    }    
}
