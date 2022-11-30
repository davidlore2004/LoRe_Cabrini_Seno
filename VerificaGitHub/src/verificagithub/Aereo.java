package verificagithub;

public class Aereo extends Aeroporto{
    
    String codice;
    int nPosti;
    String marca;
    String modello;
    Aereo[] aeroplano;
    
    
    public Aereo(){}
    
    public Aereo(String codice, int nPosti, String marca, String modello){
        
        this.modello = modello;
        
        this.nPosti = nPosti;
        
        this.marca = marca;
        
        this.codice = codice;
        
        this.aeroplano = new Aereo[super.getN_aerei()];
      
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public int getnPosti() {
        return nPosti;
    }

    public void setnPosti(int nPosti) {
        this.nPosti = nPosti;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }
    
    
    @Override
    public String toString(){
        
        return "L'aeroporto di " + super.getCittà() + " ha una superficie di " + super.getSuperficie() + ". ";
    }
}
