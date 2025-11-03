public class Loops{
	public static void main(String[] args){

		/*For*/
		System.out.println("For");
		for (int i = 0; i < 5 ;i++ ) {

			if (i == 2) {/*Controle de Loop*/
				System.out.println("Interação Pulada");
				continue;
			}

			if (i == 3) {/*Controle de Loop*/
				System.out.println("Controle Ativado, numero: "+i+" Encontrado!");
				break;
			}
			System.out.println(i);
		}

		/* While */
		int j = 0;
		System.out.println("While");
		while(j < 5){
			System.out.println(j);
			j++;
		}

		/*Do While */
		j = 30;
		System.out.println("Do While");
		do{
			System.out.println(j);
			j++;
		}while(j <5 );



		/*Exe 1 */

		/*For*/
		int soma = 0;
		System.out.println("Exercicio 1");
		for (int i = 0; i < 10 ;i++ ) {
			soma++;
		}
		System.out.println("O valor Final da Soma é "+ soma);

		/*Exe 2 */

		/* While */
		int doce = 1;
		System.out.println("Exercicio 2");
		while(doce <= 3){
			System.out.println("Doces comidos: "+doce);
			doce++;
		}
		System.out.println("Máximo de doces comidos!");

		/*Exe 3 */
		/*Do While */
		int numero = 10;     // número inteiro positivo
        int contador = 1;    // começa em 1
        soma = 0;        // acumulador da soma

        do {
            soma += contador;  // adiciona o valor atual à soma
            contador++;        // incrementa o contador
        } while (contador <= numero);  // repete enquanto for menor ou igual ao número

        System.out.println("A soma dos números de 1 até " + numero + " é: " + soma);
	}
}