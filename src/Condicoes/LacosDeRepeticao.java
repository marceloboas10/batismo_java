package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        * Laços de repetição vão repetir infinitamente ou até você atingir o parâmetro desejado
        * While = (condição) {Tudo aqui vai acontecer}
        *  For
         */

        int numeroDeClones = 1;
        int maximoDeClones = 40;

        while(numeroDeClones <= maximoDeClones){
            System.out.println("O Naruto fez um clone " + numeroDeClones);
            numeroDeClones++;
        }


        for (int i = 1; i < numeroDeClones;i++){
            System.out.println(i);
        }

    }
}
