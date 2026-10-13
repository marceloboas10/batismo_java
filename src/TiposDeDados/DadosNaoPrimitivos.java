package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        /*
        * Dados não primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja e atribuir nome a ele
        */

        String nome = "Naruto";
        String nomeMaisculo = nome.toUpperCase();
        String aldeia = "Aldeia da Folha";
        String aldeiaMinuscula = aldeia.toLowerCase();

        System.out.println(nomeMaisculo);
        System.out.println(aldeiaMinuscula);
    }
}
