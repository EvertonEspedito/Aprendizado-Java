public class Test{
	public static void main(){
		System.out.println(soma(2,3));
		System.out.println(soma("Jogar","Jogar"));
	}

	static int soma(int a,int b){
		return a + b;
	}

	static String soma(String a,String b){
		return a + b;
	}
}