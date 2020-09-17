import java.util.Scanner;

public class SumaCyfr {


	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
       
		//pobieranie liczby od u¿ytkownika
		System.out.println("Wprowad¿ a");
		int a = scan.nextInt();
		
		
		dzialanie(a);
		scan.close();
	}
	public static void dzialanie(int a) {
	                     
        int suma = 0;
        while (a > 0) {
            suma = suma + a % 10;
            a = a / 10;
        }
            System.out.println("Wynik sumowania cyfr liczby "+ a + " to "+suma); 

        }
          
        
      }
