
import java.util.Scanner;

public class Calcular10notas
{
public static void main (String [ ] args)
{

Scanner s= new Scanner(System.in);

int nota =0;
int soma=0;
float media = 0;

for (int i=0; i<10; i ++)
{
System.out.println ("Informe Nota");
nota = s.nextInt(); 
soma=soma+nota;

}
media=soma/10;
System.out.println (" A media final foi" + media);
}
}




