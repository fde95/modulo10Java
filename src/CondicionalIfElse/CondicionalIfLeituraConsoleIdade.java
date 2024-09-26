package CondicionalIfElse;

import java.util.Scanner;

/**
 * @author felipe.espinoza
 * @version 1.0
 */

public class CondicionalIfLeituraConsoleIdade {
    public static void main(String[] args){

        Scanner valorDigitado = new Scanner(System.in);

        System.out.println("\n Por favor, insira a sua idade:");
        int idade = valorDigitado.nextInt();
        String idadeResultado = getIdade(idade);
        System.out.println(idadeResultado);
    }

    private static String getIdade(int idade) {
        if (idade >= 0 && idade <=5){
            return "Você é considerado um bebê\n";
        } else if (idade >= 6 && idade <= 10) {
            return "Você é considerado uma criança\n";
        } else if (idade >= 11 && idade <= 17) {
            return "Você é considerado adolescente\n";
        } else if (idade >= 18 && idade <= 50) {
            return "Você é adulto\n";
        } else if (idade >= 51 && idade <= 110) {
            return "Você é considerado senior\n";
        } else if (idade >=111) {
            return "Você já esta fazendo hora extra por aqui, meu amigo...\n";
        } else {
            return "Você inseriu algum valor errado, tente novamente.\n";
        }
    }
}
