import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		// Pobieranie warto�ci od u�ytkownika i tworzenie zmiennej
		System.out.println("Podaj warto�� do odwr�cenia");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();

		System.out.println("odwr�cona warto�� to = " + odwrocWartosc(s));

		in.close();
	}

	// metoda odwracaj�ca przy wykorzystaniu obiektu
	public static String odwrocWartosc(String s) {
		if (s == null) {
			return null;
		}

		StringBuilder output = new StringBuilder(s).reverse();
		return output.toString();

	}

}
