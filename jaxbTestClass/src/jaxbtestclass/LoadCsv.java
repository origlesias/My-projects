

package jaxbtestclass;

// @author: Oriol Iglesias

import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mg.Oig;


public class LoadCsv {
    Oig aux= new Oig();
    CsvReader fichero;

    public LoadCsv(String ruta) {
        try {
            fichero = new CsvReader(ruta);
            fichero.readRecord();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoadCsv.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoadCsv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public String[] cargarDatos(){
        
        try {
            if(fichero.readRecord()){
                return fichero.getValues();
            }else{
                return new String[0];
            }
            
        } catch (IOException ex) {
            Logger.getLogger(LoadCsv.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
