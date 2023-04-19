package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //EJERCICIO 1 - Calcular el área y el perímetro de un Rectángulo

        /*
        Scanner rectangulo = new Scanner(System.in);
        System.out.println("Proporcione el valor de alto");
        int alto = rectangulo.nextInt();
        System.out.println("Proporcione el valor de ancho");
        int ancho = rectangulo.nextInt();

        int area = alto * ancho;
        System.out.println("El area es = " + area);

        int perimetro = (alto+ancho)*2;
        System.out.println("El perimetro es = " + perimetro);
         */

        //EJERCICIO 2 - Solicitar al usuario dos valores, y determinar cual número es el mayor

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero 1");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingresa el numero 2");
        int numero2 = Integer.parseInt(scanner.nextLine());

        /*if(numero1 > numero2){
            System.out.println("El numero 1 es mayor con el valor de " + numero1);
        }else{
            System.out.println("El numero 2 es con el valor de " + numero2);
        }*/

        System.out.println("El numero mayor es: " + (numero1 > numero2 ? numero1 : numero2));

    }
}