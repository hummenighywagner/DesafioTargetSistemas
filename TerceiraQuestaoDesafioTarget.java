public class TerceiraQuestaoDesafioTarget {
    public static void main(String[] args) {

        /*
        << Questão 3 >>
        int INDICE = 12,
        SOMA = 0, K = 1;
        enquanto K < INDICE
        faça { K = K + 1; SOMA = SOMA + K; }
        imprimir(SOMA);
        */

        System.out.println("\n");

        System.out.println("Olá, segue a resolução da terceira questão do desafio Target Sistemas: ");

        //Resolução do problema proposto:
        int indice = 12;
        int soma = 0;
        int k = 1;

        do {
            k = k + 1;
            soma = soma + k;
        }
        while (k < indice);
        System.out.println("\n"); // Quebrar linha, estava muito colado na margem superior...
        System.out.println( " O resultado da soma é: " + soma);

    }
}
