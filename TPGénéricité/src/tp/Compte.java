package tp;

public class Compte<T> {
	protected int numeroCompte;
	protected double solde;
	protected T devise;
	public Compte(int numeroCompte,double solde,T devise) {
		this.devise=devise;
		this.numeroCompte=numeroCompte;
		this.solde=solde;
}
	public void deposer(double montant) {
	this.solde+=montant;
	}
	public void retirer(double montant) {
		this.solde-=montant;
	}
	public void afficherSolde() {
		System.out.println("le Solde du comte n° "+numeroCompte+"est "+solde);
	}
	public static <T> void transferer(Compte<T> emet ,Compte<T> dest,double montant){
		if (emet.solde>montant) {
			emet.retirer(montant);
			dest.deposer(montant);
		}
		else
			System.out.println("Solde insuffisant");
	}
}
