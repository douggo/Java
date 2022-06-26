package HIP.Heranca.Model;

public class SuporteTecnico extends Funcionario {
    
    @Override
    public double getBonificacao() {
        return super.getSalario() + 100.0;
    }

}
