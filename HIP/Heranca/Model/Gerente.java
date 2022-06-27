package HIP.Heranca.Model;

public class Gerente extends FuncionarioAutenticavel {

    @Override
    public double getBonificacao() {
        // `super` para definir que o método/atributo está na classe-mãe
        return super.getSalario();
    }

}