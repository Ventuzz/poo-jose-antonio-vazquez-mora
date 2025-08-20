package edu.jose.vazquez.actividades.actividad5.process;

public class Modulo extends Resta{
    public int apply(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        int residuo = a;
        while (residuo >= b) {
            residuo = super.apply(residuo, b); 
        }
        return residuo;
    }
}
