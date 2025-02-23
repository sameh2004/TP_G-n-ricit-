package tp;

public class Test {
    public static void main(String[] args) {
        Banque banque = new Banque();
        CompteCourant<String> c_courant = new CompteCourant<>(1, 5000, "TND", 1000);
        CompteEpargne<String> c_epargne = new CompteEpargne<>(2, 3000, "EUR", 0.04);
        CompteCourantSecurise<String> c_courant_s = new CompteCourantSecurise<>(3, 4000, "TND", 500, "user123");

        banque.ajouterCompte(c_courant);
        banque.ajouterCompte(c_epargne);
        banque.ajouterCompte(c_courant_s);

        c_epargne.calculerInteret();
        Compte.transferer(c_courant, c_epargne, 500);

       

        banque.afficherComptesTries();
    }
}