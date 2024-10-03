package Ventana;

import java.io.*;

public class Archivo {
//creacion de la ruta
private static final String RUTA_DIRECTORIO = "C:\\ArchivosJava";
/**
 * Metodo el cual crea Archivos
 * @param nombreArchivo 
 */
public static void crearArchivo(String nombreArchivo){
    //creacion del objeto directorio
    File directorio= new File(RUTA_DIRECTORIO); //creacion de objeto
    if(!directorio.exists()){  //condicionales para crear directorio
        if(directorio.mkdirs()){
            System.out.println("Directorio creado en: "+RUTA_DIRECTORIO);
        }else{
            System.out.println("No se pudo crear el directorio.");
            return;
        }
    }
    //creacion del objeto Archivo
   File archivo= new File(RUTA_DIRECTORIO,nombreArchivo);
   try{
       if(archivo.createNewFile()){
           System.out.println("Archivo creado:"+archivo.getName());
       }else {
           System.out.println("El archivo ya existe.");
       }
       //se muestra errores
   }catch(IOException ex){
       ex.printStackTrace(System.out);
   }
  }
/**
 * Metodo que Guarda los Datos en un archivo Txt
 * @param nombreArchivo
 * @param nombre
 * @param edad
 * @param nota1
 * @param nota2
 * @param nota3
 * @param nota4
 * @param promedio 
 */
public static void escribirDatos(String nombreArchivo, String nombre, int edad, int nota1, int nota2, int nota3, int nota4, double promedio){
    //creacion del Objeto que guarda Datos
    File archivo= new File(RUTA_DIRECTORIO, nombreArchivo);
    // se escribe en el texto y se escribe en lo existente en vez de sobre escribir
    try(PrintWriter salida=new PrintWriter(new FileWriter(archivo, true))){
        salida.println("Nombre: " + nombre + ", Edad: " + edad + ", Nota1: " + nota1 + ", Nota2: " + nota2 + ", Nota3: " + nota3 + ", Nota4: " + nota4 + ", Promedio: " + promedio);
   System.out.println("Datos Guardados en el Archivo");
    }catch(IOException ex){
       ex.printStackTrace(System.out); 
    }
}
        
    
        
        
        
        
}