import java.util.Scanner;

public class SegundaQuestaoDesafioTarget {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome = "";


        while (true) { //Coloquei o loop para garantir que o usuário preencha apenas letras e não outros caracteres
            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();
            if (nome.matches("[a-zA-Z\\s]+")) {
                break;
            } else {
                System.out.println("Apenas letras são permitidas, tente novamente!");
            }
        }

        int contador = 0;
        int contador2 = 0;
        char caso1 = 'a';
        char caso2 = 'A';


        for (int i = 0; i < nome.length(); i++) {
            if (nome.charAt(i) == caso1) {
                contador++;
            }
        }
        System.out.println("A letra 'a' 'aparece: " + contador + " vezes");

        for (int u = 0; u < nome.length(); u++) {
            if (nome.charAt(u) == caso2) {
                contador2++;
            }
        }

            System.out.println("A letra 'A' aparecem: " + contador2 + " vezes!");

            scanner.close();

    }
}