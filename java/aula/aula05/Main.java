package aula05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Aluno:
        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do aluno: ");
        aluno.setName(sc.nextLine());

        System.out.println("Digite o RA do aluno: ");
        aluno.setRA(sc.nextInt());

        System.out.println("Digite a nota do aluno: ");
        aluno.setNota(sc.nextInt());
        sc.nextLine();  



        System.out.println("Nome do aluno: " + aluno.getName());
        System.out.println("RA do aluno: " + aluno.getRA());
        System.out.println("Nota do aluno: " + aluno.getNota());



        //Monitor:
        Monitor monitor = new Monitor();
        System.out.println("Digite o ID do monitor: ");
        monitor.setID(sc.nextInt());

        System.out.println("ID do monitor: " + monitor.getID());


        
        //darProva
        monitor.darProva();
    }
}

