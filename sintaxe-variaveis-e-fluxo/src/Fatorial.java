
public class Fatorial {

	public static void main(String[] args) {
		
		//fatorial de um n�mero n � n * n-1 * n-2 ... at� n = 1.
		
		int n = 1;
		
		for (int i = 1; i < 11; i++) {
					
			n *= i;
			System.out.println(n);
		}

	}

}
