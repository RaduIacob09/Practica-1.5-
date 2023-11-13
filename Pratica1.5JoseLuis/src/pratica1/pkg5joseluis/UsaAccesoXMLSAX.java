package pratica1.pkg5joseluis;

import java.io.File;

public class UsaAccesoXMLSAX {
    public static void main(String[] args){
        File f = new File ("Libro.xml");
        AccesoXMLSAX a = new AccesoXMLSAX();
        a.parsearXMLconLibroSAXhandler(f);
        //a.parsearXMLconTitulosSAXhandler(f);
    }
}
