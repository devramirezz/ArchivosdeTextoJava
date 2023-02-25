import java.io.*;
import java.nio.charset.Charset;

public class LeerArchivoBinario {
    public static void main(String[] args) {
        try {
            // Crear un objeto FileInputStream para leer el archivo binario
            FileInputStream archivo = new FileInputStream("texto.bin");
            
            // Leer los bytes del archivo
            byte[] bytes = archivo.readAllBytes();
            String texto = new String(bytes, Charset.forName("UTF-8"));
            
            // Cerrar el archivo
            archivo.close();
            
            System.out.println("Texto leído del archivo binario:");
            System.out.println(texto);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo binario.");
            e.printStackTrace();
        }
    }
}
