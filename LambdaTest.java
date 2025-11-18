import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class LambdaTest{
	public static void main(String[] args){
		System.out.println("Olá Mundo!");

		List<Integer> listaDeNumeros = Arrays.asList(1,2,3,4,5);
		listaDeNumeros.forEach( (Integer numero) -> System.out.println(numero));// ForEach com expressão LAMBDA


		System.out.println("Exercicio 1 - Lamba");

		List<String> minhaLista = new ArrayList<>();
		minhaLista.add("maça");
		minhaLista.add("banana");
		minhaLista.add("cereja");
		minhaLista.add("abacaxi");

		System.out.println("Lista :"+ minhaLista);

		minhaLista.removeIf(s -> s.length() > 5);

		System.out.println("Lista :"+ minhaLista);
	}
}