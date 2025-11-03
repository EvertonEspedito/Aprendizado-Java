public class CalculadoraSimples{
	public static void main (String[] args){

		int num = 40;
		int num2 = 3;

		System.out.println("Resultado da some é: "+soma(num,num2));
		System.out.println("Resultado da Subtração é: "+subtra(num,num2)); 
	}
	public static int subtra(int a, int b){
		if(a < b){
			System.out.println("O primeiro Número precisa sem maior!"); 
			return 0;
		}else{
			return(a-b);
		}
	}

	public static int soma(int a, int b){
		return (a + b);
	}
}