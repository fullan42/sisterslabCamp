package homework3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SatisTakibi {

    public static void satis() {
        HashMap<String, Double> satislar = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Satış Ekle");
            System.out.println("2 - En Çok Satan Müşteri");
            System.out.println("3 - Çıkış");
            System.out.print("Seçiminizi yapın: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Müşteri adını girin: ");
                    String musteriAdi = scanner.next();
                    System.out.print("Satış miktarını girin: ");
                    double satisMiktari = scanner.nextDouble();
                    satislar.put(musteriAdi, satislar.getOrDefault(musteriAdi, 0.0) + satisMiktari);
                    System.out.println(musteriAdi + " müşterisine " + satisMiktari + " birim satış eklendi.\n");
                    break;
                case 2:
                    String enCokSatanMusteri = "";
                    double enCokSatis = 0.0;
                    for (Map.Entry<String, Double> entry : satislar.entrySet()) {
                        if (entry.getValue() > enCokSatis) {
                            enCokSatanMusteri = entry.getKey();
                            enCokSatis = entry.getValue();
                        }
                    }
                    System.out.println("En çok satan müşteri: " + enCokSatanMusteri + " (Toplam satış: " + enCokSatis + ")\n");
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
