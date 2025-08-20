package edu.jose.vazquez.actividades.actividad5.process;

public class Raiz extends Potencia {

    @Override
    public int apply(int a, int b) {
        int closest = 0;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= a; i++) {
            int power = super.apply(i, b);
            int diff = (power > a) ? (power - a) : (a - power);
            if (diff < minDiff) {
                minDiff = diff;
                closest = i;
            }
            if (power > a) {
                break;
            }
        }
        return closest;
    }

}
