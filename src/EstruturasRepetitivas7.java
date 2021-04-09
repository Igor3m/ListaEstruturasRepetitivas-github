import java.util.Scanner;

public class EstruturasRepetitivas7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cont = 1;
		
		for(int i=0; i<n; i++) {
			System.out.println(cont + " " + Math.pow(cont, 2) + " " + Math.pow(cont, 3));
			cont++;
		}
		
		sc.close();
	}

}
