/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aritmética;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 *
 * @author PC04LAB6
 */
public class AritméticaController implements Initializable {
    
    double num1;
    double num2;
    
    @FXML
    private TextField txtnum1;
    @FXML
    private TextField txtnum2;
    @FXML
    private TextField txtsuma;
    @FXML
    private TextField txtresta;
    @FXML
    private TextField txtmult;
    @FXML
    private TextField txtdiv;
    @FXML
    private TextField txtpot;   
    
    
    @FXML
    private void Ejecutar(ActionEvent event) {
        num1=Double.valueOf(txtnum1.getText());
        num2=Double.valueOf(txtnum2.getText());
        txtsuma.setText(String.valueOf(num1+num2));
        txtresta.setText(String.valueOf(num1-num2));
        txtmult.setText(String.valueOf(num1*num2));
        txtdiv.setText(String.valueOf(num1/num2));
        txtpot.setText(String.valueOf(Math.pow(num1, num2)));
    }
    
    @FXML
    private void Limpiar(ActionEvent event){
        txtnum1.setText(null);
        txtnum2.setText(null);
        txtsuma.setText(null);
        txtresta.setText(null);
        txtmult.setText(null);
        txtdiv.setText(null);
        txtpot.setText(null);
    }
    
    @FXML
    private void Salir(ActionEvent event)
    {
        System.exit(0);
    }
    
    @FXML
    private void Convertidor(ActionEvent event) throws IOException
    {
        Aritmética obj= new Aritmética();
        obj.Abrir();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
