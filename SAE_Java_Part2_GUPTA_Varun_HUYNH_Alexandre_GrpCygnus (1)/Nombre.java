/**
	Classe Nombre héritant de la classe abstraite Expression
*/
public class Nombre extends Expression{
	
	// Variable d'instance
	private int valeurNombre;
	
	/**
		Constructeur par défaut
	*/
	public Nombre(){
		this.valeurNombre = 0;
	}
	
	/**
		Constructeur champs à champs
	*/
	public Nombre(int valeur){
		this.valeurNombre = valeur;
	}
	
	/**
		Constructeur par copie
	*/
	public Nombre(Nombre unNombre){
		this.valeurNombre = unNombre.getValeurNombre();
	}
	
	// Accesseurs
	
	/**
		Retourne la valeur du nombre 
	*/
	public int getValeurNombre(){
		return this.valeurNombre;
	}
	
	// Mutateurs
	
	/**
		Permet de modifier la valeur du nombre
	*/
	public void setValeurNombre(int valeur){
		this.valeurNombre = valeur;
	}
	
	// Méthodes
	
	/**
		Retourne la valeur du nombre 
	*/
	public int valeur(){
		return this.getValeurNombre();
	}
	
	/**
		Affiche la valeur du nombre 
	*/
	public String toString() {
		String s = "";
		s += this.getValeurNombre();
		return s;
	}
	
} // fin classe Nombre
