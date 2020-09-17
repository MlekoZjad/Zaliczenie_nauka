import java.util.Scanner;

public class Mnozenie_cyfr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.close();
		System.out.println(mnozenie(a));
	}

	public static int mnozenie(int a) {
		int mnozenie = 1;
		while (a > 0) {
			mnozenie = mnozenie * (a % 10);
			a = a / 10;
		}
		return mnozenie;
	}
}
