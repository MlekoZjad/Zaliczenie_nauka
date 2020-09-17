	import java.util.Scanner;
	
public class suma_cyfr2 {
	
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz a ");
        int a = sc.nextInt();
        int b = suma(a);
        System.out.println("Wynik sumowania cyfry liczby "+ a + " to "+b);

        sc.close();
}

	    public static int suma(int num) {
	        int suma = 0;
	        while(num !=0 ) {
	            suma += num % 10;
	            num /= 10;
	        }
	        return suma;
	    }
	
}
