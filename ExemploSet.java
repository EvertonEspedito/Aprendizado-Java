import java.util.Set;
import java.util.HashSet;

//import java.util.*; Para importar tudo de uma vez!

public class ExemploSet{
	public static void main(String[] args){
		//Criação de uma coleção(Apenas Strings)!
		Set<String> conjunto = new HashSet<>();

		//Adicionar Elementos a coleção!
		conjunto.add("Café");
		conjunto.add("Arroz");
		conjunto.add("Picanha");
		conjunto.add("Feijão");

		//Printar Conjunto!
		System.out.println("Conjunto: "+ conjunto);

		//Printar se contem elemento especifico!
		System.out.println("Contém: 'Feijão' ? "+ conjunto.contains("Feijão")); //True

		//Removendo Elemento
		conjunto.remove("Café");
		System.out.println("Café Removido");
		System.out.println("Conjunto: "+ conjunto);

		//Adicionando Elemento Duplicado
		Boolean foiAdicionado = conjunto.add("Arroz");
		System.out.println("Arroz foi adicionado novamente "+ foiAdicionado); //False

		//Limpar Coleção
		conjunto.clear();
		System.out.println("Conjunto após limpar: "+ conjunto);//[]

	}
}
