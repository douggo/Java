package CWLE.Arrays.UseCase;

import CWLE.Arrays.Model.ArrayAdapter;
import HIP.Bytebank.Model.ContaCorrente;
import HIP.Bytebank.Model.ContaPoupanca;
import HIP.EnterpriseManagement.Model.Administrador;
import HIP.EnterpriseManagement.Model.Gerente;
import HIP.EnterpriseManagement.Model.SuporteTecnico;

public class UseAdapter {
    
    public static void main(String[] args) {
        System.out.println();
        usaArrayAdapter();
    }

    private static void usaArrayAdapter() {
        ContaCorrente cc1 = new ContaCorrente(1, 1, 350);
        ContaPoupanca cp1 = new ContaPoupanca(2, 1, 5450.5);
        Administrador adm = new Administrador();
        Gerente gerente = new Gerente();
        SuporteTecnico suporteTecnico = new SuporteTecnico();

        ArrayAdapter array = new ArrayAdapter();
        array.adiciona(cc1);
        array.adiciona(cp1);
        array.adiciona(adm);
        array.adiciona(gerente);
        array.adiciona(suporteTecnico);

        for(int i = 0; i < array.getTamanho(); i++) {
            System.out.println(array.recupera(i));
        }
    }

}
