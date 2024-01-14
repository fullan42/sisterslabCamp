import java.util.Scanner;

public class homework1 {
    public void hw1(){
        //soru1
        Scanner s = new Scanner(System.in);

        System.out.println("lütfen para değerini girin");
        double deger = s.nextDouble();
        double kdv = 1.3;
        double kdvDeger = deger * kdv;
        System.out.println("kdv tutarı" + "%30" + "\nkdvli fiyat:" + kdvDeger + "\nkdvsiz fiyat" + deger + "\nkdv tutarı:" + (kdvDeger - deger));
        //soru2
        if (deger < 1000 || deger > 0) {
            kdv = 1.1;

        } else if (deger > 1000) {
            kdv = 1.22;
        }
        // soru 3
        System.out.println("lütfen not değerini girin");
        int not = s.nextInt();
        if (not < 50) {
            System.out.println("ff");
        } else if (not > 50 && not < 60) {
            System.out.println("cc");

        } else if (not > 60 && not < 69) {
            System.out.println("cb");

        } else if (not > 70 && not < 79) {
            System.out.println("bb");

        } else if (not > 80 && not < 89) {
            System.out.println("ba");

        } else if (not > 90 && not < 101) {
            System.out.println("aa");

        }


        //soru 4

        int i = 0;
        System.out.println("lütfen yapmak istediğiniz işlemi seçin:" + "1 toplama,2 çıkarma, 3çarpma, 4 bölme");
        i = s.nextInt();
        if (i < 1 || i > 4) {
            System.out.println("lütfen geçerli bi sayı giriniz");
        } else {
            double sayi1 = 0;
            double sayi2 = 0;
            System.out.println("lütfen birinci sayıyı girin");
            sayi1 = s.nextDouble();
            System.out.println("lütfen ikinci sayıyı girin");
            sayi2 = s.nextDouble();
            switch (i) {
                case 1:
                    System.out.println(sayi1 + sayi2);
                    break;
                case 2:
                    System.out.println(sayi1 - sayi2);
                    break;
                case 3:
                    System.out.println(sayi1 * sayi2);
                    break;
                case 4:
                    System.out.println(sayi1 / sayi2);
                    break;
            }
        }

        //soru 5
        System.out.println("lütfen bir sayı giriniz");
        int sayi3 = s.nextInt();

        if (sayi3 % 2 == 0) {
            System.out.println("sayı çift");
        } else {
            System.out.println("sayı tek");
        }
        //soru 6

        System.out.print("Birinci sayıyı girin: ");
        double sayi4 = s.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double sayi5 = s.nextDouble();

        System.out.print("Üçüncü sayıyı girin: ");
        double sayi6 = s.nextDouble();
        if(sayi5==sayi4||sayi5==sayi6||sayi4==sayi6){
            System.out.println("lütfen tüm sayıları farklı giriniz ");
        }else{


        if (sayi4 > sayi5 && sayi6 > sayi5) {
            System.out.println(sayi5);
            if (sayi4 > sayi6) {
                System.out.println(sayi6);
            } else {
                System.out.println(sayi4);
                System.out.println(sayi6);
            }
        } else if (sayi5 > sayi4 && sayi6 > sayi4) {
            System.out.println(sayi4);
            if (sayi5 > sayi6) {
                System.out.println(sayi6);
            } else {
                System.out.println(sayi5);
                System.out.println(sayi6);
            }
        } else if (sayi5 > sayi6 && sayi4 > sayi6) {
            System.out.println(sayi6);
            if (sayi5 > sayi4) {
                System.out.println(sayi4);
            } else {
                System.out.println(sayi5);
                System.out.println(sayi4);
            }
        }
        }

        //soru 7
        System.out.println("lütfen hava durumunu belirtizi " + "1 yağmurlu 2 karlı 3 güneşli 4 açık");
        int hava = s.nextInt();
        if (hava < 1 && hava > 4) {

        } else {
            switch (hava) {
                case 1:
                    System.out.println("yağmurlu");
                    break;
                case 2:
                    System.out.println("karlı");
                    break;
                case 3:
                    System.out.println("günesli");
                    break;
                case 4:
                    System.out.println("açık");
                    break;
            }
        }

        //soru8
        String sembol;
        System.out.println("lütfen birinci sayıyı giriniz ");
        double sayi10 = s.nextInt();
        System.out.println("lütfen ikinci sayıyı giriniz ");
        double sayi11 = s.nextInt();
        System.out.println("lütfen yapmak istediğiniz işlemin işaretini giriniz  " + " + * / -");
        sembol = s.next();
        switch (sembol) {
            case "+":
                System.out.println(sayi10 + sayi11);
                break;
            case "-":
                System.out.println(sayi10 - sayi11);
                break;
            case "*":
                System.out.println(sayi10 * sayi11);
                break;
            case "/":
                System.out.println(sayi10 / sayi11);
                break;

        }


        //soru9
        System.out.println("Hangi geometrik şekli hesaplamak istiyorsun:" + "\n 1-Dikdortgen, 2-Kare, 3-Ucgen");
        System.out.println("Hangi geometrik şekli hesaplamak istiyorsun:");
        System.out.println("1-Dikdörtgen, 2-Kare, 3-Üçgen");
        int secim = s.nextInt();

        switch (secim) {
            case 1:
                System.out.println(" uzun kenarını girin:");
                double uzunKenar = s.nextDouble();
                System.out.println(" kısa kenarını girin:");
                double kisaKenar = s.nextDouble();
                double dikdortgenAlan = uzunKenar * kisaKenar;
                System.out.println("Dikdörtgenin alanı: " + dikdortgenAlan);
                break;

            case 2:
                System.out.println(" kenar uzunluğunu girin:");
                double kenarUzunlugu = s.nextDouble();
                double kareAlan = kenarUzunlugu * kenarUzunlugu;
                System.out.println("Karenin alanı: " + kareAlan);
                break;

            case 3:
                System.out.println(" taban uzunluğunu girin:");
                double tabanUzunlugu = s.nextDouble();
                System.out.println(" yüksekliğini girin:");
                double yukseklik = s.nextDouble();
                double ucgenAlan = 0.5 * tabanUzunlugu * yukseklik;
                System.out.println("Üçgenin alanı: " + ucgenAlan);
                break;

            default:
                System.out.println("lütfen geçerli bir değer girin");
        }
    }
}
