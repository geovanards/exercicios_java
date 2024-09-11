package aula05;

import java.util.Scanner;

public class Monitor extends Pessoa {
    private int ID;


    public void setID(int ID) {
        this.ID = ID;
    }

   
    public int getID() {
        return ID;
    }


    public void darProva() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        int nota = sc.nextInt();


        System.out.println("Nota registrada: " + nota);
    }
}

