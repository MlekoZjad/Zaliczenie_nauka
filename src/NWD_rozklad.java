/*
Wyrzuca błąd:

Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
	at java.base/java.util.Objects.checkIndex(Objects.java:373)
	at java.base/java.util.ArrayList.get(ArrayList.java:426)
	at Zadanie2.nwd2(Zadanie2.java:83)
	at Zadanie2.main(Zadanie2.java:16)
*/


import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie2 {

	
		public static void main(String[] args) {
			
			
	        Scanner sc = new Scanner(System.in); //Wprowadzanie liczb przez użytkownika
	        System.out.println("Podaj a");
	        int a = sc.nextInt();
	        System.out.println("Podaj b");
	        int b = sc.nextInt();
	        System.out.println("Największy wspólny dzielnik liczb "+ a + " i "+ b);
	        nwd2(a, b);
	        sc.close();
		}
		
	       public static void nwd2(int a, int b) {
		
        int iloscA = 0;
        int iloscB = 0;
        ArrayList<Integer> liczbyPierwszeA = new ArrayList<Integer>();
        ArrayList<Integer> liczbyPierwszeB = new ArrayList<Integer>();
        
        int a1 = a;
        int b1 = b;

        for (int i = 2; i <= a; i++) {

            while (a % i == 0) {
                // System.out.print(i + "*");
                liczbyPierwszeA.add(iloscA, i);
                iloscA++;
                a = a / i;
            }
        }

        int x = 0;
        System.out.print("Rozkład na czynniki pierwsze liczby " + a1 + "=");
        while (x < liczbyPierwszeA.size()) {
            System.out.print(liczbyPierwszeA.get(x) + "*");
            x++;
        }

        for (int i = 2; i <= b; i++) {

            while (b % i == 0) {
                // System.out.print(i + "*");
                liczbyPierwszeB.add(iloscB, i);
                iloscB++;
                b = b / i;
            }
        }
        System.out.println("");
        int y = 0;
        System.out.print("Rozkład na czynniki pierwsze liczby " + b1 + "=");
        while (y < liczbyPierwszeB.size()) {
            System.out.print(liczbyPierwszeB.get(y) + "*");
            y++;
        }

    
        ArrayList<Integer> Wspolne = new ArrayList<Integer>();
        int WspolneLicznik = 0;
        int indexA = 0;
        int indexB = 0;
        while (indexA < liczbyPierwszeA.size () && indexB < liczbyPierwszeB.size()) {
            if (liczbyPierwszeA.get(indexA) == liczbyPierwszeB.get(indexB)) {
                Wspolne.add(WspolneLicznik, liczbyPierwszeA.get(indexA));
                indexA++;
                indexB++;
            //    WspolneLicznik++; 
            } else {
                if (liczbyPierwszeA.get(indexA) < liczbyPierwszeB.get(indexB))
                    indexA++;
                else
                    indexB++;
            }
        }
           for (int i = 0; i<Wspolne.size(); i++) {
        	int razem = Wspolne.get(i)*Wspolne.get(i+1);
        	System.out.println("\nNWD: " + razem);
           }
            	
            }
            
        }
    
    
