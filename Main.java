public class Main {
	public static void main(String[] args){
		String nome = "Everton";
		float salario = 1520.50f;
		float altura = 1.68f;
		int idade = 22;

		float salarioIdeal = 2000.00f;


		System.out.println("Seu nome é "+nome);
		System.out.println("você ganha R$"+salario+ " Reais");
		System.out.println("Tem "+idade+" anos");
		System.out.println("tem a altura de "+altura);

		if(salario <= salarioIdeal) {
			System.out.println("O seu salario não esta no nivel ideal");
		}

		if(salario > salarioIdeal){
			System.out.println("O seu salario esta no nivel ideal");
		}

		if (idade < 60) {
			System.out.println("você ainda é jovem");
		}


	}
}