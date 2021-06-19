import java.util.Scanner;
// İf/else kullanmadan Geçti/Kaldı projesi
public class a {
    public static void main(String[] args) {

        int mat,fzk,kmy,trk,trh,mzk;
        Scanner deger= new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz:");
        mat= deger.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        fzk= deger.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        kmy= deger.nextInt();
        System.out.println("Türkçe notunuzu giriniz:");
        trk= deger.nextInt();
        System.out.println("Tarih notunuzu giriniz:");
        trh= deger.nextInt();
        System.out.println("Müzik notunuzu giriniz:");
        mzk= deger.nextInt();
        int ort;
        ort=(mat+fzk+kmy+trk+trh+mzk)/6;
        System.out.println("Ortalamanız: " +ort);
        System.out.println( ort >= 60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız" );

    }
}
