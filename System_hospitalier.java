package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {

    private List<Requête> listRequetes;

    public System_hospitalier(List<Requête> listRequetes) {
        super();
        this.listRequetes = listRequetes;
    }

    public System_hospitalier() {
        super();
        listRequetes = new ArrayList<>();
    }

    public List<Requête> getListRequetes() {
        return listRequetes;
    }

    public void setListRequetes(List<Requête> listRequetes) {
        this.listRequetes = listRequetes;
    }

    public void recevoirRequete(Requête requete) {
        listRequetes.add(requete);
        String analyse =  analyserRequete(requete);
        String comparaisonDonnees = comparerDonnes();
        System.out.println(analyse);
        System.out.println(comparaisonDonnees);
    }

    private String analyserRequete(Requête requête) {
    //Cette methode analyse la requete reçue.
    // Elle extrait les informations nécessaires de la requête
    // et les prépare pour le traitement ultérieur
    // Par exemple, elle peut extraire les symptômes et les données du patient.
    // Code existant de la méthode        
        return "requête analysée";
    }

    private String comparerDonnes() {
    // Cette méthode compare les données fournies avec les données existantes.
    //Elle peut être utilisée pour vérifier la cohérence ou la validité des données
    //Par exemple, elle peut comparé les symptômes actuels avec ceux enregistrés précédemment
    //Code existant de la méthode        
        return "Cluster trouvé";
    }
}

