//Gerekli kütüphanelerin projeye dahil edilmesi.
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class Mail {

    public static void MailGonder(int secim,String mailiniz,String token,String konu,String mesajiniz) {

        // Mail sunucusu ayarlarının tanımı.
        Properties kaynaklarnesnesi = new Properties();
        kaynaklarnesnesi.put("mail.smtp.host", "smtp.gmail.com");
        kaynaklarnesnesi.put("mail.smtp.port", "587");
        kaynaklarnesnesi.put("mail.smtp.auth", "true");
        kaynaklarnesnesi.put("mail.smtp.starttls.enable", "true");

        // Oturum nesnesi oluşturma.
        Session oturumnesnesi = Session.getInstance(kaynaklarnesnesi, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(mailiniz, token);
        }
        });

        //Kullanıcının yaptığı seçimin sonucunda ne olacağına programın karar vereceği mantıksal kapı tanımlaması.
        switch (secim){
            case 1:{
                //Elit üyelerin maillerinin döndürülebilmesi için gerekli döngü tanımı.
                for (int i=0;i<Main.elituyesayaci;i++){
                    try {
                        // Mesaj oluşturma.
                        Message mesaj = new MimeMessage(oturumnesnesi);
                        mesaj.setRecipients(Message.RecipientType.TO, InternetAddress.parse(Main.elituyeler[i][2]));
                        mesaj.setSubject(konu);
                        mesaj.setText(mesajiniz);

                        // Maili gönderme.
                        Transport.send(mesaj);

                        System.out.println(Main.elituyeler[i][2]+"Adresine Mailiniz Başarıyla Gönderildi!");

                    }

                    //Hata yakalama fonksiyonu tanımı.
                    catch (MessagingException hata0) {
                        System.out.println("Mail, bilinmeyen bir hata oluştuğu için gönderilemedi! - "+hata0.getMessage());
                    }
                    catch (NullPointerException hata1){
                        System.out.println("Mail, hedef mail adresi girilmediğinden gönderilemedi! - "+hata1.getMessage());
                    }
                }
                break;
            }

            case 2:{
                //Genel üyelerin maillerinin döndürülebilmesi için gerekli döngü tanımı.
                for (int i=0;i<Main.geneluyesayaci+1;i++){
                    try {
                        // Mesaj oluşturma.
                        Message mesaj = new MimeMessage(oturumnesnesi);
                        mesaj.setRecipients(Message.RecipientType.TO, InternetAddress.parse(Main.geneluyeler[i][2]));
                        mesaj.setSubject(konu);
                        mesaj.setText(mesajiniz);

                        // Maili gönderme.
                        Transport.send(mesaj);

                        System.out.println(Main.geneluyeler[i][2]+"Adresine Mailiniz Başarıyla Gönderildi!");

                    }

                    //Hata yakalama fonksiyonu tanımı.
                    catch (MessagingException hata0) {
                        System.out.println("Mail, bilinmeyen bir hata oluştuğu için gönderilemedi! - "+hata0.getMessage());
                    }
                    catch (NullPointerException hata1){
                        System.out.println("Mail, hedef mail adresi girilmediğinden gönderilemedi! - "+hata1.getMessage());
                    }
                }
                break;
            }

            case 3:{
                //Elit üyelerin maillerinin döndürülebilmesi için gerekli döngü tanımı.
                for (int i=0;i<Main.elituyesayaci;i++){
                    try {
                        // Mesaj oluşturma.
                        Message mesaj = new MimeMessage(oturumnesnesi);
                        mesaj.setRecipients(Message.RecipientType.TO, InternetAddress.parse(Main.elituyeler[i][2]));
                        mesaj.setSubject(konu);
                        mesaj.setText(mesajiniz);

                        // Maili gönderme.
                        Transport.send(mesaj);

                        System.out.println(Main.elituyeler[i][2]+"Adresine Mailiniz Başarıyla Gönderildi!");

                    }

                    //Hata yakalama fonksiyonu tanımı.
                    catch (MessagingException hata0) {
                        System.out.println("Mail, bilinmeyen bir hata oluştuğu için gönderilemedi! - "+hata0.getMessage());
                    }
                    catch (NullPointerException hata1){
                        System.out.println("Mail, hedef mail adresi girilmediğinden gönderilemedi! - "+hata1.getMessage());
                    }
                }
                //Genel üyelerin maillerinin döndürülebilmesi için gerekli döngü tanımı.
                for (int i=0;i<Main.geneluyesayaci;i++){
                    try {
                        // Mesaj oluşturma.
                        Message mesaj = new MimeMessage(oturumnesnesi);
                        mesaj.setRecipients(Message.RecipientType.TO, InternetAddress.parse(Main.geneluyeler[i][2]));
                        mesaj.setSubject(konu);
                        mesaj.setText(mesajiniz);

                        // Maili gönderme.
                        Transport.send(mesaj);

                        System.out.println(Main.geneluyeler[i][2]+"Adresine Mailiniz Başarıyla Gönderildi!");

                    }

                    //Hata yakalama fonksiyonu tanımı.
                    catch (MessagingException hata0) {
                        System.out.println("Mail, bilinmeyen bir hata oluştuğu için gönderilemedi! - "+hata0.getMessage());
                    }
                    catch (NullPointerException hata1){
                        System.out.println("Mail, hedef mail adresi girilmediğinden gönderilemedi! - "+hata1.getMessage());
                    }
                }
                break;
            }

            //Kullanıcının beklenmeyen giriş yapması sonucu yapılacak işlemler.
            default:break;
        }
    }
}