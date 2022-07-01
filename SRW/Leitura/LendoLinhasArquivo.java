package SRW.Leitura;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class LendoLinhasArquivo {
    
    public static void main(String[] args) throws IOException {
        System.out.println();
        BufferedReader buffer1 = criaBuffer();
        BufferedReader buffer2 = criaBuffer();
        BufferedReader buffer3 = criaBuffer();
        /* -> Imprimo cada linha disponível no arquivo */
        imprimindoLinhasNaMao(buffer1);
        System.out.println();
        System.out.println();
        imprimindoLinhasTradicional(buffer2);
        System.out.println();
        System.out.println();
        imprimindoLinhasComLambda(buffer3);
        buffer1.close();
        buffer2.close();
        buffer3.close();
    }

    private static BufferedReader criaBuffer() throws IOException {
        String file = "/home/douglas/IdeaProjects/Java/SRW/files/lorem.txt";
        InputStream inputStream = new FileInputStream(file);
        Reader streamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        return bufferedReader;
    }

    private static void imprimindoLinhasNaMao(BufferedReader buffer) throws IOException {
        System.out.println("Imprimindo as linhas do arquivo na mão:");
        System.out.println();
        System.out.println(buffer.readLine());
        System.out.println(buffer.readLine());
        System.out.println(buffer.readLine());
        System.out.println(buffer.readLine());
        System.out.println(buffer.readLine());
        System.out.println(buffer.readLine());
        System.out.println(buffer.readLine());
    }

    private static void imprimindoLinhasTradicional(BufferedReader buffer) throws IOException {
        System.out.println("Imprimindo as linhas do arquivo tradicionalmente:");
        System.out.println();
        String linha = buffer.readLine();
        while(linha != null) {
            System.out.println(linha);
            linha = buffer.readLine();
        }
    }

    private static void imprimindoLinhasComLambda(BufferedReader buffer) {
        System.out.println("Imprimindo as linhas do arquivo com Lambda Expression: ");
        System.out.println();
        buffer.lines().forEach(line -> System.out.println(line));
    }

}
