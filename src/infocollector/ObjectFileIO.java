/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infocollector;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mattis Andersson
 * used to save and read objects to files
 */
public class ObjectFileIO implements Serializable{
    private String filename;
    
    
    // construktor
    public ObjectFileIO(String fileName){
	this.filename = fileName;
    }
    
    
    /*
     * saves the objekt
     */
    public void saveFiles(Object object) {

	try {
	    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
	    out.writeObject(object);
            out.close();
	    // System.out.println("Map saved");
	} catch (FileNotFoundException e) {
	    System.out.println("File Not Found");
	} catch (IOException a) {
	    System.out.println("Ioexception in save");
            a.printStackTrace();
	} 
    }

    
    /*
     * reads the Object from the file
     */
    public Object readFile() {

	Object object;
	try {
	    ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
	    object = in.readObject();
	    // System.out.println("file read!");
            in.close();
	    return object;

	} catch (FileNotFoundException e) {
	    System.out.println("File Not Found");
	    return null;
	} catch (IOException a) {
	    System.out.println("empty file");
	} catch (ClassNotFoundException b) {
	    System.out.println("ClassNotFoundException");
	}
	return null;
    }

}
