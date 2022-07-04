package SRW.Scanner;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Parsing {

    private static String charset = "UTF-8";

    public static void main(String[] args) {
        System.out.println();
        try {
            importaContas();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void importaContas() throws IOException {
        Scanner fileScanner = new Scanner(getFile(), charset);
        while(fileScanner.hasNextLine()) {
            Scanner lineScanner = new Scanner(fileScanner.nextLine());
            lineScanner.useDelimiter(",");
            lineScanner.useLocale(Locale.ENGLISH);
            imprimeDados(lineScanner);
            lineScanner.close();
            System.out.println();
            System.out.println();
        }
        fileScanner.close();
    }

    private static void imprimeDados(Scanner lineScanner) {
        String tipoConta = lineScanner.next();
        int agencia = lineScanner.nextInt();
        int numero = lineScanner.nextInt();
        String nomeTitular = lineScanner.next();
        double saldo = lineScanner.nextDouble();
        String format = "%s %04d - %08d %n Nome: %s %n Saldo: R$ %05.2f";
        // String text = String.format(format, tipoConta, agencia, numero, nomeTitular, saldo);
        // System.out.println(text);
        System.out.format(
            new Locale("pt", "BR"), 
            format, 
            tipoConta, 
            agencia, 
            numero, 
            nomeTitular, 
            saldo
        );
    }

    private static File getFile() {
        String filePath = "/home/douglas/IdeaProjects/Java/SRW/files/new-contas.csv";
        return new File(filePath);
    }

}
