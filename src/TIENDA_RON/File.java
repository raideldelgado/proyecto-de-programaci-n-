package TIENDA_RON;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class File {
    public void escribirCervezas(){
        try {
            FileOutputStream archivo = new FileOutputStream("cervezas.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            
            escritura.writeObject(GUI_PRINCIPAL.cervezas);
            escritura.close();
        } catch (FileNotFoundException ex) {
            System.err.println("El error es "+ex);
        } catch (IOException ex) {
            System.err.println("El error es "+ex);
        }
    }
    
    public void escribirLicores(){
        try {
            FileOutputStream archivo = new FileOutputStream("licores.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            
            escritura.writeObject(GUI_PRINCIPAL.licores);
            escritura.close();
        } catch (FileNotFoundException ex) {
            System.err.println("El error es "+ex);
        } catch (IOException ex) {
            System.err.println("El error es "+ex);
        }
    }
    
    public void escribirRones(){
        try {
            FileOutputStream archivo = new FileOutputStream("rones.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            
            escritura.writeObject(GUI_PRINCIPAL.rones);
            escritura.close();
        } catch (FileNotFoundException ex) {
            System.err.println("El error es "+ex);
        } catch (IOException ex) {
            System.err.println("El error es "+ex);
        }
    }
    
    public void leerCervezas(){
        try {
            FileInputStream archivo = new FileInputStream("cervezas.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            
            while(true){
                GUI_PRINCIPAL.cervezas = (ArrayList<CERVEZA>) lectura.readObject();
            }
            
        } catch(EOFException ex){
            System.err.println("El error es "+ex);
        } catch (FileNotFoundException ex) {
            System.err.println("El error es "+ex);
        } catch (IOException ex) {
            System.err.println("El error es "+ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("El error es "+ex);
        }
    }
    
    public void leerLicores(){
        try {
            FileInputStream archivo = new FileInputStream("licores.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            
            while(true){
                GUI_PRINCIPAL.licores = (ArrayList<LICOR>) lectura.readObject();
            }
            
        } catch(EOFException ex){
            System.err.println("El error es "+ex);
        } catch (FileNotFoundException ex) {
            System.err.println("El error es "+ex);
        } catch (IOException ex) {
            System.err.println("El error es "+ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("El error es "+ex);
        }
    }
    
    public void leerRones(){
        try {
            FileInputStream archivo = new FileInputStream("rones.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            
            while(true){
                GUI_PRINCIPAL.rones = (ArrayList<RON>) lectura.readObject();
            }
            
        } catch(EOFException ex){
            System.err.println("El error es "+ex);
        } catch (FileNotFoundException ex) {
            System.err.println("El error es "+ex);
        } catch (IOException ex) {
            System.err.println("El error es "+ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("El error es "+ex);
        }
    }
}
