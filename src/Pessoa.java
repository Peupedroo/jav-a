
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String CPF;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade, String CPF) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
    }

    public void setNome (String nome){

        this.nome = nome;
    }
    public void setIdade (int idade){
        this.idade = idade;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getCPF(){
        return CPF;
    }

    public abstract void quemSouEu();
    public abstract void minhaAtividade();
}
