
public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("testanto condicional");

		int idade = 18;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;

		//if (idade >= 18 || quantidadePessoas >= 2) {
		if (idade >= 18 && acompanhado) {
			System.out.println("bem vindo");
			
		} else {
			System.out.println("não pode entrar");

		}
	}

}
