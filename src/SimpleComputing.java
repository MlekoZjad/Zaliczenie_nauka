
import java.math.BigInteger;
import java.util.Scanner;


public class SimpleComputing {
	
	
	public static void main (String args[])
	{
		int max=0;
		System.out.println("Podaj a");
		Scanner sc = new Scanner(System.in);
		max = sc.nextInt(); 
		try {
			
			for (int i=0; i<=max; i++)
			{
			//	System.out.println("1.Silnia dla "+i+" = "+silnia(i));
			//	System.out.println("2.Silnia dla "+i+" = "+silnia2(i));
			//	System.out.println("3.Silnia dla "+i+" = "+silnia3(i));
			//	System.out.println("4.Silnia dla "+i+" = "+silnia4(i));
			//	System.out.println("6. Fibonacci: "+ fibonacci(i));
				System.out.println("6. Fibonacci2: "+ fibonacci2(i));


			}
			
		} catch (NumberFormatException e) {
			System.out.println("Blad! To nie jest liczba ca�kowita"); 
		}
		
		sc.close();
	}
/*
 * 1. Zaimplementuj metod� "silnia" obliczaj�c� silni� (przy u�yciu instrukcji for).

Dla jakiego najwi�kszego parametru x metoda zwr�ci poprawn� warto�� (bez modyfikacji podanej deklaracji metody silnia)?
Co jest przyczyn� ograniczenia?  
# dla 13 , bo problemem jest zakres bitowy (pojemno��)

 */
	
	private static int silnia(int x) {
		int iloczyn = 1;
		for (int i = 1; i<= x; i++) {
			
			iloczyn *= i;  
		}
			
		return iloczyn;
	}
	
	
	
	//2. W metodzie "silnia2" (obliczaj�cej silni� przy u�yciu instrukcji for) zmie� implementacj� z metody "silnia", tak �eby r�wnie� dla wi�kszych parametr�w x wyznaczana by�a poprawna warto�� (do 20 w��cznie).
	private static long silnia2(long x) {
		long iloczyn = 1;
		for (int i = 1; i<= x; i++) {
			
			iloczyn *= i;
		}
			
		return iloczyn;
	}
	/*
	3. Zadanie dla ch�tnych: Zaimplementuj metod� "silnia3" obliczaj�c� silni� dla du�ych liczb.
	Podpowied�: do reprezentacji liczb ca�kowitych skorzystaj z klasy BigInteger
	 */
	
	private static BigInteger silnia3(long x) {
		BigInteger iloczyn = BigInteger.valueOf(1);
		for (int i = 1; i<= x; i++) {
			
			iloczyn = iloczyn.multiply(BigInteger.valueOf(i));
		}
			
		return iloczyn;
	}
	
	
	//4. Zaimplementuj metod� "silnia4" obliczaj�c� silni� za pomoc� rekurencji.
	private static int silnia4(int x) {
		if (x <= 1) {
			return 1;
		}else return x * silnia4(x - 1);
	}
		
	/*
	 * 6. Zaimplementuj metod� "fibonacci" obliczaj�c� wyrazy ci�gu Fibonacciego za pomoc� rekurencji.
	Jaka jest warto�� 30, 35, 40 i 45 wyrazu ci�gu Fibonacciego?
	Dlaczego obliczenia tak d�ugo trwaj�?
	 */
	private static int fibonacci(int x) {
		if (x <= 1) {
			return x;
		} 	return fibonacci(x-1) + fibonacci(x-2);
	
	}


/*Jaki jest 30, 35, 40 i 45 wyraz ci�gu Fibonacciego?
	30 = 832040
	35 = 9227465		
	40 = 102334155
	45 = 1134903170
*/

 
// 8. Zaimplementuj metod� "fibonacci2" obliczaj�c� wyrazy ci�gu Fibonacciego za pomoc� p�tli for, bez rekurencji.

 private static int fibonacci2(int x) {
		int m = 0;
		int n = 1;		
		
	 if (x == 0) return m;
	 if (x == 1) return n;
		int result = 0;
		for (int i = 2; i <= x; i++) {
			result = m + n;
			m=n;
			n = result;
		}
		return result;
	}
 }
// metoda fibonacci2 dzia�a szybciej ni� metoda fibonacci
