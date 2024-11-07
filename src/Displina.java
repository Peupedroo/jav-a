public class Displina {
    private String disciplina ;
    private Aluno aluno ;
    private Professor professor;

    public Displina() {
        this.professor = professor;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina(String s) {
        return disciplina;
    }

    public void cadastrarAluno (Aluno aluno){
        this.aluno = aluno;
    }
    public void ministrarDisciplina (Professor professor){
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Displina{" +
                "disciplina='" + disciplina + '\'' +
                ", aluno=" + aluno +
                ", professor=" + professor +
                '}';
    }
}
