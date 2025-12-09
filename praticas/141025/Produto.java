public class Produto{
	private String nome;
	private double preco;
	private int quantidadeEmEstoque;

	public static void main(String[] args){
		Produto produto = new Produto("Vivobook",2000.00,23);
	}

	/*Constructor*/
	public Produto(String nomeInit, double precoInit, int quantidadeEmEstoqueInit){
		nome = nomeInit;
		preco = precoInit;
		quantidadeEmEstoque = quantidadeEmEstoqueInit;

		System.out.println("Nome do Produto: "+ nome);
		System.out.println("Preço do Produto: "+ preco);
		System.out.println("Quantidade no Estoque: "+ quantidadeEmEstoque);

	}



}