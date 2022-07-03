package SRW.Escrita.PrintWriterStream;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class UsandoPrint {
    
    private static String filePath = "/home/douglas/IdeaProjects/Java/SRW/files/";

    public static void main(String[] args) {
        try {
            criaArquivoPrintStream();
            criaArquivoPrintWriter();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void criaArquivoPrintStream() throws IOException {
        PrintStream ps = new PrintStream(filePath + "print-stream.txt");
        ps.println("Criando arquivo usando a classe PrintStream!");
        ps.println("Que loucura!");
        ps.close();
    }

    private static void criaArquivoPrintWriter() throws IOException {
        PrintWriter pw = new PrintWriter(filePath + "print-writer.txt");
        pw.println("Criando arquivo usando a classe PrintWriter!");
        pw.println("Que loucura! 2x");
        pw.close();
    }
    
}
