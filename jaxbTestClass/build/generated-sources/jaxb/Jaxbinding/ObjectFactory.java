//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.10.06 a las 05:10:53 PM CEST 
//


package Jaxbinding;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Jaxbinding package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Jaxbinding
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Biblioteca }
     * 
     */
    public Biblioteca createBiblioteca() {
        return new Biblioteca();
    }

    /**
     * Create an instance of {@link Biblioteca.Pelicula }
     * 
     */
    public Biblioteca.Pelicula createBibliotecaPelicula() {
        return new Biblioteca.Pelicula();
    }

}
