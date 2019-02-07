
public class TestaPontoFlutuante {
	
	public static void main (String[] args) {
		
		double salario = 2300.99;
		
		System.out.println("meu salario é " + salario);
		
		double idade = 23; //int não aceira double
		
		double divisao = 3.14/2;		
		System.out.println(divisao);
		
		int outraDivisao = 5/2;
		System.out.println(outraDivisao);//2
		
		double novaTentativa = 5.0/2; //executa primeiro a divisão, executa da esquerda para direita
		System.out.println(novaTentativa); //2.0 se 5/2
	}

}
