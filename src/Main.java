
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Professor prof = new Professor();
        Professor prof2 = new Professor("pedro",20, "1313914","professor", 13123, 1231);
        Aluno a = new Aluno();
        Aluno a2 = new Aluno("joao", 20, "34568", 9.0, 7.5, 8.0);
        System.out.println("Você é aluno ou professor? (1 para Professor, 2 para Aluno)");
        int escolha = sc.nextInt();
        sc.nextLine();

        switch (escolha) {
            case 1:
                String continuar;
                System.out.println("Você quer se cadastrar como professor? (S/N)");
                String g = sc.nextLine();
                if (g.equalsIgnoreCase("S"))
                    do {


                        System.out.println("qual o seu nome");
                        prof.setNome(sc.nextLine());

                        System.out.println("qual o sua idade");
                        prof.setIdade(sc.nextInt());

                        sc.nextLine();

                        System.out.println("qual seu cpf");
                        prof.setCPF(sc.nextLine());

                        System.out.println("qual o seu salario");
                        prof.setSalario(sc.nextDouble());

                        System.out.println("quanto tempo vc trabalha ");
                        prof.setTempo(sc.nextInt());
                        prof.setDisciplina(sc.nextLine());
                        System.out.println("qual sua disciplina ");
                        prof.setDisciplina(sc.nextLine());

                        System.out.println("informacoes do professor");
                        System.out.println(prof);

                        System.out.println("vc quer continuar");
                        continuar = sc.nextLine();

                        prof.setCargo(CARGO.Professor);
                        System.out.println(prof.getCargo());


                        break;
                    } while (continuar.equalsIgnoreCase("S"));


                else {
                    System.out.println("saiu");
                    break;
                }
            case 2:
                String h;
                String continuar2;
                System.out.println("vc quer se cadastrar como aluno");
                h = sc.nextLine();
                if (h.equalsIgnoreCase("S")) {
                    do {
                        System.out.println("qual o seu nome");
                        a.setNome(sc.nextLine());
                        System.out.println("qual sua idade");
                        a.setIdade(sc.nextInt());
                        sc.nextLine();
                        System.out.println("qual seu cpf");
                        a.setNome(sc.nextLine());

                        System.out.println("qual e a sua primeira nota ");
                        a.setNota1(sc.nextDouble());
                        System.out.println("qual a sua segunda nota");
                        a.setNota2(sc.nextDouble());
                        sc.nextLine();
                        System.out.println("qual sua terceira nota");
                        a.setNota3(sc.nextDouble());
                        a.calcMedia();

                        a.verificarAprovacao();
                        a.detalhes();

                break;    } while (h.equalsIgnoreCase("S"));


                    }
                }
        }

    }