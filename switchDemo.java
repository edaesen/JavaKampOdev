package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A';
		
		switch (grade) {
		//case durum demek: eğer durum A ise
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok güzel : Geçtiniz");
			break;
		case 'C' : 
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D' :
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F' :
			System.out.println("Maalesef Kaldınız");
			break;
		default:
				System.out.println("Geçersiz not girdiniz!");
				
				//aynı girdiyi almak istiyorsak alt alta yazabiliriz
				// char: 'B':
				// char: 'C' : şeklinde
				
		}

	}

}
