package LoopSwitchCase;

import java.util.Scanner;

/**
 * @author felipe.espinoza
 * @version 1.0
 */

public class LoopSwitch {

    public static void main(String[] args){

        Scanner valorDigitado = new Scanner(System.in);

        System.out.println("Por favor, insira a sua idade em números:");
        int idadeInserida = valorDigitado.nextInt();
        String faixaEtaria = getidadeInserida(idadeInserida);
        System.out.println(faixaEtaria);
    }

    private static String getidadeInserida(int idadeInserida) {
        String resultado;

        switch (idadeInserida){
            case 0:
            case 5:
                resultado = "Você é um bebê!";
                break;

            case 6:
            case 10:
                resultado = "Você é uma criança!";
                break;

            case 11:
            case 17:
                resultado = "Você é um adolescente!";
                break;

            case 18:
            case 50:
                resultado = "Você é adulto!";
                break;

            default:
                resultado = "Você é senior";
        }
        return resultado;
    }
}
