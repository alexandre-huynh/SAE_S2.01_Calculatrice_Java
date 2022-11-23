/**
	Classe abstraite, une opération nécessite deux opérandes de type Nombre
*/
public abstract class Operation {

	// Variables d'instance
	private Nombre operande1;
	private Nombre operande2;
	
	/**
		Constructeur par défaut
	*/
	public Operation(){
		
	}
	
	/**
		Constructeur champs à champs
	*/
	public Operation(Nombre nb1, Nombre nb2){
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
	public Nombre getOperande1(){
		return this.operande1;
	}
	
	/**
		Retourne la valeur de la deuxième opérande de l'opération
	*/
	public Nombre getOperande2(){
		return this.operande2;
	}
	
	// Mutateurs
	
	/**
		Permet de modifier la valeur de la première opérande
	*/
	public void setOperande1(Nombre valeur){
		this.operande1 = valeur;
	}
	
	/**
		Permet de modifier la valeur de la deuxième opérande
	*/
	public void setOperande2(Nombre valeur){
		this.operande2 = valeur;
	}
	
	// Méthode
	/**
		Méthode abstraite donnant le résultat de l'opération, 
		qui sera précisé par redéfinition dans la classe associé.
	*/
	public abstract int valeur();
	
} // fin classe Operation
