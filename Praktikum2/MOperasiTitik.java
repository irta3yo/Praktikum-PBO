package Praktikum2;

public class MOperasiTitik {
    public static void main(String[] args) {
        OperasiTitik t1 = new OperasiTitik(4, 4);


        System.out.println("titik(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("titik setelah refleksi sb X: " + "titik(" + t1.getAbsis() + ", " + t1.refleksiY(t1) + ")");
        System.out.println("titik setelah refleksi sb Y: " + "titik(" + t1.refleksiX(t1) + ", " + t1.getOrdinat() + ")");

        //refleksiSumbuX dan refleksiSumbuY modifier private (tidak bisa diakses)
        // System.out.println(t1.refleksiSumbuX(t1));
        // System.out.println(t1.refleksiSumbuY(t1));

        
    }
}