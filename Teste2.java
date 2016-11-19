public class Teste2 {
    public static void main (String[] args){
        Teclado t = new Teclado();

        int codFuncionario = 0;
        Funcionario F,M;
        double totalSalario=0;
        double totalSalarioFinal=0;
        int codReajuste=0;
        int qtdDep2=0;
        int somaDep2=0;
        M = null;
        String  nome;
        int nDpt;
        String nomeDpt;
        double salario;
        Departamento d;
        char resp;
        
        //duke-generator.esy.es - Gerar metodos gets e sets automaticamente
        System.out.println ("\f");
        
        do{
            
            codFuncionario = 1+(int) (Math.random()*(2));
            
            nome= t.leString("Nome: ");
            nDpt= t.leInt("n°Departamento: ");
            nomeDpt= t.leString("nomeDepartamento: ");
            salario= t.leDouble("Salário: ");
            d = new Departamento(nDpt,nomeDpt);
            if (codFuncionario==1){
                F = new Funcionario(nome,d, salario);}
            else{
                F = new Gerente(nome,d, salario,t.leString("NomeSecretario: "));
            }
                            
            totalSalario +=F.getSalario();             
             
            do{
                codReajuste = t.leInt("Digite o código do reajuste: \n1 - 10% \n2 - 5% \n3 - 13%");
            
            }
            while (codReajuste !=1 && codReajuste !=2 && codReajuste !=3);
                
            totalSalarioFinal+= F.getSalario();
            
            if (M==null) M=F;
            if (M.getSalario()<=F.getSalario())M=F;

            if (F.getDepartamento().getNumero()==2){
                qtdDep2 ++;
                somaDep2+=F.getSalario();
            }
            
            resp= Character.toUpperCase(t.leChar("Quer entrar com dados [S-sim N-não] ? "));
            
        }while (resp != 'S'&& resp != 'N');
                
        System.out.println ("\f---------------DETALHES FOLHA DE PAGAMENTO --------------------"); 
        System.out.println ("\nFuncionário com o maior salário: "+M.getNome()+"\n\tSalário: "+M.getSalario());
        System.out.println ("\tN°Dpto: "+M.getDepartamento().getNumero()+"\tNome Dpto: "+M.getDepartamento().getNome());
        if (M instanceof Gerente) System.out.println ("\tSecretaria(o): "+((Gerente) M).getSecretario());
        System.out.println ("\nValor Final da folha após os reajustes: "+totalSalarioFinal);
        System.out.println ("Salário Médio dos Funcionários do departamento 2: "+(somaDep2/qtdDep2));
        System.out.println ("-----------------------------------------------------------------");
    } 
}