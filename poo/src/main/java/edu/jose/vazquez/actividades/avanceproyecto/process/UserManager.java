package edu.jose.vazquez.actividades.avanceproyecto.process;

import edu.jose.vazquez.actividades.avanceproyecto.models.Users;
import java.util.ArrayList;

public class UserManager {

    ArrayList<Users> users;
    

    public UserManager(){
        this.users = new ArrayList<>();
        addUser("admin", "admin");
    }

    public void addUser(String username, String password){
        Users newUser = new Users(username, password);
        users.add(newUser);
    }

    public ArrayList<Users> getUsers(){
        return this.users;
    }

    public boolean validateUser(String username, String password) {
        for (Users user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

}
    /**
     *     public static boolean validateName(String username, String password){
        String storedName;
        boolean isValid = false;
        for(String nameToValidate: Users.){
            if(nameToValidate.toLowerCase().equals(storedName)){
                isValid = true;
                break;
            }
        }
        return isValid;
    }
    */

