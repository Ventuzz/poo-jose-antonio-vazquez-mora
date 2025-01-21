package edu.jose.vazquez.actividades.actividad2.models;


public class Number {

    public static int[] generarNumerosPares() {
        int[] numerosPares = new int[50]; // Hay 50 números pares entre 2 y 100
        int index = 0;

        // Llenar el arreglo con números pares
        for (int i = 2; i <= 100; i += 2) {
            numerosPares[index] = i;
            index++;
        }
        return numerosPares;
    }

    public static void mostrarNumeros(int[] numeros) {
        System.out.println("╔═════════════════════════════╗");
        System.out.println("║ Números pares del 2 al 100: ║");
        System.out.println("╚═════════════════════════════╝");
        for (int i=0; i< numeros.length; i++){ 
            System.out.printf("%6d",numeros[i]);
            if((i+1)%10==0){
                System.out.println();
            }
        }
    }

}
