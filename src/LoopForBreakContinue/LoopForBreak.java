package LoopForBreakContinue;
/**
 * @author felipe.espinoza
 * @version 1.0
 */

public class LoopForBreak {

    public static void main (String[] args){
        for (int contador = 1; contador <=1000; contador++){
            System.out.println("Esta é a repetição nº"+contador);

            if (contador==10)
                break;
        }
    }
}
