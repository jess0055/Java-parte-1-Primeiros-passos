
public class TestaEscopo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("testanto condicional");

		int idade = 18;
		int quantidadePessoas = 2;
		
		//boolean acompanhado = quantidadePessoas >= 2;
		boolean acompanhado;
		
		if(quantidadePessoas >= 2) {
			acompanhado = true; // se variavel � declarada aqui, s� existe nesse bloco boolean acompanhado = true;
		}else {
			acompanhado = false;
		}

		//if (idade >= 18 || quantidadePessoas >= 2) {
		if (idade >= 18 && acompanhado) {
			System.out.println("bem vindo");
			
		} else {
			System.out.println("n�o pode entrar");

		}

	}

}
