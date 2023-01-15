package exceptions;
import java.util.regex.Pattern;

public class TestCredentials {
    public static void main(String[] args) {
        try {
            Credentials.checkCredentials("admin", "admin", "admin");
            Credentials.checkCredentials("админ", "аdmin", "админ");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Аутентификация не прошла");
            e.printStackTrace();
        } finally {
            System.out.println(" is fine");
        }
    }
}

