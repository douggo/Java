package SRW.Escrita;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class CriandoArquivo {
    
    public static void main(String[] args) throws IOException {
        String file = "/home/douglas/IdeaProjects/Java/SRW/files/lorem-write.txt";
        OutputStream outputStream = new FileOutputStream(file);
        Writer writer = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("Criando o meu primeiro arquivo!");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
        bufferedWriter.close();
    }

}
