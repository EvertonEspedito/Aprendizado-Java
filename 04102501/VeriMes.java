/*
Criar um programa em Java que verifica o valor de uma variável representando um mês do ano e exibe o nome desse mês.
*/

public class VeriMes{
	public static void main(String[] args){
		String mes = "Jul";

		String mesEsp = switch (mes){
			case "Jan" -> "Jan";
			case "Fev" -> "Fev";
			case "Mar" -> "Mar";
			case "Abr" -> "Abr";
			case "Mai" -> "Mai";
			case "Jun" -> "Jun";
			case "Jul" -> "Jul";
			case "Ago" -> "Ago";
			case "Set" -> "Set";
			case "Out" -> "Out";
			case "Nov" -> "Nov";
			case "Dez" -> "Dez";

			default -> "Mês Inválido";
		};

		System.out.println(mesEsp);
	}
}