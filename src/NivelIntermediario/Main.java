package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        //Objeto 1
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 16;
        naruto.ModoSabio();


        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke";
        Sasuke.idade = 22;
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.ShariganAtivado();

        Ninja goku = new Ninja();
        goku.nome = "Goku";
        goku.aldeia = "Planeta Vegeta";
        goku.idade = 25;
        System.out.println("Oi,  eu sou o "+ goku.nome);

        System.out.println(goku.nome);
        System.out.println(naruto.nome);

        Sayajin gohan = new Sayajin();
        gohan.nome = "Gohan";
        gohan.idade = 13;
        gohan.Kamehameha();
        gohan.GenkiDama();
    }
}
