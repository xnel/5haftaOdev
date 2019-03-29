package odev;

import java.util.Random;
import java.util.Scanner;

public class KelimeUretec {

	String ogrenciAdiUret(int harfSayisi) {
		
		Random rastgele = new Random();
		char[] alfabe = new char[26];
		char [] ogrenciAdi = new char[harfSayisi];
		

		for (char ch = 'A'; ch <= 'Z'; ++ch) {
			alfabe[ch - 'A'] = ch;
		}
		
		String kelime = "";
		
		for (int k = 0; k < harfSayisi; k++) {

			int y = rastgele.nextInt(26);
			
			ogrenciAdi[k] = alfabe[y];
			kelime += ogrenciAdi[k];
		}
		
		
		return kelime;

	}

}
