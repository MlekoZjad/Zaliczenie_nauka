import java.util.Scanner;

 
public class PodzielnePrzez2_7 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		//pobieranie 2 zmiennych
		System.out.println("Wprowad¿ a");
		int a = scan.nextInt();
		
		System.out.println("Wprowad¿ b");
		int b = scan.nextInt();
		scan.close();
		
		
		System.out.println("Liczby podzielne przez 2: ");
		StringBuilder sb = new StringBuilder();
        for(int i = a ; i <= b; i++) {
            if (i%3==0) {
                sb.append(i + ",");
            }
           
        }
        System.out.println(sb);
        
        System.out.println("liczby podzielne przez 7: ");
        StringBuilder sb1 = new StringBuilder();
        for(int i = a; i <= b; i++) {
            if (i%7==0) {
            	   sb1.append(i + ","); 
                }
        }
        System.out.println(sb1);

   
		System.out.println("liczby podzielne przez 2 i 7: ");
		StringBuilder sb2 = new StringBuilder();
    	for(int i = a ; i <= b; i++) {
    		if (i%7==0 && i%2==0) {
    			   sb2.append(i + ","); 
    			}
    	}
        System.out.println(sb2);

}

}


