//Gerekli kütüphanenin projeye dahil edilmesi.
import java.util.Scanner;

public class Main {
    public static int elituyesayaci = 0;//Elit üyeleri saymaya yarayan ve basit sayı tipinde veri tutarak sayaç görevi gören değişken tanımlaması.
    public static String[][] elituyeler = new String[50][3];//Elit üyelerin bilgilerini içinde tutacak olan 2 boyutlu dizi tanımlaması.
    public static int geneluyesayaci = 0;//Genel üyeleri saymaya yarayan ve basit sayı tipinde veri tutarak sayaç görevi gören değişken tanımlaması.
    public static String[][] geneluyeler = new String[50][3];//Genel üyelerin bilgilerini içinde tutacak olan 2 boyutlu dizi tanımlaması.

    public static void main(String[] args) {
        Scanner okuint = new Scanner(System.in);//integer tipindeki verileri okumaya yarayan Scanner nesnesi tanımlaması.
        Scanner okuString = new Scanner(System.in);//String tipindeki verileri okumaya yarayan Scanner nesnesi tanımlaması.

        //Giriş mesajının ekrana yazdırılması.
        System.out.println("\n");
        System.out.println("                            - MailMaster©' a Hoş Geldiniz. -");
        System.out.println("                                                                                                    \n" +
                "                           ,,    ,,                                                                 \n" +
                "`7MMM.     ,MMF'           db  `7MM      `7MMM.     ,MMF'                   mm                      \n" +
                "  MMMb    dPMM                   MM        MMMb    dPMM                     MM                      \n" +
                "  M YM   ,M MM   ,6\"Yb.  `7MM    MM        M YM   ,M MM   ,6\"Yb.  ,pP\"Ybd mmMMmm   .gP\"Ya  `7Mb,od8 \n" +
                "  M  Mb  M' MM  8)   MM    MM    MM        M  Mb  M' MM  8)   MM  8I   `\"   MM    ,M'   Yb   MM' \"' \n" +
                "  M  YM.P'  MM   ,pm9MM    MM    MM        M  YM.P'  MM   ,pm9MM  `YMMMa.   MM    8M\"\"\"\"\"\"   MM     \n" +
                "  M  `YM'   MM  8M   MM    MM    MM        M  `YM'   MM  8M   MM  L.   I8   MM    YM.    ,   MM     \n" +
                ".JML. `'  .JMML.`Moo9^Yo..JMML..JMML.    .JML. `'  .JMML.`Moo9^Yo.M9mmmP'   `Mbmo  `Mbmmd' .JMML.   \n");

        //Ana menünün sonsuz döngü içine alınması.
        while (true){
            //Ana menü ve giriş yönergelerinin ekrana yazdırılması.
            System.out.println("                           ____________________________________________ ");
            System.out.println("                          /      Lütfen Yapmak İstediğiniz İşlemi      \\");
            System.out.println("                          | Satır Sonunda Bulunan Sayıyı Girerek Seçin |");
            System.out.println("                          |--------------------------------------------|");
            System.out.println("                          | Elit Üye Eklemek için       -> 1 <-        |");
            System.out.println("                          |--------------------------------------------|");
            System.out.println("                          | Genel Üye Eklemek için      -> 2 <-        |");
            System.out.println("                          |--------------------------------------------|");
            System.out.println("                          | Mail Göndermek için         -> 3 <-        |");
            System.out.println("                          |--------------------------------------------|");
            System.out.println("                          | Programdan Çıkmak için      -> 4 <-        |");
            System.out.println("                          \\--------------------------------------------/");
            System.out.println("UYARI: Uygulamayı Kapatmadan Üyelerin Bilgilerinin İçinde Olduğu \"Kullanıcılar.txt\" Dosyasını Göremeyeceksiniz.");

            int anamenusecim = okuint.nextInt();//Kullanıcıdan yapacağı işlem doğrultusunda seçiminin alınarak ilgili değişkene atanması.

            //Kullanıcının yaptığı seçimin sonucunda ne olacağına programın karar vereceği mantıksal kapı tanımlaması.
            switch (anamenusecim){

                //Kullanıcının 1'i girmesi sonucu yapılacak işlemler.
                case 1:{
                    //Kullanıcıdan Elit üyenin adının alınması ve ilgili fonksiyona bildirmek üzere değişkene atanması.
                    System.out.println("Elit Üyenin Adını Girin.");
                    String ad = okuString.nextLine();

                    //Kullanıcıdan Elit üyenin soyadının alınması ve ilgili fonksiyona bildirmek üzere değişkene atanması.
                    System.out.println("Elit Üyenin Soyadını Girin.");
                    String soyad = okuString.nextLine();

                    //Kullanıcıdan Elit üyenin mailin alınması ve ilgili fonksiyona bildirmek üzere değişkene atanması.
                    System.out.println("Elit Üyenin Mailini Girin");
                    String mail = okuString.nextLine();

                    //Alınan ve değişkenlere atanarak kısa süreli hafızada tutulan verilerin ilgili fonksiyona iletilerek işlenmesi.
                    Uye.ElitUye.elituyeyaz(ad,soyad,mail);

                    //Elit üye adedini belirten sayacın arttırılması.
                    elituyesayaci++;
                    break;
                }

                //Kullanıcının 2'i girmesi sonucu yapılacak işlemler.
                case 2:{
                    //Kullanıcıdan Genel üyenin adının alınması ve ilgili fonksiyona bildirmek üzere değişkene atanması.
                    System.out.println("Genel Üyenin Adını Girin.");
                    String ad = okuString.nextLine();

                    //Kullanıcıdan Genel üyenin soyadının alınması ve ilgili fonksiyona bildirmek üzere değişkene atanması.
                    System.out.println("Genel Üyenin Soyadını Girin.");
                    String soyad = okuString.nextLine();

                    //Kullanıcıdan Genel üyenin mailin alınması ve ilgili fonksiyona bildirmek üzere değişkene atanması.
                    System.out.println("Genel Üyenin Mailini Girin");
                    String mail = okuString.nextLine();

                    //Alınan ve değişkenlere atanarak kısa süreli hafızada tutulan verilerin ilgili fonksiyona iletilerek işlenmesi.
                    Uye.GenelUye.geneluyeyaz(ad,soyad,mail);

                    //Genel üye adedini belirten sayacın arttırılması.
                    geneluyesayaci++;
                    break;
                }

                //Kullanıcının 3'i girmesi sonucu yapılacak işlemler.
                case 3:{
                    //İkincil menü ve giriş yönergelerinin ekrana yazdırılması.
                    System.out.println("                           ____________________________________________ ");
                    System.out.println("                          /      Lütfen Yapmak İstediğiniz İşlemi      \\");
                    System.out.println("                          | Satır Sonunda Bulunan Sayıyı Girerek Seçin |");
                    System.out.println("                          |--------------------------------------------|");
                    System.out.println("                          | Elit Üyelere Mail Göndermek için  -> 1 <-  |");
                    System.out.println("                          |--------------------------------------------|");
                    System.out.println("                          | Genel Üyelere Mail Göndermek için -> 2 <-  |");
                    System.out.println("                          |--------------------------------------------|");
                    System.out.println("                          | Tüm Üyelere Mail Göndermek için   -> 3 <-  |");
                    System.out.println("                          |--------------------------------------------|");
                    System.out.println("                          | Programdan Çıkmak için            -> 4 <-  |");
                    System.out.println("                          |--------------------------------------------|");
                    System.out.println("                          | Üst Menüye Dönmek için            -> 5 <-  |");
                    System.out.println("                          \\--------------------------------------------/");
                    System.out.println("UYARI: Uygulamayı Kapatmadan Üyelerin Bilgilerinin İçinde Olduğu \"Kullanıcılar.txt\" Dosyasını Göremeyeceksiniz.");

                    int ikincilmenusecim = okuint.nextInt();//Kullanıcıdan yapacağı işlem doğrultusunda seçiminin alınarak ilgili değişkene atanması.

                    //Kullanıcının yaptığı seçimin sonucunda ne olacağına programın karar vereceği mantıksal kapı tanımlaması.
                    switch (ikincilmenusecim){
                        //Kullanıcının 1'i girmesi sonucu yapılacak işlemler.
                        case 1:{
                            //Kullanıcıdan göndereceği mailin kaynak mail adresinin alınması.
                            System.out.println("Gönderen Mail Adresini Girin.");
                            String mailin = okuString.nextLine();

                            //Kullanıcıdan programın göndereceği mailin kaynak mail adresine ulaşmasını sağlayacak Token bilgisinin alınması.
                            System.out.println("Orjinal Mail Servis Sağlayıcısından Aldığınız ve Bu İşlemi Onaylayacak Token' ı Girin.");
                            String token = okuString.nextLine();

                            //Kullanıcıdan göndereceği mailin konusunun alınması.
                            System.out.println("Mailin Konusunu Girin");
                            String konu = okuString.nextLine();

                            //Kullanıcıdan göndereceği mailin mesajının alınması.
                            System.out.println("Maille Gönderilecek Mesajı Girin");
                            String mesaj = okuString.nextLine();

                            //Alınan ve değişkenlere atanarak kısa süreli hafızada tutulan verilerin ilgili fonksiyona iletilerek işlenmesi.
                            Mail.MailGonder(ikincilmenusecim,mailin,token,konu,mesaj);
                            break;
                        }

                        //Kullanıcının 2'i girmesi sonucu yapılacak işlemler.
                        case 2:{
                            //Kullanıcıdan göndereceği mailin kaynak mail adresinin alınması.
                            System.out.println("Gönderen Mail Adresini Girin.");
                            String mailin = okuString.nextLine();

                            //Kullanıcıdan programın göndereceği mailin kaynak mail adresine ulaşmasını sağlayacak Token bilgisinin alınması.
                            System.out.println("Orjinal Mail Servis Sağlayıcısından Aldığınız ve Bu İşlemi Onaylayacak Token' ı Girin.");
                            String token = okuString.nextLine();

                            //Kullanıcıdan göndereceği mailin konusunun alınması.
                            System.out.println("Mailin Konusunu Girin");
                            String konu = okuString.nextLine();

                            //Kullanıcıdan göndereceği mailin mesajının alınması.
                            System.out.println("Maille Gönderilecek Mesajı Girin");
                            String mesaj = okuString.nextLine();

                            //Alınan ve değişkenlere atanarak kısa süreli hafızada tutulan verilerin ilgili fonksiyona iletilerek işlenmesi.
                            Mail.MailGonder(ikincilmenusecim,mailin,token,konu,mesaj);
                            break;
                        }

                        //Kullanıcının 3'i girmesi sonucu yapılacak işlemler.
                        case 3:{
                            //Kullanıcıdan göndereceği mailin kaynak mail adresinin alınması.
                            System.out.println("Gönderen Mail Adresini Girin.");
                            String mailin = okuString.nextLine();

                            //Kullanıcıdan programın göndereceği mailin kaynak mail adresine ulaşmasını sağlayacak Token bilgisinin alınması.
                            System.out.println("Orjinal Mail Servis Sağlayıcısından Aldığınız ve Bu İşlemi Onaylayacak Token' ı Girin.");
                            String token = okuString.nextLine();

                            //Kullanıcıdan göndereceği mailin konusunun alınması.
                            System.out.println("Mailin Konusunu Girin");
                            String konu = okuString.nextLine();

                            //Kullanıcıdan göndereceği mailin mesajının alınması.
                            System.out.println("Maille Gönderilecek Mesajı Girin");
                            String mesaj = okuString.nextLine();

                            //Alınan ve değişkenlere atanarak kısa süreli hafızada tutulan verilerin ilgili fonksiyona iletilerek işlenmesi.
                            Mail.MailGonder(ikincilmenusecim,mailin,token,konu,mesaj);
                            break;
                        }

                        //Kullanıcının 4'i girmesi sonucu yapılacak işlemler.
                        case 4:{
                            //Kullnıcının girdiği ve programın 2 boyutlu dizilere kaydettiği verilerin metin belgesine yazılmasına yarayan fonksiyonun çağrılması.
                            Uye.Son.dosyayayaz(elituyeler,geneluyeler);

                            //Programın güvenli bir şekilde kapatılmasına yarayan fonksiyonun çağırılması.
                            System.exit(0);
                            break;
                        }

                        //Kullanıcının 5'i girmesi sonucu yapılacak işlemler.
                        case 5:{
                            //Bir üst menüye dönmek için dongünün tekrar aktif hale gelmesine yarayan kırılma noktası.
                            break;
                        }

                        //Kullanıcının beklenmeyen giriş yapması sonucu yapılacak işlemler.
                        default:{
                            //Ekrana bilgilendirme mesajının yazılması.
                            System.out.println("Karşılıksız Giriş Yaptınız, Lütfen Tekrar Deneyiniz.");
                            break;
                        }
                    }
                    break;
                }

                //Kullanıcının 4'i girmesi sonucu yapılacak işlemler.
                case 4:{
                    //Kullnıcının girdiği ve programın 2 boyutlu dizilere kaydettiği verilerin metin belgesine yazılmasına yarayan fonksiyonun çağrılması.
                    Uye.Son.dosyayayaz(elituyeler,geneluyeler);
                    System.exit(0);
                    break;
                }

                //Kullanıcının beklenmeyen giriş yapması sonucu yapılacak işlemler.
                default:{
                    System.out.println("Karşılıksız Giriş Yaptınız, Lütfen Tekrar Deneyiniz.");
                    break;
                }
            }
        }
    }
}