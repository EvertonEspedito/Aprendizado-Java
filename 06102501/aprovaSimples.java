public class aprovaSimples{
	public static void main(String[] args){
		float nota1 = 4.0f;
		float nota2 = 5.3f;

		float calcNota = (nota1 + nota2)/2;

		if (calcNota >= 6) {
			System.out.println("Aluno Aprovado!");
			System.out.println("Nota do Aluno: "+calcNota);	
		}else{
			System.out.println("Aluno Reprovado!");
			System.out.println("Nota do Aluno: "+calcNota);
		}
	}
}