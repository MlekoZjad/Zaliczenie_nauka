import java.util.Scanner;

public class WiekszaMniejsza {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj trzy liczby: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		System.out.println(sprawdzenieCzyPrawda(a, b, c));
	}
	
	public static boolean sprawdzenieCzyPrawda(int a, int b, int c) {
		if (b > a && c > b && c > a ) {
			return true;
		}
		else {
			return false;
		}
	}
}


/*
 * metoda, kt�ra zwr�ci prawd� je�li b jest wi�ksza od a, c wi�ksza od b i a. Je�li kt�ry� warunek nie b�dzie spe�niony, zwr�ci false 
 */
