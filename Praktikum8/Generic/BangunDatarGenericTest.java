package Generic;

public class BangunDatarGenericTest{
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<>();

        bdg.set(lingkaran);
        System.out.println("keliling lingkaran: " + bdg.hitungKeliling());
        System.out.println("tipe generic: " + bdg.get().getClass().getName());
    }
}