package PolimorfismeInclusion2;

public class Programmer extends Pegawai{
    private int tunjangan = 450000;

    public Programmer(String nama) {
        super(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}