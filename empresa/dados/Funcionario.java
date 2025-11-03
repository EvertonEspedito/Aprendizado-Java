package empresa.dados;

public class Funcionario{
	String nome;
	double salario;

	public Funcionario(String nomeInit, double salarioInit){
		nome = nomeInit;
		salario = salarioInit;

		System.out.println("Nome do Funcionario: "+ nome);
		System.out.println("Salario do Funcionario: "+ salario);

	}
}