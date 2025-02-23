package tp;

public class CompteEpargne<T> extends Compte<T> {
	protected  double tauxinteret;
	public CompteEpargne(int numeroCompte,double solde,T devise,double tauxinteret) {
		super(numeroCompte,solde,devise);
		this.tauxinteret=tauxinteret;
	}
	public void calculerInteret() {
		solde+=solde*tauxinteret/100;
	}
	public void afficherSolde() {
		System.out.println("Copmte Epargne-Solde: "+solde+" "+devise);
	}

}
