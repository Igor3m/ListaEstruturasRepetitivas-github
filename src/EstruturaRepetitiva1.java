import java.util.Scanner;

public class EstruturaRepetitiva1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		int valor;
		valor = sc.nextInt();
		if (valor == senha) {
			System.out.println("Acesso Permitido");
		}
		else {
			System.out.println("Senha Inv�lida");
			while (valor != senha) {
				valor = sc.nextInt();
				if (valor == senha) {
					System.out.println("Acesso Permitido");
				}
				else {
					System.out.println("Senha Inv�lida");
				}
			}
		}
		
		sc.close();
	}

}
