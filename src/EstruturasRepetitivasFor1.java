import java.util.Scanner;

public class EstruturasRepetitivasFor1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int x = sc.nextInt();
		int impar;
		
		for (int i=0; i<=x; i++){
			if (i % 2 != 0) {
				impar = i;
				System.out.println(impar);
			}
		}
		
		sc.close();
	}

}
