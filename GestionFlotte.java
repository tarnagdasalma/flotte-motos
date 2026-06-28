import java.util.ArrayList;
import java.util.List;

public class GestionFlotte {
    private List<Moto> motos = new ArrayList<>();

    public void ajouterMoto(Moto m) {
        motos.add(moto);
    }

    public void assignerChauffeur(Moto m, chauffeur c) {
        if (m.avoirDisponibilite()) {
            m.changerChauffeurAssigner(c.getNom());
            m.changerDisponiblilite(false);
            System.out.println("Chauffeur assigne ")
        } else {
            System.out.println("Moto indisponible");
        }
    }
}