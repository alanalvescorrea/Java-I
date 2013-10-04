import java.util.Scanner;
   
     public class Ipi
    {

            
public static void main(String[]args){
    
                
Scanner s =new Scanner (System.in);
   
                
int cod1=100;
                
int cod2=200;
                
                
System.out.println ("digite o valor do ipi");
                
float ipi= s.nextFloat();
                
                
System.out.println ("digite o valor da peça cod 100");
                
float valor1 =s.nextFloat();
                
                
System.out.println ("digite o quantidade da cod 100");
                
int quantidade1 = s.nextInt();
                
                
System.out.println ("digite o valor da peça cod 200");
                
float valor2 = s.nextFloat();
                
                
System.out.println ("digite a quantidade da cod 200");
                
int quantidade2 = s.nextInt();
                
                
float R= (valor1*quantidade1 + valor2*quantidade2)*(ipi/100+1);
                
System.out.println ("o valor final da peça cod1 e cod2 é " + R );


}

}
    
    
