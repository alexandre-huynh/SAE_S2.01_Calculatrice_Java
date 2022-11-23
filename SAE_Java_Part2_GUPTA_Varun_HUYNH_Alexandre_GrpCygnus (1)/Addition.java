/**
	Classe héritant de la classe abstraite Opération, 
	elle permet de faire l'addition entre deux opérandes.
*/
public class Addition extends Operation{
	
	/**
		Constructeur par défaut
	*/
	public Addition(){

	}
	
	/**
		Constructeur champs à champs
	*/
	public Addition(Expression valeur1, Expression valeur2){
		super(valeur1, valeur2);
	}
	
	/**
		Constructeur par copie
	*/
	public Addition(Addition ad){
		super(ad);
	}
	
	// Méthodes
	
	/**
		Résultat de l'addition entre les deux opérandes
	*/
	public int valeur(){
		return this.getOperande1().valeur() + this.getOperande2().valeur();
	}
	
	/**
		Affiche le calcul suivi du résultat 
	*/
	public String toString() {
		String s = "(";
		s += this.getOperande1() + " + " + this.getOperande2();
		s += ")";
		return s;
	}
	
} // fin classe Addition
