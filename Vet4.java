import java.util.Scanner;
public class Vet4 							{
public static void main(String[] args)      {
Scanner s= new Scanner (System.in);
	
	int f[]= new int [20];
	int g[]= new int [20];
	int prod=0;
	
	
	for (int i=0; i<f.length; i++)			{
	System.out.println ("Digite Valor");	
	f[i]= s.nextInt();						}
	
	for (int i=0; i<g.length; i++)			{
	System.out.println ("Digite Valor");
	g[i]= s.nextInt();						
	prod= g[i]*f[i];						}
	
	
	System.out.println ("o produto é " + prod);
											}
											}
