
package Practica1SobreProyecto;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class AccedeBook extends DefaultHandler {

    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        if(qName.equals("book")){
            System.out.println("Su ID es: "+atts.getValue(atts.getQName(0)));
        }else if(qName.equals("author")){
            System.out.print("\n"+"El autor es: ");
        }else if(qName.equals("title")){
            System.out.print("El titulo es: ");
        }else if(qName.equals("genre")){
            System.out.print("Su genero es: ");
        }else if(qName.equals("price")){
            System.out.print("Su precio es: ");
        }else if(qName.equals("publish_date")){
            System.out.print("La fecha de publicacion es: ");
        }else if(qName.equals("description")){
            System.out.print("Descripcion: ");
        }
    }
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equals("book")){
            System.out.println("\n---------------------");
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String car=new String(ch, start,length);
        car=car.replaceAll("\t", "");
        car=car.replaceAll("\n", "");
        System.out.println(car);
    }
}
