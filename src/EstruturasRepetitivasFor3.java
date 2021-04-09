import java.util.Scanner;

public class EstruturasRepetitivasFor3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double x, y, z, media;
		double []vet = new double[n];

		for (int i=0; i<n; i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
			media = x * 2 + y * 3 + z * 5;
			media = media / (2 + 3 + 5);
			vet[i] = media;
		}
		
		for (int i=0; i<n; i++) {
			System.out.println(vet[i]);
		}
		
		sc.close();
	}

}
