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
	public Addition(Nombre valeur1, Nombre valeur2){
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
		int somme = 0;
		int a = (this.getOperande1()).getValeurNombre();
		int b = (this.getOperande2()).getValeurNombre();
		somme = a + b;
		return somme;
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
