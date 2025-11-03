public class Funcionario{

	String nome;
	String cargo;
	int idade;

	//Constructor
	Funcionario(String nome,String cargo, int idade){
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
	}

	public static void main(String[] args){

		//Sem Constructor

		// Funcionario funcionario = new Funcionario();
		// funcionario.nome = "Everton";
		// funcionario.cargo = "Desenvolvedor Java Jr";
		// funcionario.idade = 22;

		// System.out.println("Nome: "+funcionario.nome);
		// System.out.println("Cargo: "+funcionario.cargo);
		// System.out.println("Idade: "+funcionario.idade);

		//Com Constructor

		Funcionario funcionariop1 = new Funcionario("Everton Gostoso", "Desenvolvedor" , 22);
		System.out.println("Nome: "+funcionariop1.nome);
		System.out.println("Cargo: "+funcionariop1.cargo);
		System.out.println("Idade: "+funcionariop1.idade);

	}
}