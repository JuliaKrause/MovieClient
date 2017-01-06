package at.technikumwien;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 * Created by Julia on 06.01.2017.
 */
public class MoviesAuthenticator {
    private MoviesAuthenticator() {

    }

    public static void setAsDefault(String username, String password) {
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password.toCharArray());
            }
        });
    }
}
