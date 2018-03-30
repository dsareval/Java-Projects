/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanaejemplo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 *
 * @author Lore
 */
public class VentanaEjemploController implements Initializable {
    
    VentanaEjemplo obj= new VentanaEjemplo();
    @FXML
    private Label label;
    @FXML
    private ImageView imagen;
    
    @FXML
    private void handleButtonAction(ActionEvent event) 
    {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void abrir(ActionEvent event) throws Exception
    {
        imagen.setVisible(true);
        label.setText("imagen");
        obj.abrir();
                
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
