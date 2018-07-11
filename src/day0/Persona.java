package day0;

public class Persona {
    private long codice ;
    private String nome ;
    private String cognome;

    public Persona(int codice){
        nome="la persona non ha un nome";
        this.codice=(long) codice;
    }

    public void setCodice (long l) {
        codice = l ;
    }
    public long getCodice () {
        return codice ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
}
