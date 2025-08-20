package edu.jose.vazquez.actividades.actividad5.process;

public class ModRaiz extends Potencia{
    @Override
    public int apply(int a, int b) {
        if (b <= 0) {
            throw new IllegalArgumentException("El índice debe ser mayor que 0");
        }
        int resultado = 1;
        while (true) {
            int potencia = super.apply(resultado, b);
            if (potencia > a) {
                resultado--;
                break;
            }
            resultado++;
        }
        return a - super.apply(resultado, b);
    }

}
