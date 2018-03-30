/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author LABORATORIO
 */
import java.io.File;
import java.io.PrintStream;
import java.util.Map;
import javazoom.jlgui.basicplayer.*;

public class Player implements BasicPlayerListener {

    private PrintStream out = null;//Stream para el Debbugging(println)...
    
    BasicPlayer player = new BasicPlayer();//Instancia de BasicPlayer

    public Player() {//Constructor de la clase
        player.addBasicPlayerListener(this);

        out = System.out;

    }
    
    BasicController control = (BasicController) player;//Controlador para player
    
    
    //Metodos sobreescritos:

    public void opened(Object stream, Map properties) {
    }

    public void progress(int bytesread, long microseconds, byte[] pcmdata, Map properties) {
      
        
    }

    public void stateUpdated(BasicPlayerEvent event) {
       
    }

    public void setController(BasicController controller) {
    }

    public void display(String msg) {
        if (out != null) {
            out.println(msg);
        }
    }
} 
