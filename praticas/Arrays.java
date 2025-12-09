public class Arrays{
	public static void main(String[] args){
		System.out.println("Arrays []:");

		/*Criação do Array*/
		int[] meuArray;/*Declarando o Array*/
		meuArray = new int[3];/*Definindo quantas posições ele vai ter, no caso 3*/

		/*Inserindo Valores Manualmente 1 por 1*/
		meuArray[0] = 5;
		meuArray[1] = 15;
		meuArray[2] = 45;


		System.out.println("Printando valores utilizando FOR");
		/*Printando valores utilizando FOR*/
		for (int i = 0 ;i < meuArray.length ;i++ ) {
			System.out.println("Numero da posição: ["+ i+"] do Array é : "+ meuArray[i]);
		}

		meuArray = new int[]{20,40,60,22,33};/*Definindo quantas posições ele vai ter, no caso 5 
		e inserindo valores diretamente*/

		System.out.println("Printando valores diretamente");
		/*Printando valores diretamente*/
		System.out.println("Numero da posição: [0] do Array é : "+ meuArray[0]);
		System.out.println("Numero de posições do Array é: "+ meuArray.length);

		/*Exercício 1: Notas dos Alunos*/
		System.out.println("Exercício 1: Notas dos Alunos");

		double[] notas;
		notas = new double[]{2.4,5.6,10.0,7.5,6.0};

		for(int i = 0; i < notas.length;i++){
			System.out.println("Notas do Aluno [Nota da "+(i+1)+"° Unidade]: "+ notas[i]);
		}


		/*Exercício 2: Soma de 1 a 1000*/
		System.out.println("Exercício 2: Soma de 1 a 1000");

		int[] numeros;
		numeros = new int[1000];

		for(int i = 0; i < notas.length;i++){
			numeros[i] = i + 1;
		}


		int soma = 0;

		for (int num : numeros) {
            soma += num;
        }

        System.out.println("A soma dos números de 1 a 1000 é: " + soma);

        /*Exercício 3: Numeros Pares e Impares*/
        System.out.println("Exercício 3: Numeros Pares e Impares");
        int countPar = 0;
        int countImpar = 0;
        int[] num = {1, 2, 3, 4, 5, 6,7,8,9,10};

        for(int i = 0; i < num.length; i++){
        	if(num[i] %2 == 0){
        		System.out.println("PAR");
        		countPar++;
        	}else{
        		System.out.println("IMPAR");
        		countImpar++;
        	}
        }

        System.out.println("Numeros Pares: "+ countPar);
        System.out.println("Numeros Impares: "+ countImpar);
    }
}