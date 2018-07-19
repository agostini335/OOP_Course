import java.util.ArrayList;
import java.util.List;

public class Launcher {
    public static void main(String[] args) {
        //output handler
        OutputHandler.stampa("ciao") ;
        OutputHandler.stampa("ciao2",10);
        List l=new ArrayList();
        // scorre tutti i valori di Colors
        for(Colors c: Colors.values()){
            OutputHandler.stampa(c.toString());
        }
    }
}
