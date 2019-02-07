
public class TestaConversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario = 1270.50;
		int valor = (int) salario;//casting
		
		System.out.println(valor);
		
		int x = 2000000000;// 2 bilhoes
		long numeroGrande = 32345672345676543L; 
		short valorPequeno = 2131;
		byte b = 127;
		
		double v1 = 0.2;
		double v2 = 0.1;
		double total = v1 + v2;
		System.out.println(total);//0.30000000000000004 por isso não é bom usar double para dinheiro
		
		float pontoFlutuante = 3.14f;
		
		double idade = 30.0;
		System.out.println("teste "+ (int) idade + " teste");
	}

}
