package edu.jose.vazquez.actividades.actividad2.models;

//Clase que genera los números pares del 2 al 100 y los almacena en un arreglo de enteros
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

    

}
