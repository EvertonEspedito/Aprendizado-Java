/*
Criar um programa em Java que exiba quantidade de dias de um mês especifico.
*/

public class DiasNoMes{
	public static void main(String[] args){
		String mes = "Fev";

		String mesEsp = switch (mes){
			case "Jan","Mar","Mai","Jul","Ago","Out","Dez" -> " 31 Dias";
			case "Abr","Jun","Set","Nov" -> " 30 Dias";
			case "Fev" -> "o número de dias é 28 (considerando um ano não bissexto).";


			default -> "Mês Inválido";
		};

		System.out.println("O mês: "+mes+" tem "+ mesEsp);
	}
}