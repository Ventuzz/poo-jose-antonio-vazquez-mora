package edu.jose.vazquez.actividades.actividad2.challenge;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
