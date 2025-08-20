package edu.jose.vazquez.actividades.actividad5.process;

public class ModLog extends Division{
    
    @Override
    public int apply(int a, int b) {
        if (a < 0 || b < 0) {
            throw new ArithmeticException("Negative numbers are not allowed");
        }
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        if(a == 0){
            throw new IllegalArgumentException("No se puede calcular el logaritmo de 0");
        }
        if(b == 1){
            throw new IllegalArgumentException("No se puede calcular el logaritmo en base 1 porque sería infinito");
        }
        int result = a;
        while (result >= b) {
            result = super.apply(result, b);
        }
        return result;
    }

}
