package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1="Engin";
		String ogrenci2="Eda";
		String ogrenci3="Dilek";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		String[] ogrenciler = new String[3]; //bir diziyi bu şekilde tanımlarız
		//java csharp gibi dillerde index sıfırdan başlar
		ogrenciler[0]="Engin";
		ogrenciler[1]="Eda";
		ogrenciler[2]="Dilek";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
			//bu kısım sabit kalacak
			
		for (String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		}
				
		
	}

}
