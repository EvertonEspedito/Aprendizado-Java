abstract class Animal{
	public abstract void fazerSom();
}

class Cachorro extends Animal{
	public void fazerSom(){
		System.out.println("O cachorro esta fazendo som!");
	}	
}

class Gato extends Animal{
	public void fazerSom(){
		System.out.println("O gato esta fazendo som!");
	}
}

public class Polimorfismo{
	public static void main(String[] args){
		Animal gatinho = new Gato();
		Animal cachorrinho = new Cachorro();

		gatinho.fazerSom();
		cachorrinho.fazerSom();
	}
}