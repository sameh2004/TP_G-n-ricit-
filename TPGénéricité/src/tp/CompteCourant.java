package tp;

public class CompteCourant<T> extends Compte<T> {
	protected double limite;
	public  CompteCourant(int numeroCompte,double solde,T devise,double limite) {
		super(numeroCompte,solde,devise);
		this.limite=limite;
	}
	public void retirer(double montant) {
		if(solde-montant>=limite)
			solde-=montant;
		else
			System.out.println("Retrait impossible  limite  dépassée");
	}
	public void afficherSolde() {
		System.out.println("Compte Courant-Solde: "+solde+" "+devise);
	}

}
