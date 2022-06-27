package HIP.EnterpriseManagement.Interface;

public abstract interface Autenticavel {

    public void setSenha(int senha);

    public boolean autentica(int senha);
    
}
