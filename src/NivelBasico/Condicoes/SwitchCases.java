package NivelBasico.Condicoes;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um personagem:");
        System.out.println("1 - Naruto\n2 - Sasuke\n3 - Sakura");
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Você escolheu o personagem " + escolhaDoUsuario);

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("O usuário escolheu Naruto");
                break;

            case 2:
                System.out.println("O usuário escolheu Sasuke");
                break;

            case 3:
                System.out.println("O usuário escolheu Sakura");
                break;

            default:
                System.out.println("Você não digitou uma resposta válida");
                break;
        }

        scanner.close();
    }
}
