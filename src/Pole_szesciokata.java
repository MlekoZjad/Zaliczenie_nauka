import java.util.Scanner;

public class Pole_szesciokata {

	public static  void main(String[] args) {

		
	    System.out.println("Podaj dlugosc boku: ");

	    //Pobieranie danych od użytkownika
		Scanner a = new Scanner(System.in);
		int bok = a.nextInt();
	    
	    //wywoływanie metody obliczającej pole sześciokąta
	      poleSzesciokata(bok);
		    a.close();
	}
		
		private static double poleSzesciokata (int bok) {
			
			double wynik = (6*bok)/(4*Math.atan(Math.PI/6));
		    
		    System.out.println("Pole sześciokąta jest równe "+wynik);
			return wynik;
		}
	}


