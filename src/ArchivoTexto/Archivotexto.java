
package ArchivoTexto;

import java.io.*;
import java.util.*;
import java.nio.file.*;

public class Archivotexto {
  public static void main(String[] args) {
      //nombre del Archivo
    String fileName = "Archivo.txt";
    try{
        //Escritura al archivo
    List<String> lines = Arrays.asList("Primera linea", "Segunda linea", "Tercera linea");
    Path file = Paths.get(fileName);
    Files.write(file, lines);
    }
    //Error
    catch (IOException e){
      System.out.println("Ha ocurrido un error.");
    }
  }
}
