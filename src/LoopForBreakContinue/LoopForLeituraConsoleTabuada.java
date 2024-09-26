package LoopForBreakContinue;

/**
 * @author felipe.espinoza
 * @version 1.0
 */

import java.util.Scanner;

public class LoopForLeituraConsoleTabuada {

    public static void main (String[] args){
        Scanner valorDigitado = new Scanner(System.in);

        System.out.println("\nVamos gerar uma tabuada juntos multipicando de 0 a 10.\nPor favor, insira um numero:");
        long valorBase = valorDigitado.nextInt();

        for (long i = 0; i <=10; i++){
            System.out.println(valorBase + "x" + i + " = " + valorBase*i);
        }
    }
}
