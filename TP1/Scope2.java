import java.util.Scanner;

public class Scope2 {

	public static void main(String args[]) {
			int i = 0;
			Scanner nextInput = new Scanner(System.in);
			
			int min = nextInput.nextInt();
			int max = nextInput.nextInt();
			/* On entre nos valeurs minimales & maximales */
			for(i = 0; i < max+1; i++) {
				if ((i>=min) && (i!=max)) {
					System.out.print(i + ", ");
					/* Les valeures affichées sont suivis d'une virgule */
				}
				if (i == max) {
					System.out.print(i + ". ");
					/* La dernière valeur est suivie d'un point */
				}
			}
			System.out.print("\n");
	}
}
