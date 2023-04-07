package modul2;
import java.util.Scanner;


class BelahKetupat{
    Scanner userInput = new Scanner(System.in);

    private double diagonal1;
    private double diagonal2;
    private double sisi;

    public void setDiagonal1(double diagonal1){
        this.diagonal1 = diagonal1;
    }
    public void setDiagonal2(double diagonal2){
        this.diagonal2 = diagonal2;
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    public double getDiagonal1(){
        return diagonal1;
    }
    public double getDiagonal2() {
        return diagonal2;
    }
    public double getSisi() {
        return sisi;
    }
    public void luas(){
        double luasBk;
        System.out.print("Input Diagonal 1\t: ");
        diagonal1 = userInput.nextDouble();
        setDiagonal1(diagonal1);
        System.out.print("Input Diagonal 2\t: ");
        diagonal2 = userInput.nextDouble();
        setDiagonal2(diagonal2);
        luasBk = (getDiagonal1() + getDiagonal2())/2;
        System.out.println("Luas Belah Ketupat\t: "+ luasBk);
    }
    public void keliling(){
        double kelilingBk;
        System.out.print("Input Sisi\t: ");
        sisi = userInput.nextDouble();
        setSisi(sisi);
        kelilingBk = getSisi() * 4;
        System.out.println("Keliling Belah Ketupat\t: " + kelilingBk);
    }

}
public class Kalkulator {
    public static void main(String[] args) {
        BelahKetupat hitung1 = new BelahKetupat();
        int choice;
        Scanner chc = new Scanner(System.in);
        do {
            System.out.println("Apa yang ingin anda cari");
            System.out.println("1. Luas Belah Ketupat");
            System.out.println("2. Keliling Belah Ketupat");
            System.out.println("3. Exit");
            System.out.print("Apa yang ingin anda cari\t: ");
            choice = chc.nextInt();
            switch (choice) {
                case 1 -> hitung1.luas();
                case 2 -> hitung1.keliling();
            }
        } while (choice <= 2);
    }
}
