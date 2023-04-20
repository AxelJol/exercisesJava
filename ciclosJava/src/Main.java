public class Main {
    public static void main(String[] args) {

        //EJERCICIO 1 - Sacar los números pares entre el numero 10 y el 40

        for (int i =10; i <=40; i+=2){
                System.out.println("i = " + i);
        }

        //EJERCICIO 2-  Imprimir por pantalla una cuenta regresiva desde el número 50 hasta el 0

        for(int i=50; i >= 0; i--){
            System.out.println("i = " + i);
        }

        //EJERCICIO 3 - Contar al interior cuántos números entre el 0 y el 200 son múltiplos del 20.

        for (int i=0; i <=200; i++){
            if(i % 20 !=0){
                continue;
            }
            System.out.println("i = " + i);
        }


    }
}