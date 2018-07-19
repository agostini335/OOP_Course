package Assignments.Portafoglio;


public class Banconota {
    private Valuta valuta ;
    private float taglia  ;
    private int anno ;

    public void setBanconota(Valuta valuta, float taglia, int anno) {
        this.valuta = valuta ;
        this.taglia = taglia ;
        this.anno = anno ;
    }

    public Valuta getValuta() {
        return valuta;
    }

    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }

    public float getTaglia() {
        return taglia;
    }

    public void setTaglia(float taglia) {
        this.taglia = taglia;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }
}
