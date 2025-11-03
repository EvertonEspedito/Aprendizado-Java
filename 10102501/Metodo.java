public class Metodo{
	public static void main(String[] args){
		String nome = "Everton";
		double salario = 4000.00d;

		String info = obterInfo(nome,salario);

		System.out.println(info);

	}

	public static String obterInfo(String nome, double salario){
		return "Nome:" + nome+", Salário: "+salario;
	}
}