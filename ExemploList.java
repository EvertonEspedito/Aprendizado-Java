import java.util.List;
import java.util.Arrays; // Importação Explicita da classe de Arrays
import java.util.ArrayList;

//import java.util.*; importar todas as classes do pacote java.util

public class ExemploList{
	public static void main(String[] args) {

		//Criação de uma lista de String
		List <String> lista = new ArrayList<>();

		//Adição de item a lista
		lista.add("Java");
		lista.add("Python");
		lista.add("C++");
		lista.add("Javascript");

		// Verificando se a lista contem o elemento 
		System.out.println("Contém 'Java'? "+ lista.contains("Java")); // True

		// Adicionando elementos de outra coleção 5:10
	}
}