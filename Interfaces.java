interface SerVivo{
	void respirar();
}

interface Animal extends SerVivo{
	void fazerSom();// É um metodo Abstrato
}

class Cachorro implements Animal{

	public void respirar(){
		System.out.println("O cachorro respira!");
	}

	public void fazerSom(){
		System.out.println("O cachorro Latiu!");
	}
}

class Gato implements Animal{
	public void respirar(){
		System.out.println("O Gato respira!");
	}
	public void fazerSom(){
		System.out.println("O Gato Miou!");
	}
}

//Exercicio 1
interface Veiculo{
	void iniciar();
	void parar();
	default void buzinar(){
		System.out.println("Buzinando!");
	}	
}

class Carro implements Veiculo{
	public void iniciar(){
		System.out.println("Motor Iniciando!");
	}
	public void parar(){
		System.out.println("Motor Parando!");
	}
}

class Caminhao implements Veiculo{
	public void iniciar(){
		System.out.println("Motor Iniciando!");
	}
	public void parar(){
		System.out.println("Motor Parando!");
	}
}

public class Interfaces{
	public static void main(String[] args){
		Cachorro cao = new Cachorro();
		Gato gatinho = new Gato();

		cao.fazerSom();
		gatinho.fazerSom();

		cao.respirar();
		gatinho.respirar();

		System.out.println("Exercicio 1");

		Carro tesla = new Carro();
		Caminhao tata = new Caminhao();

		tesla.iniciar();
		tesla.buzinar();

		tata.iniciar();
		tata.buzinar();

		tesla.parar();
		tata.parar();
	}
}