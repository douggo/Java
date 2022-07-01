package SRW.Leitura;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LendoLinhaArquivo {

    public static void main(String[] args) throws IOException {
        System.out.println();
        /* -> Recupero o arquivo seguindo o caminho absoluto */
        String file = "/home/douglas/IdeaProjects/Java/SRW/files/lorem.txt";
        FileInputStream inputStream = new FileInputStream(file);
        /* -> Crio um reader para ler os binários do arquivo */
        InputStreamReader streamReader = new InputStreamReader(inputStream);
        /* -> Crio um buffer para recuperar a primeira linha do arquivo de texto */
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println(bufferedReader.readLine());
        /* -> Fecho a stream do arquivo */
        bufferedReader.close();
    }

}