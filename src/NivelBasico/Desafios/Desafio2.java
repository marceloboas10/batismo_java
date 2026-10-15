package NivelBasico.Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        System.out.println("\n==== Menu Ninja ====");
        System.out.println("1. Cadastrar Ninja\n2. Listar Ninjas\n3. Sair");


        Scanner scannner = new Scanner(System.in);
        int opcaoMenu = scannner.nextInt();

        System.out.println(opcaoMenu);
        String[] cadastroNinja = new String[10];

        switch(opcaoMenu){
            case 1:
                cadastroNinja[0] = "";
        }

    }
}
