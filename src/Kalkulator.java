import java.util.Scanner;
public class Kalkulator {
	

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		//pobieranie liczb od u¿ytkownika
		System.out.println("Wprowad¿ a");
		int a = scan.nextInt();
		
		System.out.println("Wprowad¿ b");
		int b = scan.nextInt();
		
		wykonajDzialania(a, b);
		scan.close();

	}
	
	
	//dzia³ania
	private static void wykonajDzialania(int a, int b) {
		int dodaj = (a+b);
		System.out.println(a +" + "+b+" = "+dodaj );
		
		int odejmij = (a-b);
		System.out.println(a +" - "+b+" = "+odejmij );
		
		int pomnoz = (a*b);
		System.out.println(a +" * "+b+" = "+pomnoz );
		
		int podziel = (a/b);
		System.out.println(a +" / "+b+" = "+podziel );
		
		int mod = (a%b);
		System.out.println(a +" mod "+b+" = "+mod );
		
	}
}
