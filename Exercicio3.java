import java.util.Scanner;
	public class Exercicio3 {
		public static void main(String[] args) {
			Scanner s =new Scanner (System.in);
			
			
			
			int cont = 0;
			int soma = 0;
			float media = 0;
			int n1=0;
			int n2=0;
			
			System.out.print ("Digite primeiro valor ");
	        n1= s.nextInt();
	        
	        System.out.print ("Digite segundo valor valor ");
	        n2= s.nextInt();
	        
	        
	        if (n1 %2==0 && n2%2==0){
	        	soma=soma+n1+n2;
	        	media=soma/2;}
	        
	        }
		System.out.println("A media é " + media);
	}

		
		

