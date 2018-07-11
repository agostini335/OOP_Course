package day0;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        String n;
        String c;
        Persona andrea ;
        andrea=new Persona(1);
        Persona dario = new Persona(2) ;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("inserisci nome persona " + (i + 1));
            n = sc.next();
            System.out.println("inserisci cognome persona " + (i + 1));
            c = sc.next();
            if (i == 0) {
                andrea.setNome(n);
                andrea.setCognome(c);
            } else {
                dario.setNome(n);
                dario.setCognome(c);
            }
        }

        System.out.println("il nome della prima persona è " + andrea.getNome());
        System.out.println("il cognome della prima persona è " + andrea.getCognome());
        System.out.println("il nome della seconda persona è " + dario.getNome());
        System.out.println("il cognome della seconda persona è " + dario.getCognome());
    }
}
