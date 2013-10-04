import java.util.Scanner;
public class Vet2 						{
public static void main(String[] args)  {
Scanner s= new Scanner (System.in);


int a[]= new int [10];
int b[]= new int [10];
int c=0;



for (int i=0; i<a.length; i++)			{
	System.out.println("Digite Valor");
	a[i]=s.nextInt();					}
	


for (int i=0; i<b.length; i++)			{
	System.out.println("Digite Valor");
	b[i]=s.nextInt();					}


for (int i=0; i<a.length; i++)			{
	c =a[i]*b[i];						}

System.out.println("A Multiplicação entre os Vetores é " + c);
								
										}
										}


