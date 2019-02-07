
public class TesteIR {

	public static void main(String[] args) {
	
		double salario = 4664.69;

        //ifs aqui
		if (salario < 1903.99) {
			System.out.println("sem desconto");
		}
		
		if (salario >= 1903.99 && salario <= 2826.65) {
			System.out.println("Desconto de 7,5%");
		}
		if (salario >= 2826.66  && salario <= 3751.05) {
			System.out.println("Desconto de 15%");
		}
		if (salario >= 3751.06 && salario <= 4664.68) {
			System.out.println("Desconto de 22,5%");
		}		
		if (salario > 4664.68) {
			System.out.println("Desconto de 27,5%");
		}	
	}
}
