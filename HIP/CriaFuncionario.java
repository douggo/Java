package HIP;

public class CriaFuncionario {
    
    public static void main(String[] args) {
        Funcionario doug = new Funcionario();
        doug.setNome("Douglas");
        doug.setCPF("123.123.123-00");
        doug.setSalario(2600.00);
        System.out.println(doug.getBonificacao());
    }

}
