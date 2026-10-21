package NivelBasico.Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scannner = new Scanner(System.in);

        int ninjasCadastrados = 0;
        int numeroMaximoNinjas = 3;
        String[] listaNinjas = new String[numeroMaximoNinjas];
        int opcaoMenu = 0;


        while(opcaoMenu !=3){
            System.out.println("==== Menu ====");
            System.out.println("1. Cadastrar Ninja\n2. Listar Ninjas\n3. Sair");
            System.out.println("Escolha uma opção: ");
            opcaoMenu = scannner.nextInt();
            scannner.nextLine();

            switch(opcaoMenu){
                case 1:
                    if(ninjasCadastrados < numeroMaximoNinjas){
                        System.out.println("Digite o nome do ninja: ");
                        String nomeDoNinja = scannner.nextLine();
                        listaNinjas[ninjasCadastrados] = nomeDoNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja "+ nomeDoNinja + " cadastrado no sistema!");
                    }else{
                        System.out.println("Limite máximo de ninjas excedido!\n");
                    }
                    break;
                case 2:
                   if(ninjasCadastrados == 0){
                       System.out.println("Nenhum ninja encontrado\n");
                   }else{
                       System.out.println("======= Lista de ninjas =======");
                       for (int i = 0; i < listaNinjas.length;i++){
                           System.out.println(listaNinjas[i]);
                       }
                   }
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inexistente");
            }
        }



    }
}
