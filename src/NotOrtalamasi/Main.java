package NotOrtalamasi;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int matematik,fizik,kimya,turkce,tarih,muzik;
		
		double ortalama;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Matematik Notunuz: ");
		matematik= input.nextInt();
		
		System.out.println("Fizik Notunuz: ");
		fizik= input.nextInt();
		
		System.out.println("Kimya Notunuz: ");
		kimya= input.nextInt();
		
		System.out.println("Türkçe Notunuz: ");
		turkce= input.nextInt();
		
		System.out.println("Tarih Notunuz: ");
		tarih= input.nextInt();
		
		System.out.println("Müzik Notunuz: ");
		muzik= input.nextInt();
		
		ortalama= (matematik+fizik+kimya+turkce+tarih+muzik)/6;
		
		System.out.println("Ortalamanız: "+ortalama);
		
		if(ortalama>60) {
			System.out.println("Geçtiniz");
		}
		else {
			System.out.println("Kaldınız");
		}

	}

}
