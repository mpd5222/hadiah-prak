import java.util.Scanner;
public class prima_ganjil_genap {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        int masuk,lanjut;
        String gangen, prime = "Tidak Prima";
        do {
            System.out.print("Masukkan Angka : ");
            masuk = baca.nextInt();
            if (masuk % 2 == 0) {
                gangen = "Genap";
            } else {
                gangen = "Ganjil";
            }
            if (masuk >= 2) {
                prime = "Prima";
                for (int x = 2; x < masuk; x++) {
                    if (masuk % x == 0) {
                        prime = "Tidak Prima";
                        break;
                    }
                }
            }
            System.out.println(masuk + " Termasuk Bilangan " + gangen + " dan " + prime);
            System.out.print("Lanjut (0/1)?");
            lanjut = baca.nextInt();
        } while (lanjut != 0);
        System.out.println("Bye Bye");
 
    }
}
