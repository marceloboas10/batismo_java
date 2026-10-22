package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        //Criando um objeto da classe Ninja
        Ninja naruto = new Ninja();
        naruto.nome = "Naruto";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 16;

        Ninja goku = new Ninja();
        goku.nome = "Goku";
        goku.aldeia = "Planeta Vegeta";
        goku.idade = 25;

        System.out.println(goku.nome);
        System.out.println(naruto.nome);
    }
}
