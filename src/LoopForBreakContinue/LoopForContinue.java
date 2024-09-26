package LoopForBreakContinue;
/**
 * @author felipe.espinoza
 * @version 1.0
 */

public class LoopForContinue {

    public static void main (String[] args){
        for (int contador = 1; contador <=100; contador++){
            if (contador % 20 != 0) {
                continue;
            }
            System.out.println("Contador: "+contador);
        }
    }
}
