

public class NumerosPrimos
{
public static void main (String [ ] args)
{
 
    int soma=0;
    float multi=0;
    for (int a=1; a<=30; a ++) {
        
            if (a%2==0)
             multi =a*a;
            
            
            else
            soma =a+a;
            
        }
        System.out.print (" A Multiplicação dos numeros impares é" + multi);
        System.out.print (" A Soma dos numeros pares é" + soma);
        
    }
}
            
            