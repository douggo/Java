package CWLE.ArrayLists;

import java.util.ArrayList;

import HIP.Bytebank.Model.ContaCorrente;
import HIP.Bytebank.Model.ContaPoupanca;
import HIP.EnterpriseManagement.Model.Administrador;
import HIP.EnterpriseManagement.Model.Gerente;
import HIP.EnterpriseManagement.Model.SuporteTecnico;

public class RawArrayList {
    
    public static void main(String[] args) {
        System.out.println();
        ArrayList array = criaArrayList();
        System.out.println("Tamanho do ArrayList: " + array.size());
        array.iterator();
        System.out.println();
        for(Object objeto : array) {
            System.out.println(objeto);
        }
        array.clear();
        System.out.println();
        System.out.println("Tamanho do ArrayList após o uso do clear(): " + array.size());
    }

    private static ArrayList criaArrayList() {
        ArrayList array = new ArrayList();
        ContaCorrente cc1 = new ContaCorrente(1, 1, 350);
        ContaPoupanca cp1 = new ContaPoupanca(2, 1, 5450.5);
        Administrador adm = new Administrador();
        Gerente gerente = new Gerente();
        SuporteTecnico suporteTecnico = new SuporteTecnico();
        array.add(cc1);
        array.add(cp1);
        array.add(adm);
        array.add(gerente);
        array.add(suporteTecnico);
        return array;
    }

}
