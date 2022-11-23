/**
	Classe abstraite héritant de la classe abstraite Expression, 
	une opération nécessite deux opérandes de type Expression 
	qui peuvent soit être une opération, soit un nombre.
*/
public abstract class Operation extends Expression{

	// Variables d'instance
	private Expression operande1;
	private Expression operande2;
	
	/**
		Constructeur par défaut
	*/
	public Operation(){
		
	}
	
	/**
		Constructeur champs à champs
	*/
	public Operation(Expression nb1, Expression nb2){
		this.operande1 = nb1;
		this.operande2 = nb2;
	}
	
	/**
		Constructeur par copie
	*/
	public Operation(Operation op){
		this.operande1 = op.getOperande1();
		this.operande2 = op.getOperande2();
	}
	
	// Accesseurs
	
	/**
		Retourne la valeur de la première opérande de l'opération
	*/
	public Expression getOperande1(){
		return this.operande1;
	}
	
	/**
		Retourne la valeur de la deuxième opérande de l'opération
	*/
	public Expression getOperande2(){
		return this.operande2;
	}
	
	// Mutateurs
	
	/**
		Permet de modifier la valeur de la première opérande
	*/
	public void setOperande1(Expression valeur){
		this.operande1 = valeur;
	}
	
	/**
		Permet de modifier la valeur de la deuxième opérande
	*/
	public void setOperande2(Expression valeur){
		this.operande2 = valeur;
	}
	
	// Méthode
	/**
		Méthode abstraite donnant le résultat de l'opération, 
		qui sera précisé par redéfinition dans la classe associé.
	*/
	public abstract int valeur();
	
} // fin classe Operation
