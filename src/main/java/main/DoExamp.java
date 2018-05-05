package main;

import java.util.Scanner;

public class DoExamp {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numInt;
        int suma = 0;


        do {
            System.out.println("hola ingresa un numero positivo o -1 para finalizar");
            numInt = entrada.nextInt();

           if (numInt > 0)
                    suma += numInt;
           if (suma >= 100)
               break;
        }

        while (numInt != -1);{
            System.out.println("sumatoria : "+suma);

        }


    }
}
