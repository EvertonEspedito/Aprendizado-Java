public class Imutabilidade{
	public static void main(String[] args){

		//A Keyword "final", torna a variavel Imutavel também é aplivel aos
		// Metodos(não sofrem overridden) e Classes(Não vai poder ser extendida).
		final int x = 10;
		x = 20;//O X vira uma constante

		System.out.println("Objeto Imutavel: "+x);
	}
}