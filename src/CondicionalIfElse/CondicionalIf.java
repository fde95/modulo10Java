package CondicionalIfElse;

/**
 * @author felipe.espinoza
 * @version 1.0
 */

/*
    IF, ELSE e ELSE IF

    São tomadas de dcisões que definem o que é verdadeiro e o que é falso.

    IF significa que a instrução é verdadeira e ELSE que é falsa.

    Se (IF) for tal coisa, faça isso, caso contrário (else), faça aquela
    outra coisa. O IF pode ser declarado sozinho mas o else só pode ser
    definido se o if for definido primeiro. Em conjunto com os controles
    de fluxo utilizamos os operadores lógicos.
 */

public class CondicionalIf {

    public static void main(String[] args){

        //Exemplo 1
        System.out.println("\n***Exemplo 1***");
        int exemplo1 = 2;

        if (exemplo1 > 1){
            System.out.println("Seu resultado é maior que 1");
        } else {
            System.out.println("Seu resultado é menor que 1");
        }

        //Exemplo 2
        System.out.println("\n***Exemplo 2 ***");
        int exemplo2 = 0;

        if (exemplo2 > 1 && exemplo2 < 5){
            System.out.println("Seu resultado é maior que 1 e menor que 5");
        } else if (exemplo2 >= 5 && exemplo2 < 8) {
            System.out.println("Seu resultado é meior ou igual a 5 ou menor que 8");

        } else {
            System.out.println("Seu resultado é " + exemplo2);
        }
    }
}
