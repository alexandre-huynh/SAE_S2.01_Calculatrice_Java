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
	public Soustraction(Nombre valeur1, Nombre valeur2){
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
		int diff = 0;
		int a = (this.getOperande1()).getValeurNombre();
		int b = (this.getOperande2()).getValeurNombre();
		diff = a - b;
		return diff;
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