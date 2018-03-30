/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejer2css;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 *
 * @author lab6
 */
public class FXMLDocumentController implements Initializable {
    
    private Double num1;
    private Double num2;
    @FXML
    private TextField textnum1;
    @FXML
    private TextField textnum2;
    @FXML
    private TextField textsuma;
    @FXML
    private TextField textresta;
    @FXML
    private TextField textmultiplica;
    @FXML
    private TextField textdivide;
    @FXML
    private TextField textpotencia;

    @FXML
    private void ejecutar(ActionEvent event) {
        
        num1=Double.valueOf(textnum1.getText());
        num2=Double.valueOf(textnum2.getText());
        
        textsuma.setText(String.valueOf(num1+num2));
        textresta.setText(String.valueOf(num1-num2));
        textmultiplica.setText(String.valueOf(num1*num2));
        textdivide.setText(String.valueOf(num1/num2));
        textpotencia.setText(String.valueOf(Math.pow(num1,num2)));
        
    }
    @FXML
    private void limpiar (ActionEvent event) {
        textnum1.setText(null);
        textnum2.setText(null);
        textsuma.setText(null);
        textresta.setText(null);
        textmultiplica.setText(null);
        textdivide.setText(null);
        textpotencia.setText(null);
    }

    @FXML
    private void salir (ActionEvent event) {
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
