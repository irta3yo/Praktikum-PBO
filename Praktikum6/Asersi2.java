class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = -1;
        assert(jariJari > 0) : "jari jari tidak boleh noll";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

// PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas? 
// Pernyataan assert digunakan untuk memastikan kondisi tertentu terpenuhi selama runtime, 
// dan dalam contoh ini, assert digunakan untuk memastikan bahwa nilai jari-jari lingkaran yang diberikan lebih besar dari nol. 
// Jika kondisi tersebut tidak terpenuhi, program akan menghasilkan pesan error yang ditentukan dalam pernyataan assert.
