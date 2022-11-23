/**
	Classe héritant de la classe abstraite Opération, 
	elle permet de faire la soustraction entre deux opérandes.
*/
public class Soustraction extends Operation{
	
	/**
		Constructeur par défaut
	*/
	public Soustraction(){

	}
	
	/**
		Constructeur champs à champs
	*/
	public Soustraction(Expression valeur1, Expression valeur2){
		super(valeur1, valeur2);
	}
	
	/**
		Constructeur par copie
	*/
	public Soustraction(Soustraction sous){
		super(sous);
	}
	
	// Méthodes
	
	/**
		Résultat de la soustraction entre les deux opérandes
	*/
	public int valeur(){
		return this.getOperande1().valeur() - this.getOperande2().valeur();
	}
	
	/**
		Affiche le calcul suivi du résultat 
	*/
	public String toString() {
		String s = "(";
		s += this.getOperande1() + " - " + this.getOperande2();
		s += ")";
		return s;
	}
	
} // fin classe Soustraction