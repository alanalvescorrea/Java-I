import java.util.Scanner;
public class Vet1 					   {
public static void main(String[] args) {
Scanner s= new Scanner(System.in);

	
	
	int menor= 9999;
	int v[]= new int[20];
	
	
	for (int i=0; i<v.length; i++ )     {
		System.out.println ("Digite Valor");
		v[i]= s.nextInt();
		
										}
	
	
	for (int i=0; i<v.length; i++)		{	
		if (v[i]<menor)
			menor=v[i];					}
			
	System.out.println ("O menor é " + menor);	
										}
										}
