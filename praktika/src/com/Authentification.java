package com;
import java.util.Scanner;
public class Authentification {

    private static final String LOGIN = "admin";
    private static final String PASSWORD = "1234";

    public static void authentificate() {
        Scanner s = new Scanner(System.in);

        boolean isLoginSuccess = false;

        while (!isLoginSuccess) {
            System.out.print("Login: ");
            var login = s.nextLine();

            System.out.print("Password: ");
            var password = s.nextLine();

            if (login.equals(LOGIN) & password.equals(PASSWORD)) {
                System.out.println("Authentification successfull");
                break;
            } else {
                System.out.println("Incorrect login/password");
            }
        }
    }
}