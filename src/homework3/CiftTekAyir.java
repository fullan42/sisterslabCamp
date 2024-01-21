package homework3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class CiftTekAyir {

    public static void ciftTekAyir() {
        ArrayList<Integer> sayiListesi = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            sayiListesi.add(random.nextInt(100));
        }

        System.out.println("Rastgele Sayılar: " + sayiListesi);

        HashSet<Integer> ciftSayilar = new HashSet<>();
        ArrayList<Integer> tekSayilar = new ArrayList<>();

        for (int sayi : sayiListesi) {
            if (sayi % 2 == 0) {
                ciftSayilar.add(sayi);
            } else {
                tekSayilar.add(sayi);
            }
        }

        System.out.println("Çift Sayılar: " + ciftSayilar);
        System.out.println("Tek Sayılar: " + tekSayilar);
    }
}
