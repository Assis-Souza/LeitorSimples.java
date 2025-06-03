import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class LeitorSimples {
 @SuppressWarnings("ConvertToTryWithResources")
 public static void main(String[] args) {
 try {
     try (FileReader leitor = new FileReader("frase.txt")) {
         BufferedReader buffer = new BufferedReader(leitor);
         String linha;
         while ((linha = buffer.readLine()) != null) {
             System.out.println("Frase lida: " + linha);
         }
         buffer.close();
     }
 } catch (IOException e) {
 System.out.println("Erro ao ler o arquivo.");
 }
 }
}