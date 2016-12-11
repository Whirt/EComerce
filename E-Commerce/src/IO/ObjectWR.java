package IO;

/**
 * Object Writer Reader
 *
 * Classe che scrive e legge tramite operazioni di serializzazione
 * e deserializazione.
 */

import java.io.FileOutputStream ;
import java.io.FileInputStream ;
import java.io.ObjectOutputStream ;
import java.io.ObjectInputStream ;
import java.io.IOException ;

public class ObjectWR
{
    public static void write(Object obj, String name_file) throws IOException {
        FileOutputStream fos = new FileOutputStream(name_file) ;
        ObjectOutputStream oos = new ObjectOutputStream(fos) ;
        oos.writeObject(obj) ;
        oos.close() ;
    }

    public static Object read(String name_file)
    throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(name_file) ;
        ObjectInputStream ios = new ObjectInputStream(fis) ;
        Object obj = (Object)ios.readObject() ;
        ios.close() ;
        return obj ;
    }
}