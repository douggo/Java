package SRW.Escrita;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class MetodosEscritaLeitura {

    //private static int option = 1; /* File */
    private static int option = 2; /* Console */
    //private static int option = 3; /* Rede [NOT FUNCTIONAL!] */
    //private static int option = 4; /* Console -> File */
    private static String prefixo = "";
    private static Socket socket;

    public static void main(String[] args) throws Exception, IOException {
        System.out.println();
        imprimeMetodoIO(option);

        Reader inputStreamReader = new InputStreamReader(getInputStreamMethod(option));
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        Writer outputStreamWriter = new OutputStreamWriter(getOutputStreamMethod(option));
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        
        String line = bufferedReader.readLine();
        while(line != null && !line.isEmpty()) {
            bufferedWriter.write(prefixo + line);
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            if(option == 3 || option == 2) {
                bufferedWriter.flush();
            }
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        bufferedWriter.close();   
    }

    private static void imprimeMetodoIO(int opcao) {
        String texto = "";
        switch(opcao) {
            case 1:
                texto = "Pegando o texto de um arquivo existente e passando para um novo arquivo.";
            break;
            case 2:
                texto = "Digite o texto no console e será impresso diretamente no console.";
            break;
            case 3:
                texto = "Interação entre dois computadores com Sockets.";
            break;
            case 4:
                texto = "Digite o texto no console e ele será salvo num novo arquivo.";
            break;
        }
        System.out.println(texto);
        System.out.println();
        System.out.println();
    }

    private static InputStream getInputStreamMethod(int option) throws IOException, Exception {
        String fileOrigem = "/home/douglas/IdeaProjects/Java/SRW/files/lorem.txt";
        switch(option) {
            case 1: // File
                return new FileInputStream(fileOrigem);
            case 2: // Console
            case 4:
                prefixo = "Você digitou: ";
                return System.in;
            case 3: // Rede
                socket = new Socket();
                return socket.getInputStream();
            default:
                throw new Exception();
        }
    }

    private static OutputStream getOutputStreamMethod(int option) throws Exception, IOException {
        String fileDestino = "/home/douglas/IdeaProjects/Java/SRW/files/lorem-2.txt";
        switch(option) {
            case 1: // File
            case 4:
                return new FileOutputStream(fileDestino);
            case 2: // Console
                return System.out;
            case 3: // Rede
                return socket.getOutputStream();
            default:
                throw new Exception();
        }
    }

}
