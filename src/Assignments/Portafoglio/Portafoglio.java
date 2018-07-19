package Assignments.Portafoglio;

import java.util.ArrayList;

import java.util.List;

public class Portafoglio {
    private String propietario ;
    private ArrayList banconote;
    private ArrayList carte_di_credito;
    private int n_banconote = 0;
    private int n_carte = 0 ;
    private boolean succes  ;

    public Portafoglio(){
        banconote=new ArrayList();
    }


    public void add(Valuta a , float b , int c) {
        //banconote.set(n_banconote, new Banconota());
        banconote.add(new Banconota()) ;
        Banconota k =(Banconota) banconote.get(n_banconote);
        k.setBanconota(a,b,c);
        n_banconote++ ; // n_banconote = banconote.size()
    }

    public void add(String d) {
        //carte_di_credito [n_carte] = new Carta_di_credito() ;
        carte_di_credito.add(new Carta_di_credito());
        ((Carta_di_credito) carte_di_credito.get(n_carte)).setIban(d)   ;
        n_carte++ ; // n_carte = carte_di_credito.size()
    }
    public boolean remove(Valuta e , float f , int g) {
        succes = false;
        for (int i = 0 ; i < (n_banconote +1) ; i++) {
            Banconota k =(Banconota) banconote.get(i);
            if (k.getValuta() == e && k.getTaglia() == f && k.getAnno() == g) {
                banconote.remove(i) ;
                succes = true ;
                i = n_banconote + 1 ;
            }
        }
        if (succes) {
            n_banconote-- ;
        }
        return succes ;
    }
    public boolean remove(String h) {
        succes = false ;
        for (int i = 0 ; i < (n_carte + 1) ; i++) {
            if ( ((Carta_di_credito) carte_di_credito.get(i)).getIban()  == h) {
                carte_di_credito.remove (i) ;
                succes = true ;
                i = n_carte + 1 ;
            }
        }
        if (succes) {
            n_carte-- ;
        }
        return succes ;
    }
    public boolean carica(String l , float m) {
        succes = false ;
        for (int i = 0; i < (n_carte + 1); i++) {
            if (((Carta_di_credito) carte_di_credito.get(i)).getIban() == l) {
                ((Carta_di_credito) carte_di_credito.get(i)).add(m);
                succes = true ;
                i = n_carte + 1 ;
            }
        }
        return succes ;
    }
    //public float count(Valuta)






}

