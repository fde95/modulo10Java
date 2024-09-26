package CondicionalIfElse;

import java.util.Scanner;

/**
 * @author felipe.espinoza
 * @version 1.0
 */

public class CondicionalIfLeituraConsoleAnimal {

    public static void main(String[] args){
        Scanner valorDigitado = new Scanner(System.in);

        System.out.println("Por favor, insira a espécie do seu animal:");
        String especieAnimal = valorDigitado.next();
        String tipoAnimal = verificacaoEspecie(especieAnimal);
        System.out.println(tipoAnimal);
    }

    public static String verificacaoEspecie(String tipoAnimal) {
        String result;
        if (tipoAnimal.equals("Cachorro") || tipoAnimal.equals("Gato")){
            result = "Seu animal é do tipo doméstico";
        } else if (tipoAnimal.equals("Peixe") || tipoAnimal.equals("Passarinho")) {
            result = "Seu animal é doméstico, porém pouco comum";
        } else{
            result = "Seu animal é desconhecido";
        }
        return result;
    }
}
