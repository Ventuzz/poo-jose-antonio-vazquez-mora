package edu.jose.vazquez.actividades.actividad5.process;

public class Division extends Resta {

    @Override
    public int apply(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        int resultado = 0;
        int residuo = a;
        while (residuo >= b) {
            residuo = super.apply(residuo, b); 
            resultado++;
        }
        return resultado;
    }

}
