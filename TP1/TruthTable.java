
public class TruthTable {

	public static void main(String args[]) {
		
		boolean a;
		boolean b;
		int i = 0;
		
		for(i = 0; i < 5; i++) {
			/* Ici on réalise une boucle, qui, à chaque itération va modifier les valeurs a & b afin de les calculer et les afficher */
			if (i == 0) {
				System.out.println("  a" + "    " + " b" + "   " +"a and b"+"   "+"a or b"+"   "+"a xor b");
			}
			else if(i == 1) {
				a = false;
				b = false;
				System.out.println(a + " " + b + "  " + (a & b) + "    " + (a || b) + "     " + (a ^ b) );
			}
			else if(i == 2) {
				a = true;
				b = false;
				System.out.println(a + "  " + b + "  " + (a & b) + "    " + (a || b) + "      " + (a ^ b) );
			}
			else if(i == 3) {
				a = false;
				b = true;
				System.out.println(a + " " + b + "   " + (a & b) + "    " + (a || b) + "      " + (a ^ b) );
			}
			else if(i == 4) {
				a = true;
				b = true;
				System.out.println(a + "  " + b + "   " + (a & b) + "     " + (a || b) + "      " + (a ^ b) );
			}
		}
	}
}
