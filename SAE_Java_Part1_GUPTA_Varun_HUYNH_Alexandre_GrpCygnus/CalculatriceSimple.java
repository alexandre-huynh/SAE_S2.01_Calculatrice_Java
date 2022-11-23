/**
	Cette classe main modélise une calculatrice utilisant les différents opérations arithmétiques: 
	l'addition, la soustraction, la multiplication et la division.
	Le cas de la division par zéro est référencé et renvoi une erreur et retourne -1.
*/
public class CalculatriceSimple {

	public static void main(String[] args){
		
		try {
			Nombre quatre = new Nombre(4);
			Nombre six = new Nombre(6);
			Nombre zero = new Nombre(0);
			System.out.println(quatre);
			System.out.println(six);
			
			// Addition
			System.out.println("--- Addition ---");
			Operation s1 = new Addition(quatre, six); 
			System.out.println(s1 + " = " + s1.valeur() + "\n");
			
			// Soustraction
			System.out.println("--- Soutraction ---");
			Operation s2 = new Soustraction(quatre, six); 
			System.out.println(s2 + " = " + s2.valeur() + "\n");
			
			// Multiplication
			System.out.println("--- Multiplication ---");
			Operation s3 = new Multiplication(quatre, six); 
			System.out.println(s3 + " = " + s3.valeur() + "\n");
			
			// Division
			System.out.println("--- Division ---");
			Operation s4 = new Division(quatre, six); 
			System.out.println(s4 + " = " + s4.valeur() + "\n");
			
			// Division zero
			System.out.println("--- Division par zero---");
			Operation s5 = new Division(quatre, zero); 
			System.out.println(s5 + " = " + s5.valeur() + "\n");
		}
		
		catch (Exception e) {
			System.out.println("Erreur detecte: " + e.toString());
		}
		
	}  
} // fin classe CalculatriceSimple
