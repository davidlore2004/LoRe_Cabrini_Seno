
package verificagithub;

public class Aeroporto {
    
    private String città;
    private int n_aerei;
    private int n_piloti;
    private double superficie;
    Aeroporto[] aerei;
    Aeroporto[] piloti;
    
    public Aeroporto(){}
    public Aeroporto(String città,double superficie, Aeroporto[] aerei, Aeroporto[] piloti,int n_aerei,int n_piloti)
    {
        this.città = città;
        this.superficie = superficie;
        this.aerei = new Aeroporto[n_aerei];
        this.piloti = new Aeroporto[n_piloti];
        this.n_aerei = n_aerei;
        this.n_piloti = n_piloti;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public int getN_aerei() {
        return n_aerei;
    }

    public void setN_aerei(int n_aerei) {
        this.n_aerei = n_aerei;
    }

    public int getN_piloti() {
        return n_piloti;
    }

    public void setN_piloti(int n_piloti) {
        this.n_piloti = n_piloti;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public Aeroporto[] getAerei() {
        return aerei;
    }

    public void setAerei(Aeroporto[] aerei) {
        this.aerei = aerei;
    }

    public Aeroporto[] getPiloti() {
        return piloti;
    }

    public void setPiloti(Aeroporto[] piloti) {
        this.piloti = piloti;
    }
    
    @Override
    public String toString()
    {
        return "L'aeroporto di " + città + " ha una superficie di: " + superficie;
    }
    
    
}
