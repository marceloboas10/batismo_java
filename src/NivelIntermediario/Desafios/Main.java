package NivelIntermediario.Desafios;

public class Main {
    public static void main(String[] args) {
        Ninjinha marcelo = new Ninjinha();
        marcelo.nome = "Marcelo Vilas Boas";
        marcelo.idade = 41;
        marcelo.nivelDeDificuldade = "Difícil";
        marcelo.missao = "Cuidar da família";
        marcelo.mostrarInformacao();


        Uchiha enzo = new Uchiha();
        enzo.nome = "Enzo Vilas Boas";
        enzo.idade = 12;
        enzo.nivelDeDificuldade = "Média";
        enzo.missao = "Estudar";
        enzo.habilidadeEspecial = "Inteligência";
        enzo.mostrarInformacao();

    }
}
