public class Caixa <T>{
	private T coisaNaCaixa;

	public void guardar(T coisa){
		this.coisaNaCaixa = coisa;
	}

	public T pegar(){
		return coisaNaCaixa;
	}

	public static void main(String[] args){
	 	// Tipos

	 	//String ->>> String
		//Criando variavel para Guardar palavras
		Caixa<String> caixaDeTexto = new Caixa<>();
		caixaDeTexto.guardar("Caixa de String");
		String texto = caixaDeTexto.pegar();
		System.out.println(texto);	 
		 
		//int ->>> Interger
		//Criando variavel para Guardar Números
		Caixa<Integer> caixaDeNumeros = new Caixa<>();
		caixaDeNumeros.guardar(22);
		int numero = caixaDeNumeros.pegar();
		System.out.println(numero);

		//Outros tipos:
			//long ->>> Long
			//byte ->>> Byte	
	}
}