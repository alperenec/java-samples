package miniProject_AsalSayi;

public class Main {

	public static void main(String[] args) {
		int number=-5;
		int remainder = number %2;     //remainder=kalan
		System.out.println(remainder);
		boolean isPrime =true;     //Prime number= asal sayı
		
		if(number==1) {
			System.out.println("sayı asal değil");
			return;
		}
		
		if(number<1) {
			System.out.println("geçersiz sayı");
			return;
		}
		
		
		
		for (int i=2; i<number; i++) {
			if(number%i==0) {
				isPrime=false;
				
			}
			
		}

		if (isPrime) {     //if (isPrime==true)  #AYNI SEY
			
			System.out.println("sayi asaldir");
			
		}else {
			
			System.out.println("sayi asal degil");
		}
		
		
	}

}
