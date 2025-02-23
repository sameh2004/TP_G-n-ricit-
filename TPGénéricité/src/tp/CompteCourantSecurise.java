package tp;

class CompteCourantSecurise<T> extends CompteCourant<T> implements Securisable {
    private String identifiant;

    public CompteCourantSecurise(int numeroCompte, double solde, T devise, double limiteAutorisation, String identifiant) {
        super(numeroCompte, solde, devise, limiteAutorisation);
        this.identifiant = identifiant;
    }

    @Override
    public boolean verifierIdentite(String identifiant) {
        return this.identifiant.equals(identifiant);
    }

    public void accederAuCompte(String identifiant) throws AccesInterditException {
        if (!verifierIdentite(identifiant)) {
            throw new AccesInterditException("Accès interdit : identifiant incorrect.");
        }
        afficherSolde();
    }

}
