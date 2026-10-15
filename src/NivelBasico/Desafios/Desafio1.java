package NivelBasico.Desafios;

public class Desafio1 {
    public static void main(String[] args) {

        String nomeNinja1 = "Naruto";
        int idadeNinja1 = 15;
        String nomeMissaoNinja1 = "Lava Jato";
        String nivelMissaoNinja1 = "Médio";
        String statusMissaoNinja1 = "Concluída";


        String nomeNinja2 = "Itadori";
        int idadeNinja2 = 17;
        String nivelMissaoNinja2 = "Intermediário";
        String nomeMissaoNinja2 = "Mensalão";
        String statusMissaoNinja2 = "Concluída";


        String nomeNinja3 = "Goku";
        int idadeNinja3 = 26;
        String nomeMissaoNinja3 = "INSS";
        String nivelMissaoNinja3 = "Difícil";
        String statusMissaoNinja3 = "Em andamento";



        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade: " + idadeNinja2);
        if (idadeNinja1 > 15){
            System.out.println("Status missão: Concluída");
        }
        else{
            System.out.println("Não concluída");
        }
        System.out.println("Missão: " + nomeMissaoNinja1 + "\nNivél da missão: " + nivelMissaoNinja1);



    }
}
