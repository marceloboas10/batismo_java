package NivelIntermediario.Desafio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ninjinha marcelo = new Ninjinha();
        marcelo.nome = "Marcelo Vilas Boas";
        marcelo.idade = 41;
        marcelo.nivelDeDificuldade = "Difícil";
        marcelo.missao = "Cuidar da família";
        marcelo.mostrarInformacoes();

        Uchiha enzo = new Uchiha();
        enzo.nome = "Enzo Vilas Boas";
        enzo.idade = 12;
        enzo.nivelDeDificuldade = "Média";
        enzo.missao = "Estudar";
        enzo.habilidadeEspecial = "Inteligência";
        enzo.mostrarInformacoes();
        */

        Scanner scanner = new Scanner(System.in);
        ArrayList<Ninjinha> listaNinjas = new ArrayList<Ninjinha>();
        int opcao;

        do {
            System.out.println("****** MENU ******\n");
            System.out.println("1 - Listar Ninjas");
            System.out.println("2 - Cadastrar Ninja");
            System.out.println("3 - Sair\n");
            opcao =  scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    if (listaNinjas.isEmpty()){
                        System.out.println("Nenhum ninja cadastrado!\n");
                    }else{
                        System.out.println("Ninjas Cadastrados");
                        for(int i =0; i < listaNinjas.size(); i++){
                            System.out.println((i + 1) + ". " + listaNinjas.get(i).nome);
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    Uchiha novoUchina = new Uchiha();
                    System.out.println("Qual o nome do ninja? ");
                    novoUchina.nome = scanner.nextLine();
                    listaNinjas.add(novoUchina);
                    break;

                case 3:
                default:
            }




        }while(opcao != 3);


    }
}
