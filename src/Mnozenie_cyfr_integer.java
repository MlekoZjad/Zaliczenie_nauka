import java.util.Scanner;

public class Mnozenie_cyfr_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj liczbê ca³kowit¹: ");
		int a = scan.nextInt();
		scan.close();
		System.out.println(mnozenie(a));

	}
	
	public static int mnozenie (int a) {
		int wynik = 1;
		String liczba = Integer.toString(a);
		String tablica[] = liczba.split("");
		for (int i = 0; i <= tablica.length - 1; i++) {
			wynik = wynik * Integer.parseInt(tablica[i]);
		}
		return wynik;
	}
}
//mnozenie cyfr z konkretnej liczby