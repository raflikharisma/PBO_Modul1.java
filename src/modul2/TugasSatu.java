package modul2;

import java.text.DecimalFormat;
import java.util.Scanner;

class HitungNilai
{
    Scanner userInput =  new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.##");
    private double nilaiOrkom;
    private double nilaiProgdas;
    private double nilaiKalkulus;
    private double average;

    public void setNilaiOrkom(double nilaiOrkom)
    {
    this.nilaiOrkom = nilaiOrkom;
    }
    public void setNilaiProgdas(double nilaiProgdas)
    {
        this.nilaiProgdas = nilaiProgdas;
    }
    public void setNilaiKalkulus(double nilaiKalkulus)
    {
        this.nilaiKalkulus = nilaiKalkulus;
    }
    public double getNilaiOrkom()
    {
        return nilaiOrkom;
    }
    public double getNilaiProgdas()
    {
        return nilaiProgdas;
    }
    public double getNilaiKalkulus()
    {
        return nilaiKalkulus;
    }
    public void input()
    {
        System.out.print("Nilai Orkom\t\t: ");
        nilaiOrkom = userInput.nextDouble();
        setNilaiOrkom(nilaiOrkom);

        System.out.print("Nilai Progdas\t: ");
        nilaiProgdas = userInput.nextDouble();
        setNilaiProgdas(nilaiProgdas);

        System.out.print("Nilai Kalkulus\t: ");
        nilaiKalkulus = userInput.nextDouble();
        setNilaiKalkulus(nilaiKalkulus);
    }
    public void display()
    {
        System.out.println("\nNilai anda : ");
        System.out.println("Nilai Orkom\t\t: "+ getNilaiOrkom());
        System.out.println("Nilai Progdas\t: "+ getNilaiProgdas());
        System.out.println("Nilai Kalkulus\t: "+ getNilaiKalkulus());
    }


    public void cekNilai(){
        average = (getNilaiKalkulus() + getNilaiProgdas() + getNilaiOrkom())/3;
        System.out.println("\nRata-rata\t: "+ df.format(average));
        if(average >= 70)
        {
            System.out.println("Status\t: LULUS");
        }
        else{
            System.out.println("Status\t: GAGAL");
        }
    }

}

public class TugasSatu
{
    public static void main(String[]args)
    {
        HitungNilai hasil = new HitungNilai();
        hasil.input();
        hasil.display();
        hasil.cekNilai();

    }
}
