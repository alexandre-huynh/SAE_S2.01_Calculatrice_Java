/**
	Classe héritant de la classe abstraite Opération, 
	elle permet de faire la division entre deux opérandes.
*/
public class Division extends Operation{
	
	/**
		Constructeur par défaut
	*/
	public Division(){

	}
	
	/**
		Constructeur champs à champs
	*/
	public Division(Expression valeur1, Expression valeur2){
		super(valeur1, valeur2);
	}
	
	/**
		Constructeur par copie
	*/
	public Division(Division div){
		super(div);
	}
	
	// Méthodes

	/**
		Résultat de la division entre les deux opérandes. 
		Si l'opérande deux en dénominateur est égal à 0,
		une exception ArithmeticException sera levée car 
		il est impossible de diviser par 0.
	*/
	public int valeur(){
		try {
			return this.getOperande1().valeur() / this.getOperande2().valeur();
		}
		
		catch (ArithmeticException e){ 
			System.out.println("Erreur, division par 0 impossible, resultat defini a -1: \n" + e.toString() + "\n");
			return -1;
		}
	}
	
	/**
		Affiche le calcul suivi du résultat 
	*/
	public String toString() {
		String s = "(";
		s += this.getOperande1() + " / " + this.getOperande2();
		s += ")";
		return s;
	}
	
} // fin classe Division