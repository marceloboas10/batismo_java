package NivelBasico.InputDeDados;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Escreva o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        System.out.println("Escreva a idade do ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é " + idadeDoNinja + " anos");

        if (idadeDoNinja >= 18){
            System.out.println("Esse ninja é maior de idade e pode sair da aldeia");
        }else {
            System.out.println("Esse ninja é muito novo e precisa treinar mais");
        }

        caixaDeTexto.close();
    }
}
