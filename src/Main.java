
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa prof = new Professor();
        Pessoa a = new Professor("pedro",20, "1313914","professor", 13123, 1231);
        Pessoa a2 = new Aluno();
        Pessoa a3 = new Aluno("joao", 20, "34568", 9.0, 7.5, 8.0);
        Displina D = new Displina();
        System.out.println("Você é aluno ou professor? (1 para Professor, 2 para Aluno)");
        int escolha = sc.nextInt();
        sc.nextLine();
        Transformacao T = new Transformacao();


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
                        System.out.println("digite a disciplina ");
                        D.getDisciplina(sc.nextLine());

                        System.out.println("qual seu cpf");
                        prof.setCPF(sc.nextLine());

                        System.out.println("qual o seu salario");
                        ((Professor) prof).setSalario(sc.nextDouble());

                        System.out.println("quanto tempo vc trabalha ");
                        ((Professor) prof).setTempo(sc.nextInt());
                        ((Professor) prof).setDisciplina(sc.nextLine());
                        System.out.println("qual sua disciplina ");
                        ((Professor) prof).setDisciplina(sc.nextLine());

                        System.out.println("informacoes do professor");
                        System.out.println(prof);

                        System.out.println("vc quer continuar");
                        continuar = sc.nextLine();

                        ((Professor) prof).setCargo(CARGO.Professor);
                        System.out.println(((Professor) prof).getCargo());


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
                        a2.setNome(sc.nextLine());
                        System.out.println("qual sua idade");
                        a2.setIdade(sc.nextInt());
                        sc.nextLine();
                        System.out.println("qual seu cpf");
                        a2.setNome(sc.nextLine());

                        System.out.println("qual e a sua primeira nota ");
                        ((Aluno) a2).setNota1(sc.nextDouble());
                        System.out.println("qual a sua segunda nota");
                        ((Aluno) a2).setNota2(sc.nextDouble());
                        sc.nextLine();
                        System.out.println("qual sua terceira nota");
                        ((Aluno) a2).setNota3(sc.nextDouble());
                        ((Aluno) a2).calcMedia();

                        ((Aluno) a2).verificarAprovacao();
                        ((Aluno) a2).detalhes();

                break;    } while (h.equalsIgnoreCase("S"));


                    }
                }
        }

    }