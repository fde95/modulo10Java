package LoopWhileDoWhile;

/**
 * @author felipe.espinoza
 * @version 1.0
 */

import java.util.Scanner;

public class LoopDoWhile {
    public static void main(String[] args) {
        Scanner valorDigitado = new Scanner(System.in);

        String resposta = "";

        do {
            System.out.println("Digite um valor para gerar a tabuada: ");
            long valorBase = valorDigitado.nextLong();
            for (long i = 0; i <= 10; i++) {
                System.out.println(valorBase + "x" + i + " = " + valorBase * i);
            }

            System.out.println("Deseja gerar novamente? ");
            resposta = valorDigitado.next();
        } while (resposta.equalsIgnoreCase("Sim"));
        System.out.println("Obrigado!");
    }
}
