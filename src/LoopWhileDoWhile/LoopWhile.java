package LoopWhileDoWhile;
/**
 * @author felipe.espinoza
 * @version 1.0
 */

import java.util.Scanner;

public class LoopWhile {
    public static void main (String[] args){
        Scanner valorDigitado = new Scanner(System.in);

        System.out.println("Deseja gerar uma tabuada de algum número? ");
        String resposta = valorDigitado.next();

        while (resposta.equalsIgnoreCase("Sim")){
            System.out.println("Ok, vamos começar!\nInsira um valor: ");
            long valorBase = valorDigitado.nextInt();
            for (long i = 0; i <= 10; i++){
                System.out.println(valorBase + "x" + i + " = " + valorBase*i);
            }

            System.out.println("Deseja gerar uma nova tabuada? ");
            resposta = valorDigitado.next();
        }
        System.out.println("Obrigado!\nVolte quando preciar!\n");
    }
}
