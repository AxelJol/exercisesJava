import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Crear un sistema de calificaciones según se solicita.
        El usuario proporcionará un valor entre 1 y 10.
        Si está entre 9 y 10: imprimir una A
        Si está entre 8 y menor a 9: imprimir una B
        Si está entre 7 y menor a 8: imprimir una C
        Si está entre 6 y menor a 7: imprimir una D
        Si está entre 0 y menor a 6: imprimir una F
        cualquier otro valor debe imprimir: Valor desconocido*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte un valor de 0 a 10");
        int nota = Integer.parseInt(scanner.nextLine());

        if (nota >= 0 && nota <6){
            System.out.println("La calificacion es F");
        } else if (nota >= 6 && nota <7) {
            System.out.println("La calificacion es D");
        } else if (nota >= 7 && nota <8){
            System.out.println("La calificacion es C");
        } else if (nota >=8 && nota <9) {
            System.out.println("La calificacion es B");
        }else if (nota >= 9 && nota ==10){
            System.out.println("La calificacion es A");
        } else{
            System.out.println("El valor es desconocido");
        }
    }
}