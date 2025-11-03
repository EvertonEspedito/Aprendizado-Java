import java.util.List;
import java.util.Arrays; // Importação Explicita da classe de Arrays
import java.util.ArrayList;
import java.util.Map; // map
import java.util.HashMap; // HashMap

//import java.util.*; importar todas as classes do pacote java.util

public class ExemploList{
	public static void main(String[] args) {

		//Criação de uma lista de String
		List <String> lista = new ArrayList<>();

		//Adição de item a lista
		lista.add("Java");
		lista.add("Python");
		lista.add("C++");

		// Verificando se a lista contem o elemento 
		System.out.println("Contém 'Java'? "+ lista.contains("Java")); // True

		// Adicionando elementos de outra coleção
		List<String> outraLista =  Arrays.asList("Javascript", "Ruby");// declarei um novo objeto de lista
		lista.addAll(outraLista);// Adicionar todo o conteúdo de uma lista, para outra lista.

		System.out.println("Lista Completa: "+ lista);

		//Removendo 1 elemento
		lista.remove("Python");
		System.out.println("Lista Sem Python: "+ lista);

		//Obter um elemento pelo indice
		String elemento = lista.get(2); // Obtem o 3° elemento da lista
		System.out.println("Elemento Especifico da lista: "+ elemento);

		//Limpar Lista
		lista.clear();
		System.out.println("Lista Após Limpeza: "+ lista);

		//Criando Map
		Map<String,Integer> mapa = new HashMap<>();

		mapa.put("Java",20);//Adicionando Itens
		mapa.put("Python",10);
		mapa.put("C++",15);

		//Verificando se o mapa contém uma chave
		System.out.println("Contém Java?"+ mapa.containsKey("Java"));

		//Obtendo um valor associado a uma chave
		System.out.println("Valor associado a Java"+ mapa.get("Java"));

		mapa.put("Javascript",25);

		//Lista completa
		System.out.println("Mapa Completo: "+ mapa);

		//Remover Elemento
		mapa.remove("Python");
		System.out.println("Mapa Sem Python: "+ mapa);

		// Limpeza do Mapa
		mapa.clear();// Mapar Vazio
		System.out.println("Mapa Vazio: "+ mapa);


	}
}