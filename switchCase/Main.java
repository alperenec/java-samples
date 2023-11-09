package SwitchCase;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		int sayi=scan.nextInt();
		
		switch(sayi){
		case 1: 
			System.out.println("bir");
			break;
		case 2: 
			System.out.println("iki");
			break;
		case 3: 
			System.out.println("uc");
			break;
		case 4: 
			System.out.println("dort");
			break;
		default:
			System.out.println("geçersiz sayi");
			break;
	}
		*/
		
		Scanner scan = new Scanner(System.in);
		int bakiye = 1000;
		int islem;
		
		System.out.println("1: bakiye görüntüle");
		System.out.println("2: para yatırma");
		System.out.println("3: para çekme");
		System.out.println("4: sistemden çıkış");
		
		islem=scan.nextInt();
		
		switch(islem) {
		case 1:
			System.out.println("Bakiyeniz: "+bakiye+" TL'dir");
			break;
			
		case 2:
			System.out.println("Ne kadar yatıracaksın?");
			int miktar =scan.nextInt();
			bakiye += miktar;
			System.out.println("Bakiyeniz: "+bakiye+" TL'dir");
			break;
			
		case 3:
			System.out.println("Ne kadar çekeseksin?");
			miktar =scan.nextInt();
			bakiye -= miktar;
			System.out.println("Bakiyeniz: "+bakiye+" TL'dir");
			break;
			
		case 4:
			System.out.println("Çıkış yaptınız, hoşçakalın");
			break;
			
		default:
			System.out.println("Geçersiz işlem");
		}
		
	}
}








