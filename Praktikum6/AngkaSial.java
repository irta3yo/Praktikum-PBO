public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// PERTANYAAN:
// *Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
// Jika eksepsi terjadi pada baris 7, maka baris 12 pada AngkaSial.java tidak akan dieksekusi. 
// Karena ketika terjadi eksepsi pada baris 7, maka aliran program akan langsung keluar dari metode cobaAngka() 
// dan dilanjutkan ke blok catch pada metode main(). 
// Selanjutnya, program akan menjalankan pernyataan yang ada di dalam blok catch 
// dan tidak akan melanjutkan eksekusi ke baris 12.
// *Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 
// Baris 21 pada AngkaSial.java tidak akan dieksekusi ketika program dijalankan karena pada saat method 
// cobaAngka dipanggil dengan argumen 13, program akan melempar sebuah 
// AngkaSialException dengan statement throw new AngkaSialException(); 
// pada baris 4, dan eksekusi program akan langsung beralih ke blok catch pada baris 15-18. 
// Sehingga, baris 21 akan dilewati.