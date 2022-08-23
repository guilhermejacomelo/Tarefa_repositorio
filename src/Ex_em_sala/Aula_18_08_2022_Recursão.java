package Ex_em_sala;

import java.util.*;

public class Aula_18_08_2022_Recursão {
    public static void main(String[] args) {

        int numero = 0;

        Scanner read = new Scanner(System.in);

        System.out.println("Entre com um valor: ");
        numero = read.nextInt();

        System.out.println("O fatorial de " + numero + " é " + Recursao(numero) + ".");

    }

    private static Integer Recursao(int valor){

        if(valor <= 1){
            return 1;
        } else {
            valor = valor * Recursao(valor - 1);

            return valor;
        }
    }

}
