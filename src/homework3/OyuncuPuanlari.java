package homework3;

import java.util.HashMap;
import java.util.Scanner;

public class OyuncuPuanlari {

    public static void oyuncuPuan() {
        HashMap<String, Integer> oyuncuPuanlari = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Puan Ekle");
            System.out.println("2 - Puanları Görüntüle");
            System.out.println("3 - Çıkış");
            System.out.print("Seçiminizi yapın: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Oyuncu adını girin: ");
                    String oyuncuAdi = scanner.next();
                    System.out.print("Puanını girin: ");
                    int puan = scanner.nextInt();
                    oyuncuPuanlari.put(oyuncuAdi, oyuncuPuanlari.getOrDefault(oyuncuAdi, 0) + puan);
                    System.out.println(oyuncuAdi + " oyuncusuna " + puan + " puan eklendi.\n");
                    break;
                case 2:
                    System.out.println("Oyuncu Puanları: " + oyuncuPuanlari + "\n");
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
