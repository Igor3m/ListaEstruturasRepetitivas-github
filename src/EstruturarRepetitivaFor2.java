import java.util.Scanner;

public class EstruturarRepetitivaFor2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantidade, x, in, out;
		quantidade = sc.nextInt();
		in = 0;
		out = 0;
		
		for (int i=0; i<quantidade; i++) {
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
