

package jaxbtestclass;

// @author: Oriol Iglesias

import Jaxbinding.Biblioteca;
import Jaxbinding.Biblioteca.Pelicula;
import com.sun.org.apache.xml.internal.resolver.Catalog;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


public class JaxbTestClass {

    
    public static void main(String[] args) {
       
       print();
       saveFile();
    }

    private static void print(){
        LoadCsv lcsv= new LoadCsv("lista.csv");
            String[] list;
        do{
           list= lcsv.cargarDatos();
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+ " - ");
        }
        System.out.println("");
       }while(list.length!=0);
    }
    
    private static void saveFile(){
        File f= new File("result.xml");
        BindXml bxml= new BindXml();
        Biblioteca bib= new Biblioteca();
        bib= saveData(bib);
        bxml.objectToXml(bib, f);
    }
    
    private static Biblioteca saveData(Biblioteca bib){
        LoadCsv lcsv= new LoadCsv("lista.csv");
            String[] list;
            
            list= lcsv.cargarDatos();
        for(int i=0;list.length!=0;i++){
            bib.getPelicula().add(new Pelicula());
           bib.getPelicula().get(i).setTitulo(list[0]);
           bib.getPelicula().get(i).setDirector(list[1]);
           bib.getPelicula().get(i).setGenero(list[2]);
           bib.getPelicula().get(i).setFechaLanzamiento(parseData(list[3]));
           bib.getPelicula().get(i).setDuracion(list[4]);
           list= lcsv.cargarDatos();
       }
        return bib;
    }
    
    private static XMLGregorianCalendar parseData(String date){
        try {
        XMLGregorianCalendar xmlCalender=null;
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(date));
            xmlCalender = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
            return xmlCalender;
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(JaxbTestClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(JaxbTestClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    return null;
    }
    
}
