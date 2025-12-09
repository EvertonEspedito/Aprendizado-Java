public class aprovaComPresenca{
	public static void main(String[] args){
		float nota1 = 10.0f;
		float nota2 = 5.3f;

		float calcNota = (nota1 + nota2)/2;
		float frequencia = 70.4f;

		if (calcNota >= 6 && frequencia > 70) {
			System.out.println("Aluno Aprovado!");
			System.out.println("Nota do Aluno: "+calcNota);	
			System.out.println("A presença do Aluno: "+frequencia+"%");	

		}else{
			System.out.println("Aluno Reprovado!");
			System.out.println("Nota do Aluno: "+calcNota);
			System.out.println("A presença do Aluno: "+frequencia+"%");	
		}
	}
}