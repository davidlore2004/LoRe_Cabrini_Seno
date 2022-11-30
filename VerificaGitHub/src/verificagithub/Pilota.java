
package verificagithub;

public class Pilota extends Aeroporto{
    private int nPatente;
    private String nome;
    private String cognome;
    private String ruolo;

    public Pilota(int nPatente, String nome, String cognome, String ruolo) {
        this.nPatente = nPatente;
        this.nome = nome;
        this.cognome = cognome;
        this.ruolo = ruolo;
    }

    public int getnPatente() {
        return nPatente;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setnPatente(int nPatente) {
        this.nPatente = nPatente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }
    
    @Override
    public String toString()
    {
        return "L'aeroporto di " + super.getCittà() + " ha una superficie di " + super.getSuperficie() + ". Gli aerei che sono disponibili sono: " + super.getAerei() + ".";
    }
    
}
