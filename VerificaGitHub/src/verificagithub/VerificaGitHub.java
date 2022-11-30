
package verificagithub;

import java.util.Scanner;

public class VerificaGitHub {

    public static void main(String[] args) {

                
        Scanner input = new Scanner(System.in);
        
        String città;
        int n_aerei;
        int n_piloti;

        String codice;
        int nPosti;
        String marca;
        String modello;
             
        int patente;
        String nome;
        String cognome;
        String ruolo;
        int nPatente;
        
        System.out.println("\nInserire città aeroporto: ");
        città = input.nextLine();
        
        System.out.println("\nInserire numero aerei: ");
        n_aerei = input.nextInt();
        
        Aeroporto[] aerei = new Aeroporto[n_aerei];
        
        System.out.println("\nInserire numero piloti: ");
        n_piloti = input.nextInt();
        
        Pilota[] piloti = new Pilota[n_piloti];
        
        System.out.println("\nInserire l'aereo: ");
        n_aerei = input.nextInt();
        
        Aereo[] aeroplano = new Aereo[n_aerei];
        
        
        for(int i = 0; i < n_piloti; i++)
        {
            System.out.println("\nInserire la patente del " + (i+1) + "° pilota: ");
            nPatente = input.nextInt();
            
            System.out.println("\nInserire il nome del " + (i+1) + "° pilota: ");
            nome = input.nextLine();
            
            System.out.println("\nInserire il cognome del " + (i+1) + "° pilota: ");
            cognome = input.nextLine();
            
            System.out.println("\nInserire il ruolo del " + (i+1) + "° pilota: ");
            ruolo = input.nextLine();
            
            piloti[i].setnPatente(nPatente);
            piloti[i].setNome(nome);
            piloti[i].setCognome(cognome);
            piloti[i].setRuolo(ruolo);           
        }
        
        for(int i = 0; i < n_aerei; i++){
        System.out.println("\nInserire: codice aereo: ");
        codice = input.nextLine();
        
        System.out.println("\nInserire numero posti aereo: ");
        nPosti = input.nextInt();
        
        System.out.println("\nInserire marca aereo: ");
        marca = input.nextLine();
        
        System.out.println("\nInserire modello aereo: ");
        modello = input.nextLine();
        
        System.out.println("\nInserire marca aereo: ");
        marca = input.nextLine();
        
        aeroplano[i].setCodice(codice);
        aeroplano[i].setModello(modello);
        aeroplano[i].setnPosti(nPosti);
        aeroplano[i].setMarca(marca);   
        
        }
        
        
        for(int i = 0; i < n_aerei; i++)   
            aeroplano[i].toString();
                
        for(int i = 0; i < n_piloti; i++)
            piloti[i].toString();
    }
    
}
