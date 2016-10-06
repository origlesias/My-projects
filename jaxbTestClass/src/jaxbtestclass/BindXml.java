

package jaxbtestclass;

// @author: Oriol Iglesias

import Jaxbinding.Biblioteca;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class BindXml {
public Biblioteca XmlToObject(File f){
    try{
        JAXBContext jaxbcontext= JAXBContext.newInstance(Biblioteca.class);
        
        
        Unmarshaller jaxbunmarshaller= jaxbcontext.createUnmarshaller();
        
        return (Biblioteca) jaxbunmarshaller.unmarshal(f);
    }catch(JAXBException e){
        e.printStackTrace();
        return null;
    }
}

public void objectToXml(Biblioteca cds, File rf){
    try{
        JAXBContext jaxbcontext= JAXBContext.newInstance(Biblioteca.class);
        Marshaller jaxbmarshaller= jaxbcontext.createMarshaller();
        jaxbmarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbmarshaller.marshal(cds,rf);
    }catch(JAXBException e){
        e.printStackTrace();
    }
}



}
