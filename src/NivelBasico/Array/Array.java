package NivelBasico.Array;

public class Array {
    public static void main(String[] args) {
        String[] ninja = new String[5];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";

        System.out.println(ninja[1]);

        int[] idade = new int[1];
        idade[0] = 7;

        System.out.println(idade[0]);

        for(int i = 0;i < ninja.length; i++){
            System.out.println(ninja[i]);
        }
    }
}
