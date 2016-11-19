public class Funcionario {
    private String nome;
    private Departamento dpto;
    private double salario;
    
   public Funcionario(String nome, Departamento dpto, double salario){
       this.nome = nome;
       this.dpto = dpto;
       this.salario = salario;
   }
    
   public Funcionario(String nome, int nDpto, String nomeDpto, double salario){
       this.nome = nome;
       Departamento dpto = new Departamento(nDpto,nomeDpto);
       this.salario = salario;
       this.dpto =dpto;
   }
    
   public String getNome(){
       return nome;
   }
    
   public double getSalario(){
       return salario;
   }
    
   public Departamento getDepartamento(){
       return dpto;
   }
   
   public void reajustaSalario(int reajuste){
       if (reajuste ==1) salario+=salario*0.2;
       if (reajuste ==2) salario+=salario*0.05;
       if (reajuste ==3) salario+=salario*0.13;
   }
   
   public void reajustaSalario(int reajuste, double vlrLimite){
       reajustaSalario(reajuste);
       if (dpto.getNumero() == 25 && this.salario<=vlrLimite) salario+=57;
    }
       
    
    
}    