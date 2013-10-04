import java.util.Scanner;
public class Exercicio2
{

public static void main(String[]args){
    
Scanner s =new Scanner (System.in);
    

System.out.print ("digite o valor h");
    
int h= s.nextInt();
    
System.out.print ("digite o valor b" );
    
int b= s.nextInt();
    
System.out.print ("digite o valor B" );
    
int B= s.nextInt();
    
float A=(h*(b*B))/2;
    
System.out.print ("o valor da Area é " + A);


}

}
