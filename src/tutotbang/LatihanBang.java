package tutotbang;
//import java.util.Scanner;
class Penduduk{
    private  String nama;
    String kota;

    Penduduk(String nama ){
        this.nama = nama;

    }
    //method tanpa parameter
    void display(){
        System.out.println("nama km = " + this.nama);
        System.out.println("kota asal = " + this.kota);
    }
    //method dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    //method dengan return
    String getNama(){
        return this.nama;
    }String getKota(){
        return this.kota;
    }
    //metod dengan return dan parameter
    String sapaKamu(String pesan){
        return pesan + "kamu babi banget ya "+ this.nama;

    }
}
public class LatihanBang {
    public static void main (String[] args){
    Penduduk warga1 = new Penduduk("ucupppp");
    Penduduk warga2 = new Penduduk("bambang");
    warga1.display();
    warga2.display();
    warga1.setNama("bajugurrrrr");
    warga1.display();
    System.out.println(warga1.getNama());
    System.out.println(warga1.getKota());
    String wakwak = warga1.sapaKamu("haiiii");
        System.out.println(wakwak);
    }

}