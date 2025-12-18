// javac GeradorDeSenhas.java

import java.security.SecureRandom;
import java.util.Scanner;

public class GeradorDeSenhas {
	private static final String CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; //Apenas numeros e letras

	public static String gerarSenhas(int comprimento){
		SecureRandom geradorDeNumeroAleatorio = new SecureRandom();
		StringBuilder senha = new StringBuilder(comprimento);


		for (int i = 0;i < comprimento ;i++ ) {
			int indice = geradorDeNumeroAleatorio.nextInt(CARACTERES.length());
			senha.append(CARACTERES.charAt(indice));
		}

		return senha.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tamanho da senha:");
		int comprimentoSenha = scanner.nextInt();

		String senha = gerarSenhas(comprimentoSenha);
		System.out.println("Senha gerada: "+ senha);
	}
}