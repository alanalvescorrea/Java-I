import java.util.Scanner;


public class Exercicio_3 {

	
	public static void main(String[] args) {
	
		
				
	
		int a;
		int b;
		int som = 0;
	
	
			Scanner s= new Scanner (System.in);	
		System.out.println("Informe 2 Valores");
		a=s.nextInt();
		b=s.nextInt();
		
		if ( a % 2==0 && b % 2==a)
			som= a + b;
	}
		System.out.println("A SOMA DOS VALORES PARES É " + som);
}
	