package kitle_indeks1;

import java.util.Scanner;

public class main {
	public static void main (String[]args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("lütfen boyunuzu giriniz");
		double boy=scanner.nextDouble();
		System.out.println("lütfen kilonuzu giriniz");
		int kilo = scanner.nextInt();
		double bedenkitleindeksi= kilo/ (boy*boy);
		System.out.println("vücut kitle indeksiniz: "+ bedenkitleindeksi);
	}
}
 