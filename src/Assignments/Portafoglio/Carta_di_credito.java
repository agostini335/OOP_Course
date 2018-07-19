package Assignments.Portafoglio;


public class Carta_di_credito {
    private String iban ;
    private float saldo ;

    public void setIban(String a) {

        this.iban = iban ;
    }

    public void add (float importo) {
        if ((saldo + importo) >= 0) {
            saldo = saldo + importo ;
            System.out.println("operazione eseguita");
        } else
            System.out.println("l'operazione non è possibile");
    }

    public float saldo(){
      return saldo ;
    }

    public String getIban() {
        return iban;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
