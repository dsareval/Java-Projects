package reproductor;

import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayer;


public class mainReproductor {
    

    public BasicPlayer player;

    public mainReproductor() {
        player = new BasicPlayer();
    }
public void coge(String y){

}
    public void Play() throws Exception {
        player.play();
    }

    public void AbrirFichero(String ruta) throws Exception {
        player.open(new File(ruta));
    }

    public void Pausa() throws Exception {
        player.pause();
    }

    public void Continuar() throws Exception {
        player.resume();
    }

    public void Stop() throws Exception {
        player.stop();
    }
    public void reproducemp3 () throws Exception{
       try {
        mainReproductor   mi_reproductor = new mainReproductor();
            mi_reproductor.AbrirFichero("C:/Big_Blue.mp3");
            mi_reproductor.Play();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public static void main(String args[]) throws Exception{
        Reproductor obj=new Reproductor();
        
     mainReproductor y = new mainReproductor();
     y.AbrirFichero("C:/Big_Blue.mp3");
    }
}
