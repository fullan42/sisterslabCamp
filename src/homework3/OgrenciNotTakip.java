package homework3;

import java.util.HashMap;
import java.util.Scanner;

public class OgrenciNotTakip {

    public static void ogrencinottakip() {
        HashMap<String, Integer> ogrenciNotlari = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Öğrenci Ekle");
            System.out.println("2 - Not Sorgula");
            System.out.println("3 - Çıkış");
            System.out.print("Seçiminizi yapın: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Öğrenci adını girin: ");
                    String ad = scanner.next();
                    System.out.print("Notunu girin: ");
                    int not = scanner.nextInt();
                    ogrenciNotlari.put(ad, not);
                    System.out.println(ad + " öğrencisi not sisteme eklendi.\n");
                    break;
                case 2:
                    System.out.print("Öğrenci adını girin: ");
                    String sorguAd = scanner.next();
                    if (ogrenciNotlari.containsKey(sorguAd)) {
                        System.out.println(sorguAd + " öğrencisinin notu: " + ogrenciNotlari.get(sorguAd) + "\n");
                    } else {
                        System.out.println("Bu isimde bir öğrenci bulunamadı.\n");
                    }
                    break;
                case 3:
                    System.out.println("Programdan çıkılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.\n");
            }
        }
    }
}
