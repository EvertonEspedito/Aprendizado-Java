@FunctionalInterface
interface Calculadora{
	double calcular(double a,double b);//função abstrata
}	

@FunctionalInterface
interface OperacaoMatematica{
	double executar(double a, double b);//função abstrata
}

public class CalculadoraComInterfaceFuncional{
	public static void main(String[] args){
		System.out.println("Calculadora Com Interface Funcional");


		Calculadora soma = (a,b) -> a+b; //utilizando Lambda e Função abstrata
		System.out.println("A soma é: " + soma.calcular(2,3));

		Calculadora subtrair = (a,b) -> a-b;
		System.out.println("A subtração é: " + subtrair.calcular(2,3));

		Calculadora multiplicar = (a,b) -> a*b;
		System.out.println("A multiplicação é: " + multiplicar.calcular(2,3));

		Calculadora dividir = (a,b) -> a/b;
		System.out.println("A divisão é: " + dividir.calcular(2,3));

		System.out.println("Exercício: Calculadora Funcional de Potência e Raiz");

 		OperacaoMatematica potencia = (a, b) -> Math.pow(a, b);
 		System.out.println("Potência: " + potencia.executar(2, 3));
 		
 		OperacaoMatematica raizQuadrada = (a, b) -> Math.sqrt(a + b);
 		System.out.println("Raiz quadrada da soma: " + raizQuadrada.executar(10, 5)); 
	}
}