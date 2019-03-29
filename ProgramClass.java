package odev;

import java.util.Random;
import java.util.Scanner;

public class ProgramClass {

	public static void main(String[] args) {
		
		KelimeUretec kelimeObje = new KelimeUretec();
		
		
		System.out.println("ogrenci ismi kac karakterli olacak?");
		Scanner oku = new Scanner(System.in);
		int kacKarakter = oku.nextInt();
		
		
		Random rastgele = new Random();
		
		for (int i = 1; i <= 10; i++) {
			
			OgrenciClass ogrenciObje = new OgrenciClass();
			ogrenciObje.ogrencininAdi = kelimeObje.ogrenciAdiUret(kacKarakter);
			
			int ogrenciNo = rastgele.nextInt(100);
			ogrenciObje.ogrencininNumarasi = ogrenciNo;
			System.out.println(i +"." + "ogrencinin ismi= " + ogrenciObje.ogrencininAdi + " " + "numarasý= " + ogrenciObje.ogrencininNumarasi);
			
		}
	

	}

}
