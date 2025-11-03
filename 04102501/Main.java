public class Main{
	public static void  main(String[] args) {

		/*
			IF e ELSE e Ternario
		*/

		int a = 3;
		String resultado = (a % 2 == 0) ? "Par" : "Impar";

		if(a > 5){
			System.out.println("O numero é maior q 5");
		}else{
			System.out.println("O numero é menor q 5");
		}

		System.out.println("O número é: " + resultado);

		
		/*
			SWITCH CASE "EXPRESSION"
		*/

		int dia = 4;

		switch(dia){
			case 1 -> System.out.println("Domingo");
			case 2 -> System.out.println("Segunda");
			case 3 -> System.out.println("Terça");
			case 4 -> System.out.println("Quarta");
			case 5 -> System.out.println("Quinta");
			case 6 -> System.out.println("Sexta");
			case 7 -> System.out.println("Sabado");

			default -> System.out.println("Numerd não correspondido!");
		}

		/*
			SWITCH CASE "INITIALIZATION"
		*/

		String day = "Ter";

		String tipoDia = switch (day){
			case "Seg","Ter","Qua","Qui","Sex" -> "Dia Util";
			case "Sab","Dom" -> "Fim de Semana";

			default -> "Desconhecido";
		};

		System.out.println(tipoDia);

	

	}

}