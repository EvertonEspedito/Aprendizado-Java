// Exercicio 1: Veiculo, Carro;
class Veiculo {
	public void acelerar() {
		System.out.println("Veículo acelerando!");
	}
}

class Carro extends Veiculo {
	@Override
	public void acelerar() {
		super.acelerar();
	}
}

// Exercicio 2: Funcionario, Assistente;
class Funcionario {
	private String nome;
	private double salario;

	Funcionario(String InitNome, double InitSalario) {
		this.nome = InitNome;
		this.salario = InitSalario;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	double addAumento(double valor) {
		salario += valor;
		return 0;
	}

	double ganhoAnual() {
		return salario * 12;
	}
}

class Assistente extends Funcionario {
	Assistente(String nome, double salario) {
		super(nome, salario);
	}
}

// Exercicio 3: Pessoa, Estudante;
class Pessoa {
	private String nome;
	private int idade;

	Pessoa(String InitNome, int InitIdade) {
		this.nome = InitNome;
		this.idade = InitIdade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
}

class Estudante extends Pessoa {
	private int matricula;

	Estudante(String nome, int idade, int InitMatricula) {
		super(nome, idade);
		this.matricula = InitMatricula;
	}

	public int getMatricula() {
		return matricula;
	}
}

// Main
public class Super {
	public static void main(String[] args) {

		// Exercicio 1
		System.out.println("Exercicio 1: Veiculo, Carro");
		Carro carro1 = new Carro();
		carro1.acelerar();

		// Exercicio 2
		System.out.println("\nExercicio 2: Funcionario, Assistente");
		Assistente funci = new Assistente("Everton", 2000.00);

		System.out.println("O nome do Funcionario é: " + funci.getNome());
		System.out.println("O salário do Funcionario é: " + funci.getSalario());
		System.out.println("Terá um aumento de: 300");
		System.out.println("Seu salário anual é de: " + funci.ganhoAnual());

		funci.addAumento(300);
		System.out.println("O salário do Funcionario após aumento: " + funci.getSalario());
		System.out.println("Com o aumento, o salário anual é: " + funci.ganhoAnual());

		// Exercicio 3
		System.out.println("\nExercicio 3: Pessoa, Estudante");
		Estudante aluno = new Estudante("João", 22, 32213312);
		System.out.println("Nome do Estudante: " + aluno.getNome());
		System.out.println("Idade do Estudante: " + aluno.getIdade());
		System.out.println("Matrícula do Estudante: " + aluno.getMatricula());
	}
}
