import java.util.Scanner;

public class zakat {
    public static void main(String[] args) {
        // deklarasi variabel
        float gajiSebulan;
        float penghasilanLainSebulan;
        float kadarZakat = 0.025f;
        char ulang;

        // judul program
        System.out.println("Program sederhana menghitung zakat penghasilan");

        // program
        do {
            // input gaji perbulan
            @SuppressWarnings("resource")
            Scanner inputGaji = new Scanner(System.in);
            System.out.print("Masukkan gaji perbulan: ");
            gajiSebulan = inputGaji.nextFloat();
    
            // input penghasilan lain perbulan
            @SuppressWarnings("resource")
            Scanner inputPenghasilan = new Scanner(System.in);
            System.out.print("Masukkan penghasilan lain perbulan: ");
            penghasilanLainSebulan = inputPenghasilan.nextFloat();
    
            double total = gajiSebulan + penghasilanLainSebulan;
    
            // hasil eksekusi
            if (total > 6859394) {
                System.out.print("Kamu perlu membayar zakat sebesar: ");
                System.out.println(Math.floor(kadarZakat * total));
            }
            else {
                System.out.println("Kamu tidak perlu membayar zakat");
            }
    
            // tanya apakah pengguna ingin kalkulasi lagi
            @SuppressWarnings("resource")
            Scanner inginUlang = new Scanner(System.in);
            System.out.print("Kamu ingin mengkalkulasi lagi ? ");
            ulang = inginUlang.next().charAt(0);

        } while(ulang == 'y' || ulang == 'Y');

        // rasa terima kasih
        System.out.println("...TERIMA KASIH SUDAH MENGGUNAKAN PROGRAM INI :) ...");
    }
}