package Assignments.Ciclista;

public class Ciclista {
    private String nome ;
    private String cognome ;
    private int n ;
    private float tot = 0 ;
    private float[] attività = new float[10] ;

    public void setNome (String nome) {
        this.nome = nome ;
    }
    public void setCognome (String cognome) {
        this.cognome = cognome ;
    }

    public  void setAttività (int n , float a) {
        this.n = n;
        if (attività[n-1] == 0 && n < 11 && n > 0) {
            attività[n-1] = a ;
            tot = tot + attività[n] ;
        } else System.out.println("attivià " + n + " già caricata");

    }
    public float totalekm () {
        return tot ;
    }

}
