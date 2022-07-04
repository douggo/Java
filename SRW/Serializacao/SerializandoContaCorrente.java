package SRW.Serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import HIP.Bytebank.Model.Cliente;
import HIP.Bytebank.Model.Conta;
import HIP.Bytebank.Model.ContaCorrente;

public class SerializandoContaCorrente {
    
    private static String file = "/home/douglas/IdeaProjects/Java/SRW/files/CC.bin";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serializando();
        desserializando();   
    }

    private static void serializando() throws IOException {
        Cliente cliente = new Cliente();
        cliente.setNome("Douglas");
        cliente.setProfissao("Dev");
        cliente.setCPF("123.456.789-00");

        ContaCorrente cc = new ContaCorrente(1, 1, 430);
        cc.setTitular(cliente);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(cc);
        oos.close();
    }

    private static void desserializando() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Conta cc = (ContaCorrente) ois.readObject();
        ois.close();
        System.out.println(cc);   
    }

}
