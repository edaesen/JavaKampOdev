package whileLoop;

public class Main {

	public static void main(String[] args) {
		//For
				for (int i=1;i<10;i++) {
					System.out.println(i);
				}
				System.out.println("Döngü Bitti");
			
			for (int i=2;i<10;i+=2) {
				System.out.println(i);
			}
			System.out.println("For Döngü Bitti");
			
			int i=2;
			//While
			while (i<10) {
				System.out.println(i);
				i+=2;
			}
			
			//infite loop (sonsuz döngü)
			System.out.println("While Döngü Bitti");
			
			
			//Do-While Döngüsü
			int j=1;
			do {
					System.out.println(j);
					j+=2;
			}while (j<10);
			System.out.println("Do-While Döngü Bitti");
			//do-while döngü çalışmasa şart sağlanmasa bile bir kez çalışır
			

	}

}
