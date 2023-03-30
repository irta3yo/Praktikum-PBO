import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jari-jari : ");
        double jari = scan.nextDouble();

        Lingkaran l = new Lingkaran(jari);
        System.out.println("Luas lingkaran dengan jejari " + jari + " satuan adalah "+ l.hitungLuas());
    }
}