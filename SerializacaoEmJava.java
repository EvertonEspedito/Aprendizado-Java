import java.io.*;

public class SerializacaoEmJava{
	public static void main(String[] args){

		// Conversão de Int para Char
		int num1 = 79;
		int num2 = 108;
		int num3 = 225;

		char letra1 = (char) num1; // 0
		char letra2 = (char) num2; // L
		char letra3 = (char) num3; // Á

		System.out.println("Saudação: "+ letra1+letra2+letra3);

		// I/O
		try{

			FileWriter writer = new  FileWriter("meuArquivo.txt");
			writer.write("Olá Mundo!"); // Gravar
			writer.close();//Fechar

			// Ler Arquivo

			FileReader reader = new FileReader("meuArquivo.txt");
			int data = reader.read();// Ler

			while(data != -1){
				System.out.print((char)data);
				data = reader.read();
			}

			reader.close();
		}catch(IOException e){
			System.out.println("Problema de IO: "+ e.getMessage());
		}
	}
}