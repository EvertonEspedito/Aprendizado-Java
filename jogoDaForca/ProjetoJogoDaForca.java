import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ProjetoJogoDaForca {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Array das palavras
		ArrayList<String> palavrasSecretas = new ArrayList<>();
		palavrasSecretas.add("cobra");
		palavrasSecretas.add("elefante");
		palavrasSecretas.add("girafa");

		Random random = new Random();
		int tamanhoDoArrayList = palavrasSecretas.size();
		int indiceDaPalavraAleatoriaGerada = random.nextInt(tamanhoDoArrayList);//Selecionar Palavra Aleatoria
		String palavraSecreta = palavrasSecretas.get(indiceDaPalavraAleatoriaGerada);//selecionar palavra

		ArrayList<Character> letrasDescorbertas = new ArrayList<>(); // armazenar as letras descorbertas

		for (int i = 0; i < palavraSecreta.length(); i++ ) {
			letrasDescorbertas.add('_');// Inicioalizar cada letra com traços!
		}

		int tentativas = 6;	// Número máximo de tentativas
		boolean palavraFoiDescoberta = false;// Flag para verificar se a palavra foi descoberta

		// Enquanto "palavraFoiDescoberta" for "False"
		// ou ainda houver tentativas
		while(!palavraFoiDescoberta && tentativas > 0){
			System.out.println("Palavra: " + letrasDescorbertas);
			System.out.print("Chute uma letra: ");

			char chute = scanner.next().charAt(0);

			boolean acertou = false;

			for (int i = 0; i< palavraSecreta.length();i++ ) {
				if (palavraSecreta.charAt(i) == chute) {
					letrasDescorbertas.set(i, chute);
					acertou = true;		
				}	
			}

			if (!acertou) {
				tentativas--;
				System.out.println("ERROU! Você tem mais: " + tentativas +" tentativas!");
			}

			//Verifca se palavra foi completamentote descoberta
			palavraFoiDescoberta = !letrasDescorbertas.contains("_");

		}

		if (palavraFoiDescoberta) {
			System.out.println("Parabéns, Você Acertou! A palavra era: " + palavraSecreta);
		}else{
			System.out.println("Que pena!, Você perdeu! A palavra era: " + palavraSecreta);
		}
	}
}