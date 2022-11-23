/**
	Classe Expression qui déterminera si une expression est 
	soit un nombre, soit une opération concrète.
*/
public abstract class Expression {
	
	// il n'était pas possible de retourner un double sachant
	// que les opérations respectives retournent un int
	public abstract int valeur();
	
} // fin classe Expression
