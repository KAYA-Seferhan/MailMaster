//Gerekli kütüphanenin projeye dahil edilmesi.
import java.io.*;

public class Uye {
    public static class ElitUye extends Uye{
        public static void elituyeyaz(String ad, String soyad, String mail){
            //Kullanıcıdan alınan verileri parametre şeklinde alan ve 2 boyutlu dizye veriyi tanımlayan fonksiyon.
            Main.elituyeler[Main.elituyesayaci][0] = ad;
            Main.elituyeler[Main.elituyesayaci][1] = soyad;
            Main.elituyeler[Main.elituyesayaci][2] = mail;

            //Diziye kayıtlı elit üyelerin bilgilerini ekrana yazdıran döngü.
            for (int x=0;x<(Main.elituyesayaci+1);x++){
                for (int y=0;y<3;y++){
                    System.out.print(Main.elituyeler[x][y]);
                }
                System.out.print("\n");
            }
        }
    }

    public static class GenelUye extends Uye{
        public static void geneluyeyaz(String ad, String soyad, String mail){
            //Kullanıcıdan alınan verileri parametre şeklinde alan ve 2 boyutlu dizye veriyi tanımlayan fonksiyon.
            Main.geneluyeler[Main.geneluyesayaci][0] = ad;
            Main.geneluyeler[Main.geneluyesayaci][1] = soyad;
            Main.geneluyeler[Main.geneluyesayaci][2] = mail;

            //Diziye kayıtlı elit üyelerin bilgilerini ekrana yazdıran döngü.
            for (int x=0;x<(Main.geneluyesayaci+1);x++){
                for (int y=0;y<3;y++){
                    System.out.println(Main.geneluyeler[x][y]);
                }
                System.out.print("\n");
            }
        }
    }

    public static class Son extends Uye{
        public static void dosyayayaz(String[][] elituyeler,String[][] geneluyeler){
            try {
                //Metin dosyasını oluşturarak içine veri yazmaya yarayan nesne tanımlaması.
                Writer yaz = new FileWriter("Kullanıcılar.txt",false);

                //Verileri uygun formatta yazmaya yönelik nesnenin write methodunu ve döngüleri kullanır.
                yaz.write("#ELİT ÜYELER#\n");
                for (int x=0;x<Main.elituyesayaci;x++){
                    for (int y=0;y<3;y++){
                        yaz.write(elituyeler[x][y]+"    ");
                    }
                    yaz.write("\n");
                }
                yaz.write("\n#GENEL ÜYELER#\n");
                for (int x=0;x<Main.geneluyesayaci;x++){
                    for (int y=0;y<3;y++){
                        yaz.write(geneluyeler[x][y]+"    ");
                    }
                    yaz.write("\n");
                }
                yaz.close();
            }

            //Hata yakalama fonksiyonu tanımı.
            catch (IOException hata0) {
                System.out.println("Dosyaya yazma işlemi sırasında bilinmeyen bir hata oluştu. - "+hata0.getMessage());
            }
        }
    }
}
