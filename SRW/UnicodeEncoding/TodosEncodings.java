package SRW.UnicodeEncoding;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TodosEncodings {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println();

        String letra = "Ç";
        System.out.print(letra + " = " + letra.codePointAt(0) + " (UNICODE)");
        Charset charset = Charset.defaultCharset();
        System.out.print(" - Default Charset: " + charset.displayName() + " (UBUNTU)");

        System.out.println();
        System.out.println("---------------");

        byte[] bytes = letra.getBytes("windows-1252");
        String novaLetra = new String(bytes);
        System.out.println(letra + " usando o encoding do Windows: " + novaLetra);

        System.out.println("---------------");

        bytes = letra.getBytes("UTF-16");
        System.out.println(letra + " = " + bytes.length + " bytes (UTF-16)");

        System.out.println("---------------");

        novaLetra = new String(bytes, "UTF-16");
        System.out.println(letra + " usando encoding UTF-16: " + novaLetra);

        System.out.println("---------------");

        bytes = letra.getBytes(StandardCharsets.US_ASCII);
        System.out.println(letra + " = " + bytes.length + " bytes (US-ASCII)");

        System.out.println("---------------");

        novaLetra = new String(bytes, "US-ASCII");
        System.out.println(letra + " usando o encoding US-ASCII: " + novaLetra);
    }

}
