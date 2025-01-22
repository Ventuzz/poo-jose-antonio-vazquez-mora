package edu.jose.vazquez.actividades.actividad2.challenge;

public class FindDuplicateCharacter {
    public static void main(String[] args) {
        String str = "HELLO ";
        System.out.println(findDuplicate(str));
    }

    public static String findDuplicate(String str) {
        String duplicates = "";
        int position = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    if (!duplicates.contains(String.valueOf(str.charAt(i))) && str.charAt(i) != ' ') {
                        duplicates += str.charAt(i) + " ";
                        position = str.indexOf(str.charAt(i));
                    }
                }
            }
        }
        return position + " " + duplicates;
    }
}
