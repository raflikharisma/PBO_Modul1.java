package modul1;
//library inputan
import java.util.Scanner;

class Mahasiswa
{
    Scanner userInput = new Scanner(System.in);
    //atribut/prperti
    private String name;
    private String nim;
    private String password;
    //method setter
    public void setName(String name)
    {
    this.name = name;
    }
    public void setNim(String nim)
    {
        this.nim = nim;
    }
    public void setPassword (String password) {
        this.password = password;
    }
    //method getter
    public String getName(){
        return name;
    }
    public String getNim(){
        return nim;
    }
    public String getPassword(){
        return password;
    }
    //inputan user
    public void inputan() {
        System.out.print("Input Nama\t\t: ");
        name = userInput.nextLine();
        setName(name);


        //KONDISI NIM
        while(true){
            System.out.print("Input NIM\t\t: ");
            nim = userInput.nextLine();

            if (nim.length() == 15) {
                setNim(nim);
                break;
            }
            System.out.println("NIM TIDAK SESUAI");
        }//KONDISI PASSWORD
        while(true){
            System.out.print("Input password\t: ");
            password = userInput.nextLine();

            if (password.length() >= 8) {
                setPassword(password);
                break;
            }
            System.out.println("PASSWORD TIDAK SESUAI (8 KARAKTER ATAU LEBIH)");
        }
    }

    //display
    public void display()
    {
        System.out.println("Welcome, " + getName() + " to infotech");
        System.out.println("NAMA KAMU\t\t: " + getName());
        System.out.println("NIM KAMU\t\t: " + getNim());
        System.out.println("PASSWORD KAMU\t: " + getPassword());

    }
}//FUNGSI MAIN
public class Demo1 {
    public static void main(String[] args) {
        Mahasiswa anak = new Mahasiswa();
        System.out.println("===REGISTER===");
        anak.inputan();
        anak.display();

    }
}
