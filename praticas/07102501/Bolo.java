public class Bolo{

	int qtdAcucar;

	public static void main(String[] args){
		Bolo boloChocolate = new Bolo();
		boloChocolate.qtdAcucar = 200;

		Bolo boloMorango = new Bolo();
		boloMorango.qtdAcucar = 500;

		System.out.println("Quantidade de Açucar do bolo de morango é: "+boloMorango.qtdAcucar);
		System.out.println("Quantidade de Açucar do bolo de chocolate é: "+boloChocolate.qtdAcucar);
	}
}