package modul2;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[]args)
    {
        double bulan, hari, detik, menit, jam;
        Scanner input = new Scanner(System.in);
        System.out.print("Input jumlah bulan yang ingin dikonversi : ");
        bulan = input.nextDouble();
        hari = bulan * 30;
        jam = bulan * 720;
        menit = bulan * 43800;
        detik = bulan * 2678400;

        System.out.println(bulan + " Bulan = " + hari + " Hari");
        System.out.println(bulan + " Bulan = " + jam + " Jam");
        System.out.println(bulan + " Bulan = " + menit + " Menit");
        System.out.println(bulan + " Bulan = " + detik + " Detik");


    }
}
