import java.util.Scanner;

public class Estruturarepetitiva3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool, gasolina, diesel, combustivel;
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		combustivel = sc.nextInt();
		while(combustivel != 4) {
			if (combustivel == 1){
				alcool++;
			}
			if(combustivel == 2){
				gasolina++;
			}
			if(combustivel == 3) {
				diesel++;
			}
			combustivel = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("alcool: " + alcool);
		System.out.println("gasolina: " + gasolina);
		System.out.println("diesel: " + diesel);
		
		sc.close();
	}

}
