public class CalculadoraTradicional{

	public double somar(double a, double b){
		return a + b;
	}

	public double subtrair(double a, double b){
		return a - b;
	}

	public double multiplicar(double a, double b){
		return a * b;
	}

	public double dividir(double a, double b){
		return a / b; // Sem exceções, apenas para teste
	}

	//Main

	public static void main(String[] args){
		CalculadoraTradicional calculadora = new CalculadoraTradicional();

		double resultadoSoma = calculadora.somar(2,3);
		System.out.println("A soma é: " + resultadoSoma);

		double resultadoSubtrair = calculadora.subtrair(2,3);
		System.out.println("A Subtração é: " + resultadoSubtrair);

		double resultadoMultiplicar = calculadora.multiplicar(2,3);
		System.out.println("A multiplicação é: " + resultadoMultiplicar);

		double resultadoDividir = calculadora.dividir(2,3);
		System.out.println("A divisão é: " + resultadoDividir);
	}

}