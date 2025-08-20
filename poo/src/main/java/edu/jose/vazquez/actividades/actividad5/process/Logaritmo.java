package edu.jose.vazquez.actividades.actividad5.process;

public class Logaritmo extends Division{

    @Override
    public int apply(int a, int b) {
        if(a < 0 || b < 0){
            throw new IllegalArgumentException("No se puede calcular el logaritmo de un número negativo");
        }
        if(a == 0){
            throw new IllegalArgumentException("No se puede calcular el logaritmo de 0");
        }
        if(b == 0){
            throw new IllegalArgumentException("No se puede calcular el logaritmo en base 0");
        }
        if(b == 1){
            throw new IllegalArgumentException("No se puede calcular el logaritmo en base 1 porque sería");
        }
        int result = 0;
        int temp = a;
        while (temp >= b) {
            temp = super.apply(temp, b);
            result++;
        }
        return result;
    }

}
