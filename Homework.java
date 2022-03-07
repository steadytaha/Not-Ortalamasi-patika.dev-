import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float fizik , mat, kimya, muzik, tarih, ort;

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextFloat();

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextFloat();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextFloat();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextFloat();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextFloat();

        ort = (fizik + mat + kimya + muzik + tarih)/5;
        String basarılıDurumu= (ort>=50)  ? "Geçti" : "Kaldı";
        System.out.print("Dönem ortalamanız: " + ort);
        System.out.print(" " +basarılıDurumu);

    }
}
