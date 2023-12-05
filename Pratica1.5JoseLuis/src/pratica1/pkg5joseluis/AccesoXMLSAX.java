package pratica1.pkg5joseluis;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class AccesoXMLSAX {
    SAXParser parser;
    
    public int parsearXMLconLibroSAXhandler(File f){
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            parser = factory.newSAXParser();
            AccedeLibro sh = new AccedeLibro();
            parser.parse(f, sh);
            return 0;
        } catch (Exception e){
            e.printStackTrace();
            return -1;
            /*Cada vez que lea una etiqueta <Libro> creara un evento de inicio. Lo tiene que hacer
              con SAXParserFactory.*/
        }
    }
    public int parsearXMLconTitulosSAXhandler(File f){
        try{
            SAXParserFactory factory=SAXParserFactory.newInstance();
            parser = factory.newSAXParser();
            TitulosSAXhandler sh = new TitulosSAXhandler();
            parser.parse(f, sh);
            return 0;
        } catch (Exception e){
            e.printStackTrace();
            return -1;
            /*Es lo mismo que la anteiror funcion pero en vez de usar la etiqueta de Libro utiliza la de Titulo.*/
        }
        
    }
}
