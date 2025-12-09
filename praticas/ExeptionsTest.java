public class ExeptionsTest{

	//Exeptions em Metodos
	public static int calcularMedia(int totalNotas, int quantidadesAlunos) throws ArithmeticException {
			return totalNotas / quantidadesAlunos;
	}
	public static void main(String[] args){
		int totalNotas = 0;
		int quantidadesAlunos = 0;

		//Erro Matematico
		try {
			int media = totalNotas / quantidadesAlunos; //Dividir por 0
		} catch(ArithmeticException e ){
			System.out.println("Problema! Divisão por zero");
		} finally{
			System.out.println("O programa Terminou!");
		}

		//Erro de objeto nulo
		String nome = null;

		try {
			int tamanhoNome = nome.length();
			System.out.println("Tamanho do nome: " + tamanhoNome);

		} catch(NullPointerException e ){
			System.out.println("Erro! A Variavel esta nula");
		} finally{
			System.out.println("O programa Terminou!");
		}

		//Indice de Matriz
		try {
			int[] numeros = {1,2,3};
			System.out.println("Numero: " + numeros[5]);

		} catch(ArrayIndexOutOfBoundsException e ){
			System.out.println("Erro! " + e.getMessage());
		} finally{
			System.out.println("O programa Terminou!");
		}

		//Exeptions em Metodo
		try {
			int media = calcularMedia(totalNotas, quantidadesAlunos);
			System.out.println("Media das Notas "+ media);

		} catch(ArithmeticException e ){
			System.out.println("Problema! Divisão por zero");
		} finally{
			System.out.println("O programa Terminou!");
		}

	} 
}