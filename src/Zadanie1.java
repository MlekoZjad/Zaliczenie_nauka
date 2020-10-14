import java.util.Scanner;

public class Zadanie1 {
	
/*
 * Zadanie domowe 1:
Zaimplementuj rekurencyjn� metod� "nwd" znajduj�c� najwi�kszy wsp�lny dzielnik dw�ch liczb (wprowadzonych przez u�ytkownika) za pomoc� algorytmu Euklidesa, tj.
nwd(a,b) wynosi a, dla b=0
nwd(a,b) wynosi nwd(b,a mod b), dla b>=1
 */
	public static void main(String[] args) {
		
		System.out.println("Podaj a");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		
		System.out.println("Podaj b");
		Scanner sc2 = new Scanner(System.in);
		int b = sc2.nextInt(); 
		
		System.out.println("Najwi�kszy wsp�lny dzielnik liczb: "+ a + " i " + b +  " to " + nwd(a, b));
		sc.close();
		sc2.close();

	}
	
		public static int nwd(int a, int b) {
			
				if (b == 0) {
					return a;
				}
				else {
					return nwd(b, a % b);	
				}
		
		}

}
