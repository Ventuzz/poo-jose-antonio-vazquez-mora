package edu.jose.vazquez.actividades.actividad5.process;

public class Potencia extends Multiplicacion {

    @Override
    public int apply(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = super.apply(result, a);
        }
        return result;
    }

}
