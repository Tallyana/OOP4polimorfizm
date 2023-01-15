package exceptions;

import java.util.regex.Pattern;

public class Credentials {
    public  static void  checkCredentials(String login, String password, String confirmPassword)
            throws WrongPasswordException {

        if (!stringCorrect(login)) {
            throw new WrongPasswordException("Логин указан неверно.");
        }

           if(stringCorrect(password) && password.equals(confirmPassword)){
               System.out.println("Логин и пароль указаны корректно");
           } else {
               throw new WrongPasswordException("Пароль указан неверно");
           }
    }
    private  static  boolean stringCorrect(String checkString){
                if (checkString == null
                || checkString.isEmpty()
                || checkString.isBlank()
                || checkString.length()>20){
                    return false;
                }
                return Pattern.matches("[a-zA-Z0-9_]*$",checkString);
    }

}
