public class Promote {

	public static void main(String args[]) {
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;
		double resultat = ((f * b) + (i / c) - (d * s));
		
		System.out.print((double)(f * b) + " + " + (i / c) +  " - " + (d * s));
		System.out.println(" = " + resultat);
		/* Affiche le calcul de la variable resultat avant d'aller à la ligne pour afficher le résultat */
		byte b2 = 10;
		byte b3 = (byte) (b2 * b);
		
		System.out.println("b = " + b);
		System.out.println("b2 = " + b2);
		System.out.println("b3 = " + b3);
		
		/* b3 stockes b2 * b, puis on affiche b, b2 et b3 */
		
	}
}
