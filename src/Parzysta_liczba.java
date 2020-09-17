import java.util.Scanner;

public class Parzysta_liczba {

	
	public static void main(String[] args) {
		/*podawanie danych przez u¿ytkownika 
		*zakres (pocz¹tek, koniec)
		*/
		Scanner scan= new Scanner(System.in);
		System.out.println("Podaj pocz¹tek zakresu");
		int a = scan.nextInt();		
		System.out.println("Podaj koniec zakresu");
		int b = scan.nextInt();

		scan.close();
		
		//wywo³anie metody
		sprawdzZakres(a, b);

	}
	 //Metoda analizuj¹ca czy liczby s¹ liczbami pierwszymi
	private static void sprawdzZakres(int a, int b) {
		for(int sprawdzana=a; sprawdzana<=b; sprawdzana++) {
			boolean pierwsza= czyParzysta(sprawdzana);
			if (pierwsza) {
			System.out.println(sprawdzana);
		}else {		//System.out.println(sprawdzana);
		}
		}
		
	}
	
	private  static boolean czyParzysta(int liczba) {
		for(int dzielnik=2; dzielnik<liczba; dzielnik++) {
			if(liczba%2==0)	{
				return false; 
			}
			
		}
		return true;
	}

}
