import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i = i + 1) {
			int quad = i * i;
			int cubo = i * i * i;
			
			System.out.println("Resultado = " + i + " " + quad + " " + cubo);
			
		}
		sc.close();
	}
}