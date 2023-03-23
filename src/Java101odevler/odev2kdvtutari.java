package Java101odevler;
import java.util.Scanner;
public class odev2kdvtutari {
    public static void main(String[] args) {
        double para,kdvorani=0.18;
        Scanner input=new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz:");
        para=input.nextDouble();
        double kdvlipara= para*kdvorani;
        double toplampara=para+kdvlipara;
        System.out.println("KDV siz Fiyat:"+para);
        System.out.println("KDV'li Fiyat:"+toplampara);
        System.out.println("KDV Oranı:"+kdvorani);
    }
}
