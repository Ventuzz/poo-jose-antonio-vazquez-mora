package edu.jose.vazquez.actividades.actividad2.process;
import edu.jose.vazquez.actividades.actividad2.models.Name;

public class NameValidator {
    public static boolean validateName(String name){
        String storedName = name.toLowerCase();
        boolean isValid = false;
        for(String nameToValidate: Name.nombres){
            if(nameToValidate.toLowerCase().equals(storedName)){
                isValid = true;
                break;
            }
        }
        return isValid;
    }

}
