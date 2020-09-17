import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		// Pobieranie wartoœci od u¿ytkownika i tworzenie zmiennej
		System.out.println("Podaj wartoœæ do odwrócenia");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();

		System.out.println("odwrócona wartoœæ to = " + odwrocWartosc(s));

		in.close();
	}

	// metoda odwracaj¹ca przy wykorzystaniu obiektu
	public static String odwrocWartosc(String s) {
		if (s == null) {
			return null;
		}

		StringBuilder output = new StringBuilder(s).reverse();
		return output.toString();

	}

}
