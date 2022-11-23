public class Calculatrice {

	public static void main(String[] args){
		
		try {
			// Expression à deux opérations
			Expression deux = new Nombre(2) ;
			Expression trois = new Nombre(3) ;
			Expression dixSept = new Nombre(17) ;
			Expression s = new Soustraction(dixSept, deux) ;
			Expression a = new Addition(deux, trois) ;
			Expression d = new Division(s, a) ;
			System.out.println(d + " = " + d.valeur()) ; // affiche ((17 - 2) / (2 + 3)) = 3 
			
			// Expression à une opération et un nombre
			Expression moinsCinq = new Nombre(-5) ;
			Expression dix = new Nombre(10) ;
			Expression s2 = new Soustraction(dix, moinsCinq) ;
			Expression a2 = new Addition(s2,dixSept);
			System.out.println(a2 + " = " + a2.valeur()) ; // affiche ((10 - -5) + 17) = 32 
			
			// Expression à deux nombres
			Expression m = new Multiplication(moinsCinq,trois);
			System.out.println(m + " = " + m.valeur()) ; // affiche (-5 x 3) = -15
		
			// Expression avec division impossible par zéro
			Expression zero = new Nombre() ;
			Expression d2 = new Division(deux,zero);
			System.out.println(d2 + " = " + d2.valeur()) ; // affiche l'exception de la classe Division puis (2 / 0) = -1
		}
		catch (Exception e) {
			System.out.println("Erreur detecte: " + e.toString());
		}
	}  
} // fin classe CalculatriceSimple