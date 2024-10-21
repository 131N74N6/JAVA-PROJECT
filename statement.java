import java.util.Scanner;

public class statement {
    public static void main(String[] args) {
        // deklarasi variabel
        int nilai;

        // masukan nilai angka
        @SuppressWarnings("resource")
        Scanner inputNilai = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        nilai = inputNilai.nextInt();

        // penentuan
        if (nilai >= 90) {
            System.out.println("Nilai A");
        }
        else if (nilai >= 80 && nilai <= 89) {
            System.out.println("Nilai A-");
        }
        else if (nilai >= 70 && nilai <= 79) {
            System.out.println("Nilai B");
        }
        else if (nilai >= 65 && nilai <= 69) {
            System.out.println("Nilai B-");
        }
        else if (nilai >= 56 && nilai <= 64) {
            System.out.println("Nilai C");
        }
        else if (nilai >= 40 && nilai <= 55) {
            System.out.println("Nilai D");
        }
        else {
            System.out.println("Nilai E");
        }
    }
}
