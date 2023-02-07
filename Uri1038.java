package Uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int qtd = sc.nextInt();
		double total;
		
		if (codigo ==1) {
			total = qtd * 4;
			System.out.printf("Total: R$ %.2f%n" , total);
		}else if (codigo == 2) {
			total = qtd * 4.50;
			System.out.printf("Total: R$ %.2f%n" , total);
		}else if (codigo == 3) {
			total = qtd * 5;
			System.out.printf("Total: R$ %.2f%n" , total);
		}else if (codigo == 4) {
			total = qtd * 2;
			System.out.printf("Total: R$ %.2f%n" , total);
		}else if (codigo == 5) {
			total = qtd * 1.50;
			System.out.printf("Total: R$ %.2f%n" , total);
		}
		
	
        sc.close();

	}

}
