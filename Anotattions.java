class Animal{
	void fazerSom(){
		System.out.println("Animal fez som!");
	}
}

class Cachorro extends Animal{
	
	@Override
	void fazerSom(){
		System.out.println("O cachorro latiu!");
	}
}


public class Anotattions{
	public static void main(String[] args){
		Cachorro dog = new Cachorro();

		dog.fazerSom();
	}
}