public class Moto {
    private String immatriculation;
    private String chauffeurAssigne;
    private boolean disponibilite;
    
    public Moto( String immatriculation, String chauffeurAssigne, boolean disponibilite){
        this.immatriculation = immatriculation;
        this.chauffeurAssigne = chauffeurAssigne;
        this.disponibilite = disponibilite;
    }

    public boolean avoirDisponibilite(){
        return disponibilite;
    }
    public String avoirChauffeurAssigne(){
        return chauffeurAssigne;
    }
    
    public void changerDisponibilite(boolean disponibilite){
        this.disponibilite = disponibilite;
    }
}
