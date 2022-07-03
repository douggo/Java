package SRW.Escrita.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class CriandoArquivo {

    public static void main(String[] args) {
        try {
            criaArquivo();
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void criaArquivo() throws IOException {
        String file = "/home/douglas/IdeaProjects/Java/SRW/files/lorem-filewriter.txt";
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Criando um arquivo usando a classe: ");
        fileWriter.write(System.lineSeparator());
        fileWriter.write("FileWriter");
        fileWriter.close();
    }

}