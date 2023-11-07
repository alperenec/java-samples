//verilen sesli harf kalın mı ince mi

package miniProject_SwitchCaseStructure;

public class Main {

	public static void main(String[] args) {
		char harf='E';
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
		default:
			System.out.println("İnce sesli harf");
		
		}

	}

}
