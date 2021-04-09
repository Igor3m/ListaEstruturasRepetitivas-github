import java.util.Scanner;

public class EstruturasRepetitivas5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cont, copiaN, fatorial;
		cont = 1;
		copiaN = n;
		fatorial = n-2;
		
		if (n == 0) {
			System.out.println(1);
		}
		else {
			for (int i=0; i<fatorial; i++) {
				n = n * (copiaN - cont);
				//System.out.println(n);
				cont++;
			}
			System.out.println(n);
		}
		
		sc.close();
	}

}
