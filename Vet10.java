import java.util.Scanner;
public class Vet10 {
public static void main(String[] args) {
Scanner s= new Scanner (System.in);
    int fato = 0;
	int a[]= new int [10];
	int j[]= new int[10]; 
	
	for (int i=0; i<a.length; i++){					//preenche vetor
		System.out.println ("Digite Valor");
		a[i]= s.nextInt();
								  }

	for (int i=0; i<a.length-1; i++){
		 if (a[i]<0)
		 fato= a[i]+a[i];  
		 j[i]=fato;				        
		 System.out.println ("O Fatorial é " + j[i]);	 
	
		 if (a[i]>0){
		 fato=a[i]+a[1];
		 j[i]=fato;
		 System.out.println ("O Fatorial é " + j[i]);}
	
	}}}
