
import java.util.Scanner;
public class Exercicio3 {

    
public static void main (String[]args){
          
Scanner s =new Scanner (System.in);
        
System.out.print ("Digite o valor da altura: h ");
        
int h= s.nextInt();
        
System.out.print ("Digite o valor da base menor: b");
        
int b= s.nextInt();
        

System.out.print ("Digite o valor da base maior: B");
        
int B= s.nextInt();
        
float A= (h*(b+B))/2;
        
System.out.print ("O valor da área é " + A);
    
}
   

}
        