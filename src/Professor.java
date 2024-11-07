

public final class Professor extends Pessoa implements Folha_pague {
    public CARGO cargo;

    public void setCargo(CARGO cargo) {
        this.cargo = cargo;
    }

    public CARGO getCargo() {
        return cargo;
    }

    private String disciplina;
    private double salario;
    private int tempo ;
    public  Professor(){

    }




    public Professor(String nome, int idade, String CPF, String disciplina, double salario, int tempo) {
        super(nome, idade, CPF);
        this.disciplina = disciplina;
        this.salario = salario;
        this.tempo = tempo;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void setTempo (int tempo){
        this.tempo  = tempo;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public double getSalario (){
        return salario;
    }



    @Override
    public String toString() {
        return super.toString() + "Professor{" +
                "disciplina='" + disciplina + '\'' +
                ", salario=" + salario +
                ", tempo=" + tempo +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", CPF='" + CPF + '\'' +
                '}';
    }
    @Override
    public void quemSouEu(){
        System.out.println("Sou o Professor");
    }

    @Override
    public void minhaAtividade (){
        System.out.println("Ensinar");
    }

    @Override
    public void calcularSalario() {
         double dinheiro = tempo*salario;

    }

    @Override
    public void aplicaerBonus() {
        double calcularSalario = 0;
        double bonus = calcularSalario * 0.02;
    }
}
