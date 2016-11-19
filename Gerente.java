public class Gerente extends Funcionario {
    private String secretario;
    
    public Gerente(String nome, Departamento dpto, double salario, String secretario){
        super(nome,dpto,salario);
        this.secretario = secretario;
    }
    
    public Gerente(String nome, Departamento dpto, double salario){
        super(nome,dpto,salario);
        this.secretario = "Cargo vago";
    }
    
    public String getSecretario(){
        return secretario;
    }
    
    public void setSecretario(String secretario){
        this.secretario = secretario;
    }
}