package main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
int numero1;
int numero2;
int suma;
String nombre;


 Scanner entrada = new Scanner(System.in);


        System.out.println("hola cual es tu nombre?");
        nombre = entrada.nextLine();

        System.out.println(nombre+" cual es el primer numero?");
        numero1 = entrada.nextInt();

        System.out.println("y el segundo numero?");
        numero2 = entrada.nextInt();

        suma = numero1 + numero2;
        System.out.println("La suma de ambos numeros es igual a "+suma);
        System.out.println("gracias por usar el programa");



    }

}
