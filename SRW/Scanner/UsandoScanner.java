package SRW.Scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UsandoScanner {
    
    public static void main(String[] args) {
        System.out.println();
        try {
            lerContas();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void lerContas() throws IOException {
        Scanner scanner = new Scanner(getCsvFile());
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    private static File getCsvFile() {
        String filePath = "/home/douglas/IdeaProjects/Java/SRW/files/contas.csv";
        return new File(filePath);
    }

}
