//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

public class MainPrimeiraQuestaoFibonacci {
    public static void main(String[] args) {


        System.out.println("\n");

        System.out.println("Sequência de Fibonacci Desafio Target:");

        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);

        int ordem = 10;


        for (int i = 2; i < ordem; i++) {
            int proximoNumero = fibonacci.get(i-1) + fibonacci.get(i-2);
            fibonacci.add(proximoNumero);
        }

        System.out.println("A sequência de Fibonacci é: " + fibonacci);
    }
}