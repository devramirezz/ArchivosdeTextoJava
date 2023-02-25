import java.io.*;
import java.nio.charset.Charset;

public class CrearArchivoBinario {
    public static void main(String[] args) {
        try {
            // Crear un objeto FileOutputStream para escribir en el archivo binario
            FileOutputStream archivo = new FileOutputStream("texto.bin");
            
            // Convertir el texto en bytes utilizando la codificación UTF-8
            String texto = "Hola mundo ñiño!";
            byte[] bytes = texto.getBytes(Charset.forName("UTF-8"));
            
            // Escribir los bytes en el archivo
            archivo.write(bytes);
            
            // Cerrar el archivo
            archivo.close();
            
            System.out.println("Texto escrito en el archivo binario.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo binario.");
            e.printStackTrace();
        }
    }
}
