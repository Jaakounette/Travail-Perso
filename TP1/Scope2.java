import java.util.Scanner;

public class Scope2 {

	public static void main(String args[]) {
			int i = 0;
			Scanner nextInput = new Scanner(System.in);
			
			int min = nextInput.nextInt();
			int max = nextInput.nextInt();

			for(i = 0; i < max+1; i++) {
				if ((i>=min) && (i!=max)) {
					System.out.print(i + ", ");
				}
				if (i == max) {
					System.out.print(i + ". ");
				}
			}
			System.out.print("\n");
	}
}
