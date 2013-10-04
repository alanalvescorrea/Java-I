import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);

		
		
		int n1=0;
		int n2=0;
		int n3=0;
		int maior= -9999;
		int menor =9999;
		
		
		System.out.print ("Digite primeiro valor ");
        n1= s.nextInt();
        
        System.out.print ("Digite segundo valor ");
        n2= s.nextInt();
        
        System.out.print ("Digite terceiro valor");
        n3= s.nextInt();
        
        if (n1<n2 && n1<n3)
        	menor=n1;
        
        else if (n2<n1 && n2<n3)
        	menor=n2;
        
        else
        	menor=n3;
        
        
        
        
        	
	}
	System.out.print ("O menor valor é" + menor);
}
