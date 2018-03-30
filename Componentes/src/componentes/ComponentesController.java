/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Lore
 */
public class ComponentesController implements Initializable {
        
    @FXML
    private ListView listado;    
    
    @FXML
    private Label opcion;
    
    
    @FXML
    private void opcionSeleccionada(ActionEvent event) 
    {
        if(listado.getSelectionModel().getSelectedItem().equals("opción 1"))
        {
            opcion.setText("Ha seleccionado la opción 1");
        }
        
        if(listado.getSelectionModel().getSelectedItem().equals("opción 2"))
        {
            opcion.setText("Ha seleccionado la opción 2");
        }
        
        if(listado.getSelectionModel().getSelectedItem().equals("opción 3"))
        {
            opcion.setText("Ha seleccionado la opción 3");
        }
        
        if(listado.getSelectionModel().getSelectedItem().equals("opción 4"))
        {
            opcion.setText("Ha seleccionado la opción 4");
        }
        
        if(listado.getSelectionModel().getSelectedItem().equals("opción 5"))
        {
            opcion.setText("Ha seleccionado la opción 5");
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {        
       listado.getItems().addAll
       (
               "opción 1",
               "opción 2",
               "opción 3",
               "opción 4",
               "opción 5"
       );
       opcion.setText(null);

    }    
    
}
