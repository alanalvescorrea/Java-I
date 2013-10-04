import java.util.Scanner;

public class Testeif {

	public static void main(String[] arg) {

		Scanner s = new Scanner(System.in);

		System.out.println("Informe um valor");

		int a;

		a = s.nextInt();

		for (int i = 5; i < 10; i++) {

			if (a < 0)

				System.out.println("Existem " + i + "valores negativos");

		}

		a = s.nextInt();

	}

}