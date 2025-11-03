public class PromocaoAutomatica{
	public static void main(String[] args){
		byte a = 10;
		short b = 20;
		char c = 'A'; // O tipo char é usado para representar caracteres, como letras e símbolos
		int d = 30;
		long e = 40L;
		float f = 1.5f;
		double g = 2.5;

		// Exemplo de promoção automática: byte e short promovidos para int
		int resultado = a + b;

		System.out.println("A soma da promoção feita entre Byte e short para int é "+resultado);

	}
}