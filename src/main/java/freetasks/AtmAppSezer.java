package freetasks;

import java.util.Scanner;

public class AtmAppSezer {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);


        System.out.println("Lütfen adınızı giriniz: ");
        String ad = girdi.nextLine().trim();

        System.out.println("Lütfen soyadınızı giriniz: ");
        String soyad = girdi.nextLine().trim();


        String tamAd = ad + " " + soyad;
        String buyukTamAd = tamAd.toUpperCase();
        System.out.println("Hesabınıza hoş geldiniz \n" + buyukTamAd);


        System.out.println("Lütfen yeni şifrenizi giriniz: ");
        String yeniSifre = girdi.nextLine().trim();
        String kucukYeniSifre = yeniSifre.toLowerCase();


        String kucukAd = ad.toLowerCase().trim();
        String[] adParcalari = kucukAd.split(" ");
        String ad1 = adParcalari[0];
        String ad2 = adParcalari.length > 1 ? adParcalari[1] : ""; // Bu kısım ikinci isim varsa alınır, olmasa da olur bence :)
        String kucukSoyad = soyad.toLowerCase();


        if (kucukYeniSifre.contains(ad1) || kucukYeniSifre.contains(ad2) || kucukYeniSifre.contains(kucukSoyad)) {
            System.out.println("Şifreniz adınızı veya soyadınızı içermemelidir");
        } else {

            int denemeSayisi = 1;
            int anaHesapBakiyesi = 10000;
            boolean sifreDogrulandi = false;

            while (denemeSayisi <= 3) {
                System.out.println("Lütfen şifrenizi doğrulamak için giriniz: ");
                String kullaniciSifresi = girdi.nextLine().trim();

                if (!kullaniciSifresi.equals(yeniSifre)) {
                    System.out.println("Geçersiz şifre. Lütfen tekrar deneyiniz.");
                    denemeSayisi++;
                } else {
                    sifreDogrulandi = true;
                    System.out.println("Ana Hesap Bakiyesi: " + anaHesapBakiyesi + "$");
                    break;
                }
            }

            if (sifreDogrulandi) {

                System.out.println("Çekmek istediğiniz para miktarını giriniz: ");
                int cekilecekMiktar = girdi.nextInt();

                if ((cekilecekMiktar <= anaHesapBakiyesi) && (cekilecekMiktar > 0)) {
                    int kalanBakiye = anaHesapBakiyesi - cekilecekMiktar;
                    System.out.println("Çekilen miktar: " + cekilecekMiktar + "\nKalan bakiye: " + kalanBakiye + "$");
                } else {
                    System.out.println("Çekmek istediğiniz para miktarı 0'dan büyük ve ana hesap bakiyenizden az olmalıdır");
                }
            } else {
                System.out.println("Birden fazla hatalı şifre girişinden dolayı hesap kilitlendi.");
            }
        }
    }
}
