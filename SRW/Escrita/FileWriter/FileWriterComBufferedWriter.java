package SRW.Escrita.FileWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterComBufferedWriter {
    
    public static void main(String[] args) {
        try {
            criaArquivo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void criaArquivo() throws IOException {
        String file = "/home/douglas/IdeaProjects/Java/SRW/files/lorem-3.txt";
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Não estou mais usando as classes: ");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("- FileOutputStream");
        bufferedWriter.newLine();
        bufferedWriter.write("- OutputStreamWriter");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("Apenas uso a classe `FileWriter` e a passo para uma");
        bufferedWriter.newLine();
        bufferedWriter.write("nova instância de um objeto `BufferedWriter`");
        bufferedWriter.close();
    }

}
