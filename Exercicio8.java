import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.println("informe o valor do pruduto");
        float vp = s.nextFloat();

        System.out.println("informe % desconto");
        float des = s.nextFloat();

        DecimalFormat df = new DecimalFormat("0.00");
        float vf = vp - (vp * (des / 100));
        String str = df.format(vf);
        System.out.println("Valor Final: " + vf);
    }
}
