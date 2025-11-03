abstract class Carro{
	abstract void acelerar();

	void frear(){
		System.out.println("Carro Freando...!");
	}

}

class CarroF1 extends Carro{
	void acelerar(){
		System.out.println("Carro de Formula 1, esta acelerando rapidamente...!");
	}
}

class Caminhao extends Carro{
	void acelerar(){
		System.out.println("O Caminhão, esta acelerando rapidamente...!");
	}
}

public class AbstractTest{
	public static void main(String[] args){
		CarroF1 carro = new CarroF1();
		Caminhao scania = new Caminhao();

		carro.acelerar();
		carro.frear();

		scania.acelerar();
		scania.frear();

	}
}