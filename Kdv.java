import java.util.Scanner;

public class Kdv {

    public static void main(String[] args) {

        double tutar, Kdvoranı=0.18;


        Scanner input = new Scanner(System.in);

        System.out.print( "Fiyat Giriniz : ");
        tutar = input.nextInt();

        double kdvTutar = ( tutar * Kdvoranı ) ;
        System.out.println("KDV oranı : " + Kdvoranı);

        double kdvliTutar = tutar * 1.18;
        System.out.println("KDV Tutarı : " + kdvTutar);

        double kdvliFiyat = (tutar * Kdvoranı + tutar);
        System.out.println("KDVli Fiyat : " + kdvliFiyat);


    }
}
