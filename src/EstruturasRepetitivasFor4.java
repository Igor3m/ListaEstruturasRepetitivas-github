import java.util.Scanner;

public class EstruturasRepetitivasFor4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double x, y;
		String[] resultado = new String[n];
		for(int i=0; i<n; i++) {
			resultado[i] = "x";
		}
		double[] result = new double[n];
		for(int i=0; i<n; i++) {
			result[i] = -1;
		}
		for (int i=0; i<n; i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			if(y == 0) {
				resultado[i] = "divisão impossivel";
			}
			else {
				result[i] = x / y;
			}
		}
		
		for (int i=0; i<n; i++) {
			if (resultado[i] != "x") {
				System.out.println(resultado[i]);
			}
			if(result[i] != -1) {
				System.out.println(result[i]);
			}
		}
		sc.close();
	}

}
