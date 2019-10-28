
/* Boucle i initialisé à 1 allant jusqu'à 5 par incrémentation, j s'initialise à 11 et prend le double de i à chaque itération*/

public class CompteDouble {
	public static void main(String args[]) {
		for(int i = 1, j=i+10;  i<5; i++, j=i*2) {
			System.out.println("i= " + i + "  j= " + j);
		}
	}
}
