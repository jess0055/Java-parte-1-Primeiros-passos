
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("testanto condicional");

		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("voce tem mais de 18 anos");
			System.out.println("bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("esta acompanhado, pode entrar");
			} else {
			System.out.println("não pode entrar");
			}
		}
	}
}
