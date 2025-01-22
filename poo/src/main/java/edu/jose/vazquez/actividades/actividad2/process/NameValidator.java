package edu.jose.vazquez.actividades.actividad2.process;
import edu.jose.vazquez.actividades.actividad2.models.Data;

//Clase que valida si el nombre ingresado se encuentra en la lista de nombres almacenados en la clase Data
public class NameValidator {
    public static boolean validateName(String name){
        String storedName = name.toLowerCase();
        boolean isValid = false;
        for(String nameToValidate: Data.nombres){
            if(nameToValidate.toLowerCase().equals(storedName)){
                isValid = true;
                break;
            }
        }
        return isValid;
    }

}
