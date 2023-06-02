import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {
        Map<String, String> mahasiswa = new HashMap<>();
        mahasiswa.put("24060118130128", "Tryo Irtadlo");
        mahasiswa.put("24060118130129", "Random Guy");
        mahasiswa.put("24060118130130", "WHO");

        mahasiswa.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}