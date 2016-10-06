//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.10.06 a las 05:10:53 PM CEST 
//


package Jaxbinding;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pelicula" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Titulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Director" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Genero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FechaLanzamiento" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="Duracion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pelicula"
})
@XmlRootElement(name = "Biblioteca")
public class Biblioteca {

    @XmlElement(name = "Pelicula")
    protected List<Biblioteca.Pelicula> pelicula;

    /**
     * Gets the value of the pelicula property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pelicula property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPelicula().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Biblioteca.Pelicula }
     * 
     * 
     */
    public List<Biblioteca.Pelicula> getPelicula() {
        if (pelicula == null) {
            pelicula = new ArrayList<Biblioteca.Pelicula>();
        }
        return this.pelicula;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Titulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Director" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Genero" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="FechaLanzamiento" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="Duracion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "titulo",
        "director",
        "genero",
        "fechaLanzamiento",
        "duracion"
    })
    public static class Pelicula {

        @XmlElement(name = "Titulo", required = true)
        protected String titulo;
        @XmlElement(name = "Director", required = true)
        protected String director;
        @XmlElement(name = "Genero", required = true)
        protected String genero;
        @XmlElement(name = "FechaLanzamiento", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fechaLanzamiento;
        @XmlElement(name = "Duracion", required = true)
        protected String duracion;

        /**
         * Obtiene el valor de la propiedad titulo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitulo() {
            return titulo;
        }

        /**
         * Define el valor de la propiedad titulo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitulo(String value) {
            this.titulo = value;
        }

        /**
         * Obtiene el valor de la propiedad director.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDirector() {
            return director;
        }

        /**
         * Define el valor de la propiedad director.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDirector(String value) {
            this.director = value;
        }

        /**
         * Obtiene el valor de la propiedad genero.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGenero() {
            return genero;
        }

        /**
         * Define el valor de la propiedad genero.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGenero(String value) {
            this.genero = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaLanzamiento.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaLanzamiento() {
            return fechaLanzamiento;
        }

        /**
         * Define el valor de la propiedad fechaLanzamiento.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaLanzamiento(XMLGregorianCalendar value) {
            this.fechaLanzamiento = value;
        }

        /**
         * Obtiene el valor de la propiedad duracion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuracion() {
            return duracion;
        }

        /**
         * Define el valor de la propiedad duracion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuracion(String value) {
            this.duracion = value;
        }

    }

}
