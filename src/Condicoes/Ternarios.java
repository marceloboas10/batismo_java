package Condicoes;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {

        /*
        * Ternarios são maneiras de reduzir o código
        * Variável = (condição) ? valorSeVerdadeiro : valorSeFalso
         */

        Scanner scannner = new Scanner(System.in);
        System.out.println("Digite o numero de missões");
        short numeroDeMissoes = scannner.nextShort();
        String nivelNinja = (numeroDeMissoes >= 10) ? "Esse ninja tem mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivelNinja);
    }
}
