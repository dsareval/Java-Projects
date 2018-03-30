/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aritmética;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author PC02LAB6
 */
public class ConvertidorController implements Initializable {

    int dec;
    int bin;
    int i;
    int aux;
    
    @FXML
    private TextField txtNumDec;
    @FXML
    private TextField txtNumBin;
    
    @FXML
    private void Convertir(ActionEvent event)
    {       
        txtNumBin.setText("");
        dec=Integer.valueOf(txtNumDec.getText());
        bin=0;
        i=0;
        while(dec>=2)
        {
            aux=dec%2;
            bin=(int) (bin+(aux * Math.pow(10, i)));
            dec=dec/2;
            i++;
        }
        bin=(int) (bin+(dec * Math.pow(10, i)));
        txtNumBin.setText(String.valueOf(bin));
    }
    
     @FXML
    private void Limpiar(ActionEvent event){
        txtNumDec.setText(null);
        txtNumBin.setText(null);
    }
    
    @FXML
    private void Salir(ActionEvent event)
    {
        System.exit(0);
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
