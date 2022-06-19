package Basics.Caracteres;

public class Strings {
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Pergunta: " + getPergunta());
        System.out.println("Resposta: " + getResposta());
    }

    private static String getPergunta() {
        String texto = "Olá, chamo-me Douglas! Tudo bem?";
        return texto;
    }

    private static String getResposta() {
        String nome = "Zakk";
        String frase = "Olá Douglas, chamo-me " + nome + ", estou ótimo! ";
        String resposta = frase + 2022;
        // Strings são imutáveis depois de criadas, dessa forma precisa-se criar outra variável
        return resposta;
    }

}
