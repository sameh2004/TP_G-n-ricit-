package tp;

import java.util.*;

public class Banque {
    private Map<Integer, Compte<?>> comptes = new HashMap<>();

    public void ajouterCompte(Compte<?> compte) {
        comptes.put(compte.numeroCompte, compte);
    }
    public Compte<?> rechercherCompte(int numeroCompte) {
        return comptes.get(numeroCompte);
    }
    public void supprimerCompte(int numeroCompte) {
        comptes.remove(numeroCompte);
    }
    public void afficherComptesTries() {
        List<Compte<?>> listeComptes = new ArrayList<>(comptes.values());
        listeComptes.sort((c1, c2) -> Double.compare(c2.solde, c1.solde));
        for (Compte<?> compte : listeComptes) {
            compte.afficherSolde();
        }
    }
}
