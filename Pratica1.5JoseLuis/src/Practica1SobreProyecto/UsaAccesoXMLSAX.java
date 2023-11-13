
package Practica1SobreProyecto;

import java.io.File;

public class UsaAccesoXMLSAX {

    public static void main(String[] args) {
        File f = new File ("books.xml");
        AccesoXMLSAX a = new Practica1SobreProyecto.AccesoXMLSAX();
        a.parsearXMLconLibrosSAXhandler(f);
    }
}
